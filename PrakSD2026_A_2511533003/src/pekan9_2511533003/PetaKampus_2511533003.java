package pekan9_2511533003;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PetaKampus_2511533003 extends JFrame {

    private static final long serialVersionUID_3003 = 1L;
    private JPanel contentPane_3003;
    private JTextField hasilPencarian_3003;
    private JTextField nodeDikunjugi_3003;
    private JTextField textField_3003;

    Map<String, MyNode_2511533003> map_3003 = new HashMap<>();
    boolean done_3003 = false;

    JLabel lblLokasiTujuan_3003 = new JLabel("lokasi tujuan");

    JComboBox lokasiAwal_3003 = new JComboBox();

    // graph
    void initial_3003() {
        map_3003 = new HashMap<>();
        MyNode_2511533003 gedungPerkuliahan_3003 = new MyNode_2511533003(
            "Gedung Perkuliahan"
        );
        MyNode_2511533003 fakultas_3003 = new MyNode_2511533003("Fakultas");
        MyNode_2511533003 universitas_3003 = new MyNode_2511533003(
            "Universitas"
        );
        MyNode_2511533003 sekolah_3003 = new MyNode_2511533003("Sekolah");
        MyNode_2511533003 rumahSakit_3003 = new MyNode_2511533003(
            "Rumah Sakit"
        );
        MyNode_2511533003 mall_3003 = new MyNode_2511533003("Mall");
        MyNode_2511533003 tempatWisata_3003 = new MyNode_2511533003(
            "Tempat Wisata"
        );
        MyNode_2511533003 bandara_3003 = new MyNode_2511533003("Bandara");

        gedungPerkuliahan_3003.childs_3003.add(universitas_3003);
        gedungPerkuliahan_3003.childs_3003.add(tempatWisata_3003);
        gedungPerkuliahan_3003.childs_3003.add(fakultas_3003);

        fakultas_3003.childs_3003.add(gedungPerkuliahan_3003);
        fakultas_3003.childs_3003.add(tempatWisata_3003);

        tempatWisata_3003.childs_3003.add(gedungPerkuliahan_3003);
        tempatWisata_3003.childs_3003.add(fakultas_3003);
        tempatWisata_3003.childs_3003.add(sekolah_3003);
        tempatWisata_3003.childs_3003.add(rumahSakit_3003);

        rumahSakit_3003.childs_3003.add(tempatWisata_3003);
        rumahSakit_3003.childs_3003.add(mall_3003);

        sekolah_3003.childs_3003.add(universitas_3003);
        sekolah_3003.childs_3003.add(tempatWisata_3003);
        sekolah_3003.childs_3003.add(mall_3003);

        mall_3003.childs_3003.add(sekolah_3003);
        mall_3003.childs_3003.add(rumahSakit_3003);
        mall_3003.childs_3003.add(bandara_3003);

        bandara_3003.childs_3003.add(universitas_3003);
        bandara_3003.childs_3003.add(mall_3003);

        universitas_3003.childs_3003.add(gedungPerkuliahan_3003);
        universitas_3003.childs_3003.add(bandara_3003);

        map_3003.put("Gedung Perkuliahan", gedungPerkuliahan_3003);
        map_3003.put("Fakultas", fakultas_3003);
        map_3003.put("Universitas", universitas_3003);
        map_3003.put("Sekolah", sekolah_3003);
        map_3003.put("Rumah Sakit", rumahSakit_3003);
        map_3003.put("Mall", mall_3003);
        map_3003.put("Tempat Wisata", tempatWisata_3003);
        map_3003.put("Bandara", bandara_3003);
    }

    String route_3003 = "";
    int tahapan_3003 = 0;

    void bfs_3003(MyNode_2511533003 node_3003, String tujuan_3003) {
        tahapan_3003 = 0;
        Map<String, String> visited_3003 = new HashMap<>();
        Queue<MyNode_2511533003> queue_3003 = new LinkedList<>();
        queue_3003.add(node_3003);

        while (queue_3003.size() > 0) {
            tahapan_3003 += 1;
            MyNode_2511533003 temp_3003 = queue_3003.poll();
            if (visited_3003.get(temp_3003.label_3003) != null) {
                continue;
            }

            visited_3003.put(temp_3003.label_3003, temp_3003.label_3003);
            route_3003 += " " + temp_3003.label_3003 + " |";
            if (temp_3003.label_3003 == tujuan_3003) {
                break;
            }

            int childs_size_3003 = temp_3003.childs_3003.size();

            for (int i_3003 = 0; i_3003 < childs_size_3003; i_3003++) {
                queue_3003.add(temp_3003.childs_3003.get(i_3003));
            }
        }
    }

    void dfs_3003(MyNode_2511533003 node_3003, String tujuan_3003) {
        tahapan_3003 = 0;
        Map<String, String> visited_3003 = new HashMap<>();
        Stack<MyNode_2511533003> stack_3003 = new Stack<>();
        stack_3003.push(node_3003);

        while (stack_3003.size() > 0) {
            tahapan_3003 += 1;
            MyNode_2511533003 temp_3003 = stack_3003.pop();
            if (visited_3003.get(temp_3003.label_3003) != null) {
                continue;
            }

            visited_3003.put(temp_3003.label_3003, temp_3003.label_3003);
            route_3003 += " " + temp_3003.label_3003 + " |";
            if (temp_3003.label_3003 == tujuan_3003) {
                break;
            }

            int childs_size_3003 = temp_3003.childs_3003.size();
            for (int i_3003 = 0; i_3003 < childs_size_3003; i_3003++) {
                stack_3003.push(temp_3003.childs_3003.get(i_3003));
            }
        }
    }

    void reset_3003() {
        initial_3003();
        tahapan_3003 = 0;
        done_3003 = false;
        hasilPencarian_3003.setText("");
        nodeDikunjugi_3003.setText("");
        textField_3003.setText("");
        route_3003 = "";
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(
            new Runnable() {
                public void run() {
                    try {
                        PetaKampus_2511533003 frame_3003 =
                            new PetaKampus_2511533003();
                        frame_3003.setVisible(true);
                    } catch (Exception e_3003) {
                        e_3003.printStackTrace();
                    }
                }
            }
        );
    }

    /**
     * Create the frame.
     */
    public PetaKampus_2511533003() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 581, 480);
        contentPane_3003 = new JPanel();
        contentPane_3003.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane_3003);
        contentPane_3003.setLayout(null);

        JLabel lblIoj_3003 = new JLabel("lokasi awal");
        lblIoj_3003.setBounds(12, 0, 80, 17);
        contentPane_3003.add(lblIoj_3003);

        lblLokasiTujuan_3003.setBounds(12, 29, 93, 17);
        contentPane_3003.add(lblLokasiTujuan_3003);

        lokasiAwal_3003.setModel(
            new DefaultComboBoxModel(new String[] {
                "<pilih>",
                "Gedung Perkuliahan",
                "Fakultas",
                "Universitas",
                "Sekolah",
                "Rumah Sakit",
                "Mall",
                "Tempat Wisata",
                "Bandara",
            })
        );
        lokasiAwal_3003.setBounds(102, -5, 147, 26);
        contentPane_3003.add(lokasiAwal_3003);

        JComboBox lokasiTujuan_3003 = new JComboBox();
        lokasiTujuan_3003.setModel(
            new DefaultComboBoxModel(new String[] {
                "<pilih>",
                "Gedung Perkuliahan",
                "Fakultas",
                "Universitas",
                "Sekolah",
                "Rumah Sakit",
                "Mall",
                "Tempat Wisata",
                "Bandara",
            })
        );
        lokasiTujuan_3003.setBounds(102, 24, 147, 26);
        contentPane_3003.add(lokasiTujuan_3003);

        JButton dfsButton_3003 = new JButton("DFS");
        dfsButton_3003.addActionListener(e -> {
            int optionLokasiAwal_3003 = lokasiAwal_3003.getSelectedIndex();
            int optionLokasiTujuan_3003 = lokasiTujuan_3003.getSelectedIndex();
            if (
                optionLokasiAwal_3003 == 0 ||
                optionLokasiTujuan_3003 == 0 ||
                done_3003
            ) {
                return;
            }

            String awal_3003;
            if (optionLokasiAwal_3003 == 1) {
                awal_3003 = "Gedung Perkuliahan";
            } else if (optionLokasiAwal_3003 == 2) {
                awal_3003 = "Fakultas";
            } else if (optionLokasiAwal_3003 == 3) {
                awal_3003 = "Universitas";
            } else if (optionLokasiAwal_3003 == 4) {
                awal_3003 = "Sekolah";
            } else if (optionLokasiAwal_3003 == 5) {
                awal_3003 = "Rumah Sakit";
            } else if (optionLokasiAwal_3003 == 6) {
                awal_3003 = "Mall";
            } else if (optionLokasiAwal_3003 == 7) {
                awal_3003 = "Tempat Wisata";
            } else {
                awal_3003 = "Bandara";
            }

            String tujuan_3003;
            if (optionLokasiTujuan_3003 == 1) {
                tujuan_3003 = "Gedung Perkuliahan";
            } else if (optionLokasiTujuan_3003 == 2) {
                tujuan_3003 = "Fakultas";
            } else if (optionLokasiTujuan_3003 == 3) {
                tujuan_3003 = "Universitas";
            } else if (optionLokasiTujuan_3003 == 4) {
                tujuan_3003 = "Sekolah";
            } else if (optionLokasiTujuan_3003 == 5) {
                tujuan_3003 = "Rumah Sakit";
            } else if (optionLokasiTujuan_3003 == 6) {
                tujuan_3003 = "Mall";
            } else if (optionLokasiTujuan_3003 == 7) {
                tujuan_3003 = "Tempat Wisata";
            } else {
                tujuan_3003 = "Bandara";
            }

            initial_3003();
            dfs_3003(map_3003.get(awal_3003), tujuan_3003);
            hasilPencarian_3003.setText(tujuan_3003);
            nodeDikunjugi_3003.setText(route_3003);
            textField_3003.setText("" + tahapan_3003);

            done_3003 = true;
        });
        dfsButton_3003.setBounds(294, 24, 80, 27);
        contentPane_3003.add(dfsButton_3003);

        JButton bfsButton_3003 = new JButton("BFS");
        bfsButton_3003.setBounds(385, 24, 80, 27);
        contentPane_3003.add(bfsButton_3003);

        bfsButton_3003.addActionListener(e -> {
            int optionLokasiAwal_3003 = lokasiAwal_3003.getSelectedIndex();
            int optionLokasiTujuan_3003 = lokasiTujuan_3003.getSelectedIndex();
            if (
                optionLokasiAwal_3003 == 0 ||
                optionLokasiTujuan_3003 == 0 ||
                done_3003
            ) {
                return;
            }

            String awal_3003;
            if (optionLokasiAwal_3003 == 1) {
                awal_3003 = "Gedung Perkuliahan";
            } else if (optionLokasiAwal_3003 == 2) {
                awal_3003 = "Fakultas";
            } else if (optionLokasiAwal_3003 == 3) {
                awal_3003 = "Universitas";
            } else if (optionLokasiAwal_3003 == 4) {
                awal_3003 = "Sekolah";
            } else if (optionLokasiAwal_3003 == 5) {
                awal_3003 = "Rumah Sakit";
            } else if (optionLokasiAwal_3003 == 6) {
                awal_3003 = "Mall";
            } else if (optionLokasiAwal_3003 == 7) {
                awal_3003 = "Tempat Wisata";
            } else {
                awal_3003 = "Bandara";
            }

            String tujuan_3003;
            if (optionLokasiTujuan_3003 == 1) {
                tujuan_3003 = "Gedung Perkuliahan";
            } else if (optionLokasiTujuan_3003 == 2) {
                tujuan_3003 = "Fakultas";
            } else if (optionLokasiTujuan_3003 == 3) {
                tujuan_3003 = "Universitas";
            } else if (optionLokasiTujuan_3003 == 4) {
                tujuan_3003 = "Sekolah";
            } else if (optionLokasiTujuan_3003 == 5) {
                tujuan_3003 = "Rumah Sakit";
            } else if (optionLokasiTujuan_3003 == 6) {
                tujuan_3003 = "Mall";
            } else if (optionLokasiTujuan_3003 == 7) {
                tujuan_3003 = "Tempat Wisata";
            } else {
                tujuan_3003 = "Bandara";
            }

            initial_3003();
            bfs_3003(map_3003.get(awal_3003), tujuan_3003);
            hasilPencarian_3003.setText(tujuan_3003);
            nodeDikunjugi_3003.setText(route_3003);
            textField_3003.setText("" + tahapan_3003);

            done_3003 = true;
        });

        JButton resetButton_3003 = new JButton("RESET");
        resetButton_3003.setBounds(477, 24, 80, 27);
        contentPane_3003.add(resetButton_3003);
        resetButton_3003.addActionListener(e -> {
            reset_3003();
        });

        JTextArea txtrDwadwwd_3003 = new JTextArea();
        txtrDwadwwd_3003.setEditable(false);
        txtrDwadwwd_3003.setText(
            "Gedung Perkuliahan ---------------- Fakultas\n               |\\\t                                       |\n               |   \\                                               |                                     \n               |     \\____________________Tempat Wisata ----------Rumah Sakit\n               |                                                    |                                     |\n     Universitas  ------------------------- Sekolah --------------------- Mall\n               |                                                                                            |\n               |                                                                                            |\n               +---------------------------------Bandara------------------------+\n"
        );
        txtrDwadwwd_3003.setBounds(102, 105, 385, 176);
        contentPane_3003.add(txtrDwadwwd_3003);

        JLabel lblH_3003 = new JLabel("Hasil Pencarian");
        lblH_3003.setBounds(12, 293, 135, 17);
        contentPane_3003.add(lblH_3003);

        JLabel lblNodeDikunjungi_3003 = new JLabel("Node Dikunjungi");
        lblNodeDikunjungi_3003.setBounds(12, 341, 135, 17);
        contentPane_3003.add(lblNodeDikunjungi_3003);

        hasilPencarian_3003 = new JTextField();
        hasilPencarian_3003.setBounds(12, 308, 237, 21);
        contentPane_3003.add(hasilPencarian_3003);
        hasilPencarian_3003.setColumns(10);

        nodeDikunjugi_3003 = new JTextField();
        nodeDikunjugi_3003.setColumns(10);
        nodeDikunjugi_3003.setBounds(12, 361, 545, 21);
        contentPane_3003.add(nodeDikunjugi_3003);

        JLabel lblNodeDikunjungi_1_3003 = new JLabel("Node Dikunjungi");
        lblNodeDikunjungi_1_3003.setBounds(12, 383, 135, 17);
        contentPane_3003.add(lblNodeDikunjungi_1_3003);

        textField_3003 = new JTextField();
        textField_3003.setColumns(10);
        textField_3003.setBounds(12, 412, 237, 21);
        contentPane_3003.add(textField_3003);
    }
}
