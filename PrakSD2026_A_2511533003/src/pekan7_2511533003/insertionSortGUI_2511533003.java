package pekan7_2511533003;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class insertionSortGUI_2511533003 extends JFrame {

    private static final long serialVersionUID_3003 = 1L;

    private int[] array_3003;
    private JLabel[] labelArray_3003;
    private JButton stepButton_3003, resetButton_3003, setButton_3003;
    private JTextField inputField_3003;
    private JPanel panelArray_3003;
    private JTextArea stepArea_3003;

    private int i_3003 = 1,
        j_3003;
    private boolean sorting_3003 = false;
    private int stepCount_3003 = 1;

    private JPanel contentPane_3003;

    public insertionSortGUI_2511533003() {
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
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                this,
                "Masukkan Dengan Angka Yang Dipisahkan " + "dengan Koma!",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        i_3003 = 1;
        stepCount_3003 = 1;
        sorting_3003 = true;
        stepButton_3003.setEnabled(true);
        stepArea_3003.setText("");
        panelArray_3003.removeAll();
        labelArray_3003 = new JLabel[array_3003.length];
        for (int k_3003 = 0; k_3003 < array_3003.length; k_3003++) {
            labelArray_3003[k_3003] = new JLabel(
                String.valueOf(array_3003[k_3003])
            );
            labelArray_3003[k_3003].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_3003[k_3003].setBorder(
                BorderFactory.createLineBorder(Color.BLACK)
            );
            labelArray_3003[k_3003].setPreferredSize(new Dimension(50, 50));
            labelArray_3003[k_3003].setHorizontalAlignment(
                SwingConstants.CENTER
            );
            panelArray_3003.add(labelArray_3003[k_3003]);
        }

        panelArray_3003.revalidate();
        panelArray_3003.repaint();
    }

    private void performStep_3003() {
        if (i_3003 < array_3003.length && sorting_3003) {
            int key_3003 = array_3003[i_3003];
            j_3003 = i_3003 - 1;

            StringBuilder stepLog_3003 = new StringBuilder();
            stepLog_3003
                .append("Langkah ")
                .append(stepCount_3003)
                .append(": Memasukkan ")
                .append(key_3003)
                .append("\n");

            while (j_3003 >= 0 && array_3003[j_3003] > key_3003) {
                array_3003[j_3003 + 1] = array_3003[j_3003];
                j_3003--;
            }
            array_3003[j_3003 + 1] = key_3003;

            updateLabels_3003();
            stepLog_3003
                .append("Hasil : ")
                .append(arrayToString_3003(array_3003))
                .append("\n\n");
            stepArea_3003.append(stepLog_3003.toString());

            i_3003++;
            stepCount_3003++;

            if (i_3003 == array_3003.length) {
                sorting_3003 = false;
                stepButton_3003.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Sorting Selesai");
            }
        }
    }

    private void updateLabels_3003() {
        for (int k_3003 = 0; k_3003 < array_3003.length; k_3003++) {
            labelArray_3003[k_3003].setText(String.valueOf(array_3003[k_3003]));
        }
    }

    private String arrayToString_3003(int[] arr_3003) {
        StringBuilder sb_3003 = new StringBuilder();
        for (int k_3003 = 0; k_3003 < array_3003.length; k_3003++) {
            sb_3003.append(arr_3003[k_3003]);
            if (k_3003 < arr_3003.length - 1) sb_3003.append(", ");
        }

        return sb_3003.toString();
    }

    private void reset_3003() {
        inputField_3003.setText("");
        panelArray_3003.removeAll();
        panelArray_3003.revalidate();
        panelArray_3003.repaint();
        stepArea_3003.setText("");
        stepButton_3003.setEnabled(false);
        sorting_3003 = false;
        i_3003 = 1;
        stepCount_3003 = 1;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            insertionSortGUI_2511533003 gui_3003 =
                new insertionSortGUI_2511533003();
            gui_3003.setVisible(true);
        });
    }
}
