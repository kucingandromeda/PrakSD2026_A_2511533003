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

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField hasilPencarian;
    private JTextField nodeDikunjugi;
    private JTextField textField;

    Map<String, MyNode_2511533003> map_3003 = new HashMap<>();
    boolean done_3003 = false;

    JLabel lblLokasiTujuan = new JLabel("lokasi tujuan");

    JComboBox lokasiAwal = new JComboBox();

    // graph
    void initial_3003() {
        map_3003 = new HashMap<>();
        MyNode_2511533003 gedungPerkuliahan = new MyNode_2511533003(
            "Gedung Perkuliahan"
        );
        MyNode_2511533003 fakultas = new MyNode_2511533003("Fakultas");
        MyNode_2511533003 universitas = new MyNode_2511533003("Universitas");
        MyNode_2511533003 sekolah = new MyNode_2511533003("Sekolah");
        MyNode_2511533003 rumahSakit = new MyNode_2511533003("Rumah Sakit");
        MyNode_2511533003 mall = new MyNode_2511533003("Mall");
        MyNode_2511533003 tempatWisata = new MyNode_2511533003("Tempat Wisata");
        MyNode_2511533003 bandara = new MyNode_2511533003("Bandara");

        gedungPerkuliahan.childs_3003.add(universitas);
        gedungPerkuliahan.childs_3003.add(tempatWisata);
        gedungPerkuliahan.childs_3003.add(fakultas);

        fakultas.childs_3003.add(gedungPerkuliahan);
        fakultas.childs_3003.add(tempatWisata);

        tempatWisata.childs_3003.add(gedungPerkuliahan);
        tempatWisata.childs_3003.add(fakultas);
        tempatWisata.childs_3003.add(sekolah);
        tempatWisata.childs_3003.add(rumahSakit);

        rumahSakit.childs_3003.add(tempatWisata);
        rumahSakit.childs_3003.add(mall);

        sekolah.childs_3003.add(universitas);
        sekolah.childs_3003.add(tempatWisata);
        sekolah.childs_3003.add(mall);

        mall.childs_3003.add(sekolah);
        mall.childs_3003.add(rumahSakit);
        mall.childs_3003.add(bandara);

        bandara.childs_3003.add(universitas);
        bandara.childs_3003.add(mall);

        universitas.childs_3003.add(gedungPerkuliahan);
        universitas.childs_3003.add(bandara);

        map_3003.put("Gedung Perkuliahan", gedungPerkuliahan);
        map_3003.put("Fakultas", fakultas);
        map_3003.put("Universitas", universitas);
        map_3003.put("Sekolah", sekolah);
        map_3003.put("Rumah Sakit", rumahSakit);
        map_3003.put("Mall", mall);
        map_3003.put("Tempat Wisata", tempatWisata);
        map_3003.put("Bandara", bandara);
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

            int childs_size = temp_3003.childs_3003.size();

            for (int i_3003 = 0; i_3003 < childs_size; i_3003++) {
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

            int childs_size = temp_3003.childs_3003.size();
            for (int i_3003 = 0; i_3003 < childs_size; i_3003++) {
                stack_3003.push(temp_3003.childs_3003.get(i_3003));
            }
        }
    }

    void reset_3003() {
        initial_3003();
        tahapan_3003 = 0;
        done_3003 = false;
        hasilPencarian.setText("");
        nodeDikunjugi.setText("");
        textField.setText("");
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
                        PetaKampus_2511533003 frame =
                            new PetaKampus_2511533003();
                        frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
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
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblIoj = new JLabel("lokasi awal");
        lblIoj.setBounds(12, 0, 80, 17);
        contentPane.add(lblIoj);

        lblLokasiTujuan.setBounds(12, 29, 93, 17);
        contentPane.add(lblLokasiTujuan);

        lokasiAwal.setModel(
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
        lokasiAwal.setBounds(102, -5, 147, 26);
        contentPane.add(lokasiAwal);

        JComboBox lokasiTujuan = new JComboBox();
        lokasiTujuan.setModel(
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
        lokasiTujuan.setBounds(102, 24, 147, 26);
        contentPane.add(lokasiTujuan);

        JButton dfsButton = new JButton("DFS");
        dfsButton.addActionListener(e -> {
            int optionLokasiAwal_3003 = lokasiAwal.getSelectedIndex();
            int optionLokasiTujuan_3003 = lokasiTujuan.getSelectedIndex();
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
            hasilPencarian.setText(tujuan_3003);
            nodeDikunjugi.setText(route_3003);
            textField.setText("" + tahapan_3003);

            done_3003 = true;
        });
        dfsButton.setBounds(294, 24, 80, 27);
        contentPane.add(dfsButton);

        JButton bfsButton = new JButton("BFS");
        bfsButton.setBounds(385, 24, 80, 27);
        contentPane.add(bfsButton);

        bfsButton.addActionListener(e -> {
            int optionLokasiAwal_3003 = lokasiAwal.getSelectedIndex();
            int optionLokasiTujuan_3003 = lokasiTujuan.getSelectedIndex();
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
            hasilPencarian.setText(tujuan_3003);
            nodeDikunjugi.setText(route_3003);
            textField.setText("" + tahapan_3003);

            done_3003 = true;
        });

        JButton resetButton = new JButton("RESET");
        resetButton.setBounds(477, 24, 80, 27);
        contentPane.add(resetButton);
        resetButton.addActionListener(e -> {
            reset_3003();
        });

        JTextArea txtrDwadwwd = new JTextArea();
        txtrDwadwwd.setEditable(false);
        txtrDwadwwd.setText(
            "Gedung Perkuliahan ---------------- Fakultas\n               |\\\t                                       |\n               |   \\                                               |                                     \n               |     \\____________________Tempat Wisata ----------Rumah Sakit\n               |                                                    |                                     |\n     Universitas  ------------------------- Sekolah --------------------- Mall\n               |                                                                                            |\n               |                                                                                            |\n               +---------------------------------Bandara------------------------+\n"
        );
        txtrDwadwwd.setBounds(102, 105, 385, 176);
        contentPane.add(txtrDwadwwd);

        JLabel lblH = new JLabel("Hasil Pencarian");
        lblH.setBounds(12, 293, 135, 17);
        contentPane.add(lblH);

        JLabel lblNodeDikunjungi = new JLabel("Node Dikunjungi");
        lblNodeDikunjungi.setBounds(12, 341, 135, 17);
        contentPane.add(lblNodeDikunjungi);

        hasilPencarian = new JTextField();
        hasilPencarian.setBounds(12, 308, 237, 21);
        contentPane.add(hasilPencarian);
        hasilPencarian.setColumns(10);

        nodeDikunjugi = new JTextField();
        nodeDikunjugi.setColumns(10);
        nodeDikunjugi.setBounds(12, 361, 545, 21);
        contentPane.add(nodeDikunjugi);

        JLabel lblNodeDikunjungi_1 = new JLabel("Node Dikunjungi");
        lblNodeDikunjungi_1.setBounds(12, 383, 135, 17);
        contentPane.add(lblNodeDikunjungi_1);

        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(12, 412, 237, 21);
        contentPane.add(textField);
    }
}
