package pekan7_2511533003;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MahasiswaSortingGUI_2511533003 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textFieldNama_3003;
    private JTextField textFieldNim_3003;
    private JTextField textFieldProdi_3003;
    private JLabel lblProgramStudi;

    JTextArea textAreaMahasiswa_3003;

    private Stack<Mahasiswa_2511533003> mahasiswa_list_3003 = new Stack<
        Mahasiswa_2511533003
    >();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(
            new Runnable() {
                public void run() {
                    try {
                        MahasiswaSortingGUI_2511533003 frame =
                            new MahasiswaSortingGUI_2511533003();
                        frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        );
    }

    // tambahkan
    public void tambahkanMahasiswa_3003() {
        String nama_3003 = textFieldNama_3003.getText().trim();
        textFieldNama_3003.setText("");

        String nim_3003 = textFieldNim_3003.getText().trim();
        textFieldNim_3003.setText("");

        String prodi_3003 = textFieldProdi_3003.getText().trim();
        textFieldProdi_3003.setText("");

        mahasiswa_list_3003.push(
            new Mahasiswa_2511533003(nama_3003, nim_3003, prodi_3003)
        );

        textAreaMahasiswa_3003.setText(mahasiswa_list_3003.toString());
    }

    // hapus
    public void HapusMahasiswa_3003() {
        mahasiswa_list_3003 = new Stack<Mahasiswa_2511533003>();
        history_3003 = new ArrayList<String>();
        bubbleI_3003 = 0;
        selectionI_3003 = 0;
        insertionI_3003 = 1;

        textAreaMahasiswa_3003.setText("");
        areaStep_3003.setText("");
        sortingStatus_3003 = false;
    }

    // Sorting
    private JButton btnStep;
    private JTextArea areaStep_3003;
    private ArrayList<String> history_3003 = new ArrayList<String>();
    private boolean sortingStatus_3003 = false;

    int bubbleI_3003 = 0;

    public void bubbleSort_3003() {
        if (!sortingStatus_3003) return;

        int n = mahasiswa_list_3003.size();

        if (bubbleI_3003 >= n) {
            sortingStatus_3003 = false;
            JOptionPane.showMessageDialog(this, "bubble Sort Selesai");
            return;
        }

        for (int j_3003 = 0; j_3003 < n - bubbleI_3003 - 1; j_3003++) {
            Mahasiswa_2511533003 left_mahasiswa_3003 = mahasiswa_list_3003.get(
                j_3003
            );
            String right_3003 = left_mahasiswa_3003
                .getNama_3003()
                .substring(0, 1);

            Mahasiswa_2511533003 right_mahasiswa_3003 = mahasiswa_list_3003.get(
                j_3003 + 1
            );
            String left_3003 = right_mahasiswa_3003
                .getNama_3003()
                .substring(0, 1);

            if (right_3003.compareToIgnoreCase(left_3003) > 0) {
                Mahasiswa_2511533003 temp_3003 = mahasiswa_list_3003.get(
                    j_3003
                );

                mahasiswa_list_3003.set(
                    j_3003,
                    mahasiswa_list_3003.get(j_3003 + 1)
                );
                mahasiswa_list_3003.set(j_3003 + 1, temp_3003);
            }
        }

        bubbleI_3003 += 1;

        areaStep_3003.setText("");
        history_3003.add(mahasiswa_list_3003.toString());
        String display_3003 = "";
        for (int k_3003 = 0; k_3003 < history_3003.size(); k_3003++) {
            display_3003 +=
                "pass " + k_3003 + " " + history_3003.get(k_3003) + "\n";
        }
        areaStep_3003.setText(display_3003);
    }

    int selectionI_3003 = 0;

    public void selectionSort_3003() {
        if (!sortingStatus_3003) return;

        int n = mahasiswa_list_3003.size();

        if (selectionI_3003 >= n) {
            sortingStatus_3003 = false;
            JOptionPane.showMessageDialog(this, "Selection Sort Selesai");
            return;
        }

        int minIndex_3003 = selectionI_3003;

        int j_3003 = minIndex_3003 + 1;
        while (true) {
            if (j_3003 >= n) {
                break;
            }

            Mahasiswa_2511533003 mahasiswa_left_3003 = mahasiswa_list_3003.get(
                j_3003
            );

            String left_3003 = mahasiswa_left_3003
                .getNama_3003()
                .substring(0, 1);

            Mahasiswa_2511533003 mahasiswa_right_3003 = mahasiswa_list_3003.get(
                minIndex_3003
            );

            String right_3003 = mahasiswa_right_3003
                .getNama_3003()
                .substring(0, 1);

            if (left_3003.compareToIgnoreCase(right_3003) <= 0) {
                minIndex_3003 = j_3003;
            }

            j_3003 += 1;
        }

        Mahasiswa_2511533003 minimum_mahasiswa_3003 = mahasiswa_list_3003.get(
            minIndex_3003
        );

        Mahasiswa_2511533003 temp_3003 = mahasiswa_list_3003.get(
            selectionI_3003
        );

        mahasiswa_list_3003.set(selectionI_3003, minimum_mahasiswa_3003);
        mahasiswa_list_3003.set(minIndex_3003, temp_3003);
        selectionI_3003 += 1;

        areaStep_3003.setText("");
        history_3003.add(mahasiswa_list_3003.toString());
        String display_3003 = "";
        for (int k_3003 = 0; k_3003 < history_3003.size(); k_3003++) {
            display_3003 +=
                "pass " + k_3003 + " " + history_3003.get(k_3003) + "\n";
        }
        areaStep_3003.setText(display_3003);
    }

    int insertionI_3003 = 1;

    public void insertionSort() {
        if (!sortingStatus_3003) return;

        int n = mahasiswa_list_3003.size();

        if (insertionI_3003 >= n) {
            sortingStatus_3003 = false;
            JOptionPane.showMessageDialog(this, "Insertion Sort Selesai");
            return;
        }

        Mahasiswa_2511533003 key_3003 = mahasiswa_list_3003.get(
            insertionI_3003
        );
        int j_3003 = insertionI_3003 - 1;

        while (j_3003 >= 0) {
            Mahasiswa_2511533003 left_3003 = mahasiswa_list_3003.get(j_3003);

            String keyStr_3003 = key_3003.getNama_3003().substring(0, 1);
            String leftStr_3003 = left_3003.getNama_3003().substring(0, 1);

            if (keyStr_3003.compareToIgnoreCase(leftStr_3003) <= 0) {
                mahasiswa_list_3003.set(j_3003 + 1, left_3003);
                j_3003 -= 1;
            } else {
                break;
            }
        }

        mahasiswa_list_3003.set(j_3003 + 1, key_3003);
        insertionI_3003 += 1;

        areaStep_3003.setText("");
        history_3003.add(mahasiswa_list_3003.toString());
        String display_3003 = "";
        for (int k_3003 = 0; k_3003 < history_3003.size(); k_3003++) {
            display_3003 +=
                "pass " + k_3003 + " " + history_3003.get(k_3003) + "\n";
        }
        areaStep_3003.setText(display_3003);
    }

    /**
     * Create the frame.
     */
    public MahasiswaSortingGUI_2511533003() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 580, 537);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textFieldNama_3003 = new JTextField();
        textFieldNama_3003.setBounds(12, 27, 174, 21);
        contentPane.add(textFieldNama_3003);
        textFieldNama_3003.setColumns(10);

        JLabel lblNamaSiswa = new JLabel("Nama Mahasiswa");
        lblNamaSiswa.setBounds(12, 12, 114, 17);
        contentPane.add(lblNamaSiswa);

        textFieldNim_3003 = new JTextField();
        textFieldNim_3003.setColumns(10);
        textFieldNim_3003.setBounds(198, 27, 192, 21);
        contentPane.add(textFieldNim_3003);

        JLabel lblNimMahasiswa = new JLabel("Nim Mahasiswa");
        lblNimMahasiswa.setBounds(198, 12, 114, 17);
        contentPane.add(lblNimMahasiswa);

        textFieldProdi_3003 = new JTextField();
        textFieldProdi_3003.setColumns(10);
        textFieldProdi_3003.setBounds(402, 27, 166, 21);
        contentPane.add(textFieldProdi_3003);

        lblProgramStudi = new JLabel("Program studi");
        lblProgramStudi.setBounds(402, 12, 114, 17);
        contentPane.add(lblProgramStudi);

        JButton btnTambahkan = new JButton("Tambahkan");
        btnTambahkan.setBounds(12, 60, 127, 27);
        contentPane.add(btnTambahkan);
        btnTambahkan.addActionListener(e_3003 -> tambahkanMahasiswa_3003());

        JButton btnMulai = new JButton("Mulai");
        btnMulai.setBounds(12, 99, 127, 27);
        contentPane.add(btnMulai);
        btnMulai.addActionListener(e -> {
            if (sortingStatus_3003) return;

            history_3003 = new ArrayList<String>();
            sortingStatus_3003 = true;
            areaStep_3003.setText("");
            history_3003.add(mahasiswa_list_3003.toString());
            String display_3003 = "";
            for (int k_3003 = 0; k_3003 < history_3003.size(); k_3003++) {
                display_3003 +=
                    "pass " + k_3003 + " " + history_3003.get(k_3003) + "\n";
            }
            areaStep_3003.setText(display_3003);
        });

        JComboBox comboBox = new JComboBox();
        comboBox.setModel(
            new DefaultComboBoxModel(new String[] {
                "Insertion Sort",
                "SelectionSort",
                "Bubble Sort",
            })
        );
        comboBox.setBounds(290, 60, 114, 26);
        contentPane.add(comboBox);

        JButton btnHapus = new JButton("Hapus");
        btnHapus.setBounds(151, 60, 127, 27);
        contentPane.add(btnHapus);
        btnHapus.addActionListener(e_3003 -> HapusMahasiswa_3003());

        textAreaMahasiswa_3003 = new JTextArea();
        textAreaMahasiswa_3003.setFont(new Font("Dialog", Font.PLAIN, 16));
        textAreaMahasiswa_3003.setBounds(12, 138, 556, 27);
        contentPane.add(textAreaMahasiswa_3003);

        btnStep = new JButton("Step");
        btnStep.setBounds(151, 99, 127, 27);
        contentPane.add(btnStep);
        btnStep.addActionListener(e -> {
            int option_3003 = comboBox.getSelectedIndex();
            if (option_3003 == 0) {
                insertionSort();
            } else if (option_3003 == 1) {
                selectionSort_3003();
            } else {
                bubbleSort_3003();
            }
        });

        areaStep_3003 = new JTextArea();
        areaStep_3003.setFont(new Font("Dialog", Font.PLAIN, 16));
        areaStep_3003.setBounds(12, 177, 556, 305);
        contentPane.add(areaStep_3003);
    }
}
