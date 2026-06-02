package pekan8_2511533003;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MergeSortGUI_2511533003 extends JFrame {

    private static final long serialVersionUID_3003 = 1L;

    private int[] array_3003;
    private JLabel[] labelArray_3003;
    private JButton stepButton_3003, resetButton_3003, setButton_3003;
    private JTextField inputField_3003;
    private JPanel panelArray_3003;
    private JTextArea stepArea_3003;

    private int i_3003, j_3003, k_3003;
    private int left_3003, mid_3003, right_3003;

    private int[] temp_3003;
    private boolean isMerging_3003 = false;
    private boolean copying_3003 = false;

    private boolean sorting_3003 = false;
    private int stepCount_3003 = 1;

    private JPanel contentPane_3003;

    private Queue<int[]> mergeQueue_3003 = new LinkedList<>();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(
            new Runnable() {
                public void run() {
                    try {
                        MergeSortGUI_2511533003 frame_3003 =
                            new MergeSortGUI_2511533003();
                        frame_3003.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        );
    }

    public MergeSortGUI_2511533003() {
        setTitle("Insertion Sort Langkah per langkah");
        setSize(750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel inputPanel_3003 = new JPanel(new FlowLayout());
        inputField_3003 = new JTextField(30);
        setButton_3003 = new JButton("Set Array");
        inputPanel_3003.add(new JLabel("Masukkan Angka(Pisahkan dengan koma)"));
        inputPanel_3003.add(inputField_3003);
        inputPanel_3003.add(setButton_3003);

        panelArray_3003 = new JPanel();
        panelArray_3003.setLayout(new FlowLayout());

        JPanel controlPanel_3003 = new JPanel();
        stepButton_3003 = new JButton("Langkah Selanjutnya");
        resetButton_3003 = new JButton("reset");
        stepButton_3003.setEnabled(false);
        controlPanel_3003.add(stepButton_3003);
        controlPanel_3003.add(resetButton_3003);

        stepArea_3003 = new JTextArea(8, 60);
        stepArea_3003.setEditable(false);
        stepArea_3003.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane_3003 = new JScrollPane(stepArea_3003);

        add(inputPanel_3003, BorderLayout.NORTH);
        add(panelArray_3003, BorderLayout.CENTER);
        add(controlPanel_3003, BorderLayout.SOUTH);
        add(scrollPane_3003, BorderLayout.EAST);

        setButton_3003.addActionListener(e -> setArrayFromInput_3003());
        stepButton_3003.addActionListener(e -> performStep_3003());
        resetButton_3003.addActionListener(e -> reset_3003());
    }

    private void setArrayFromInput_3003() {
        String text_3003 = inputField_3003.getText().trim();
        if (text_3003.isEmpty()) return;
        String[] parts_3003 = text_3003.split(",");
        array_3003 = new int[parts_3003.length];

        try {
            for (int k_3003 = 0; k_3003 < parts_3003.length; k_3003++) {
                array_3003[k_3003] = Integer.parseInt(
                    parts_3003[k_3003].trim()
                );
            }
        } catch (NumberFormatException e_3003) {
            JOptionPane.showMessageDialog(
                this,
                "Masukkan Hanya Angka " + "Yang dipisahkan koma!",
                "ERROR",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        labelArray_3003 = new JLabel[array_3003.length];
        panelArray_3003.removeAll();
        for (int k_3003 = 0; k_3003 < array_3003.length; k_3003++) {
            labelArray_3003[k_3003] = new JLabel(
                String.valueOf(array_3003[k_3003])
            );
            labelArray_3003[k_3003].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_3003[k_3003].setOpaque(true);
            labelArray_3003[k_3003].setBackground(Color.WHITE);
            labelArray_3003[k_3003].setBorder(
                BorderFactory.createLineBorder(Color.BLACK)
            );
            labelArray_3003[k_3003].setPreferredSize(new Dimension(50, 50));
            labelArray_3003[k_3003].setHorizontalAlignment(
                SwingConstants.CENTER
            );

            panelArray_3003.add(labelArray_3003[k_3003]);
        }

        mergeQueue_3003.clear();
        generateMergeSteps_3003(0, array_3003.length - 1);
        stepButton_3003.setEnabled(true);
        stepArea_3003.setText("");
        stepCount_3003 = 1;
        isMerging_3003 = false;
        panelArray_3003.revalidate();
        panelArray_3003.repaint();
    }

    private void generateMergeSteps_3003(int left_3003, int right_3003) {
        if (left_3003 < right_3003) {
            int mid_3003 = left_3003 + (right_3003 - left_3003) / 2;

            generateMergeSteps_3003(left_3003, mid_3003);
            generateMergeSteps_3003(mid_3003 + 1, right_3003);

            mergeQueue_3003.add(new int[] { left_3003, mid_3003, right_3003 });
        }
    }

    private void performStep_3003() {
        resetHighlights_3003();

        if (!isMerging_3003 && !mergeQueue_3003.isEmpty()) {
            int[] range_3003 = mergeQueue_3003.poll();
            left_3003 = range_3003[0];
            mid_3003 = range_3003[1];
            right_3003 = range_3003[2];
            temp_3003 = new int[right_3003 - left_3003 + 1];

            i_3003 = left_3003;
            j_3003 = mid_3003 + 1;
            k_3003 = 0;

            copying_3003 = false;
            isMerging_3003 = true;
            stepArea_3003.append(
                "Langkah " +
                    stepCount_3003++ +
                    ": Mulai merge dari " +
                    left_3003 +
                    " ke " +
                    right_3003 +
                    "\n"
            );
            return;
        }

        if (isMerging_3003 && !copying_3003) {
            if (i_3003 <= mid_3003 && j_3003 <= right_3003) {
                labelArray_3003[i_3003].setBackground(Color.CYAN);
                labelArray_3003[j_3003].setBackground(Color.CYAN);

                if (array_3003[i_3003] <= array_3003[j_3003]) {
                    temp_3003[k_3003++] = array_3003[i_3003++];
                } else {
                    temp_3003[k_3003++] = array_3003[j_3003++];
                }

                stepArea_3003.append(
                    "Langkah " +
                        stepCount_3003++ +
                        ": Bandingkan dan salin elemen\n"
                );

                return;
            } else if (i_3003 <= mid_3003) {
                temp_3003[k_3003++] = array_3003[i_3003++];

                stepArea_3003.append(
                    "Langkah " + stepCount_3003++ + ": Salin sisa kiri\n"
                );

                return;
            } else if (j_3003 <= right_3003) {
                temp_3003[k_3003++] = array_3003[j_3003++];

                stepArea_3003.append(
                    "Langkah " + stepCount_3003++ + ": Salin sisa kanan\n"
                );

                return;
            } else {
                copying_3003 = true;
                k_3003 = 0;
                return;
            }
        }

        if (copying_3003 && k_3003 < temp_3003.length) {
            array_3003[left_3003 + k_3003] = temp_3003[k_3003];
            labelArray_3003[left_3003 + k_3003].setText(
                String.valueOf(temp_3003[k_3003])
            );
            labelArray_3003[left_3003 + k_3003].setBackground(Color.GREEN);
            k_3003++;

            stepArea_3003.append(
                "Langkah " + stepCount_3003++ + ": Tempelkan ke array utama\n"
            );
            return;
        }

        if (copying_3003 && k_3003 == temp_3003.length) {
            isMerging_3003 = false;
            copying_3003 = false;
        }

        if (mergeQueue_3003.isEmpty() && !isMerging_3003) {
            stepArea_3003.append("Selesai.\n");
            stepButton_3003.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
        }
    }

    private void reset_3003() {
        inputField_3003.setText("");
        panelArray_3003.removeAll();
        panelArray_3003.revalidate();
        panelArray_3003.repaint();
        stepArea_3003.setText("");
        stepButton_3003.setEnabled(false);
        mergeQueue_3003.clear();
        isMerging_3003 = false;
        copying_3003 = false;
        stepCount_3003 = 1;
    }

    private void resetHighlights_3003() {
        if (labelArray_3003 == null) return;

        for (JLabel label_3003 : labelArray_3003) {
            label_3003.setBackground(Color.WHITE);
        }
    }
}
