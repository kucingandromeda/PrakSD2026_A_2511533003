package pekan5_2511533003;

import java.util.Scanner;

public class RumahSakit_2511533003 {

    static int counter_3003 = 1;

    public static Pasien_2511533003 insertAtTail_3003(
        Pasien_2511533003 head_3003
    ) {
        Scanner sc_3003 = new Scanner(System.in);

        System.out.print("Masukkan Nama Pasien: ");
        String name_pasien_3003 = sc_3003.nextLine();
        System.out.print("Masukkan keluhan: ");
        String keluhan_3003 = sc_3003.nextLine();

        int antrian_3003 = counter_3003;
        counter_3003 += 1;
        System.out.println(
            "pasien berhasil di daftarkan! Nomor Antrian " + antrian_3003
        );

        Pasien_2511533003 insert_3003 = new Pasien_2511533003(
            name_pasien_3003,
            keluhan_3003,
            antrian_3003,
            null
        );

        if (head_3003 == null) {
            return insert_3003;
        }

        Pasien_2511533003 pre_head_3003 = head_3003;
        while (true) {
            if (pre_head_3003.next_3003 == null) {
                pre_head_3003.next_3003 = insert_3003;
                break;
            }

            pre_head_3003 = pre_head_3003.next_3003;
        }

        return head_3003;
    }

    public static Pasien_2511533003 deleteHead_3003(
        Pasien_2511533003 head_3003
    ) {
        if (head_3003 == null) {
            System.out.println("pasien kosong");
            return null;
        }

        Pasien_2511533003 pre_head_3003 = head_3003;
        System.out.println(
            "pasien antrian: " + pre_head_3003.getNoAntrian_3003()
        );
        System.out.println("bernama: " + pre_head_3003.getName_3003());
        System.out.println("keluhan: " + pre_head_3003.getKeluhan_3003());
        System.out.println("telah dipanggil");

        return head_3003.next_3003;
    }

    public static Pasien_2511533003 display_3003(Pasien_2511533003 head_3003) {
        Pasien_2511533003 pre_head_3003 = head_3003;
        if (pre_head_3003 == null) {
            System.out.println("Pasien Kosong");
            return null;
        }

        while (true) {
            if (pre_head_3003 == null) {
                break;
            }

            System.out.println(
                "pasien antrian: " + pre_head_3003.getNoAntrian_3003()
            );
            System.out.println("bernama: " + pre_head_3003.getName_3003());
            System.out.println(
                "keluhan: " + pre_head_3003.getKeluhan_3003() + "\n"
            );

            pre_head_3003 = pre_head_3003.next_3003;
        }

        return head_3003;
    }

    public static Pasien_2511533003 search_3003(Pasien_2511533003 head_3003) {
        Pasien_2511533003 pre_head_3003 = head_3003;
        if (pre_head_3003 == null) {
            System.out.println("Pasien Kosong");
            return null;
        }

        Scanner sc_3003 = new Scanner(System.in);

        System.out.print("Masukkan Nama Pasien yang ingin dicari: ");
        String dicari_3003 = sc_3003.nextLine();

        while (true) {
            if (pre_head_3003 == null) {
                System.out.println(
                    "pasien bernama " + dicari_3003 + " tidak ditemukan"
                );
                break;
            }

            String name_3003 = pre_head_3003.getName_3003();

            if (dicari_3003.equalsIgnoreCase(name_3003)) {
                System.out.println(
                    "pasien bernama " + dicari_3003 + " ditemukan"
                );
                break;
            } else {
                pre_head_3003 = pre_head_3003.next_3003;
            }
        }

        return head_3003;
    }

    public static Pasien_2511533003 StatusAntrian(Pasien_2511533003 head_3003) {
        Pasien_2511533003 pre_head_3003 = head_3003;
        if (pre_head_3003 == null) {
            System.out.println("Pasien Kosong");
            return null;
        }

        int counting_3003 = 0;
        while (true) {
            if (pre_head_3003 == null) {
                break;
            }
            counting_3003 += 1;

            pre_head_3003 = pre_head_3003.next_3003;
        }

        System.out.println("Panjang Antrean => " + counting_3003);
        System.out.println("pasien antrian: " + head_3003.getNoAntrian_3003());
        System.out.println("Informasi Pasien Terdepan");
        System.out.println("bernama: " + head_3003.getName_3003());
        System.out.println("keluhan: " + head_3003.getKeluhan_3003() + "\n");

        return head_3003;
    }

    public static void main(String[] args) {
        Pasien_2511533003 head_3003 = null;
        Scanner sc_3003 = new Scanner(System.in);
        while (true) {
            System.out.println(
                "\n=== Antrian Rumah Sakit NIM: 2511533003  ==="
            );
            System.out.println("1. Daftarkan Pasien     (Insert)");
            System.out.println("2. Panggil Pasien       (Delete Head)");
            System.out.println("3. Tampilkan Antrian    (Display)");
            System.out.println("4. Cari Pasien          (Search)");
            System.out.println("5. Cek Status Antrian ");
            System.out.println("6. Keluar ");
            System.out.print("pilihan: ");
            int opsi_3003 = sc_3003.nextInt();

            System.out.println();

            if (opsi_3003 == 1) {
                head_3003 = insertAtTail_3003(head_3003);
            } else if (opsi_3003 == 2) {
                head_3003 = deleteHead_3003(head_3003);
            } else if (opsi_3003 == 3) {
                head_3003 = display_3003(head_3003);
            } else if (opsi_3003 == 4) {
                head_3003 = search_3003(head_3003);
            } else if (opsi_3003 == 5) {
                head_3003 = StatusAntrian(head_3003);
            } else if (opsi_3003 == 6) {
                break;
            } else {
                System.out.println("opsi tidak tersedia di pilihan");
            }
        }

        sc_3003.close();
    }
}
