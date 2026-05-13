package pekan6_2511533003;

import java.util.Scanner;

public class Musik_2511533003 {

    public static Lagu_2511533003 tambahLagu_3003(
        Lagu_2511533003 head_3003,
        Lagu_2511533003 tail_3003
    ) {
        Scanner sc_3003 = new Scanner(System.in);

        System.out.print("judul: ");
        String judul_3003 = sc_3003.nextLine();

        System.out.print("Penyanyi: ");
        String penyanyi_3003 = sc_3003.nextLine();

        Lagu_2511533003 lagu_3003 = new Lagu_2511533003(
            judul_3003,
            penyanyi_3003
        );

        return lagu_3003;
    }

    public static void tampilMaju_3003(Lagu_2511533003 head_3003) {
        Lagu_2511533003 curr_3003 = head_3003;
        if (curr_3003 == null) {
            System.out.println("Linked List Kosong!");
        }

        while (true) {
            if (curr_3003 == null) {
                break;
            }

            System.out.println(
                "judul musik: " +
                    curr_3003.getJudul_3003() +
                    ", penyayi: " +
                    curr_3003.getPenyanyi_3003()
            );

            curr_3003 = curr_3003.next_3003;
        }
    }

    public static Lagu_2511533003 hapusLaguAwal_3003(
        Lagu_2511533003 head_3003
    ) {
        if (head_3003 == null) {
            System.out.println("Linked List Kosong!");
            return null;
        }

        return head_3003.next_3003;
    }

    public static void tampilMundur_3003(Lagu_2511533003 tail_3003) {
        Lagu_2511533003 curr_3003 = tail_3003;
        if (curr_3003 == null) {
            System.out.println("Linked List Kosong!");
        }

        while (true) {
            if (curr_3003 == null) {
                break;
            }

            System.out.println(
                "judul musik: " +
                    curr_3003.getJudul_3003() +
                    ", penyayi: " +
                    curr_3003.getPenyanyi_3003()
            );

            curr_3003 = curr_3003.prev_3003;
        }
    }

    public static void cariLagu(Lagu_2511533003 head_3003) {
        Lagu_2511533003 curr_3003 = head_3003;
        if (curr_3003 == null) {
            System.out.println("Linked List Kosong!");
        }

        Scanner sc_3003 = new Scanner(System.in);

        System.out.print("masukkan judul yang ingin dicari: ");
        String cariJudul_3003 = sc_3003.nextLine();

        while (true) {
            if (curr_3003 == null) {
                System.out.println(
                    "Lagu dengan judul " + cariJudul_3003 + " tidak ditemukan"
                );
                break;
            }

            if (curr_3003.getJudul_3003().equalsIgnoreCase(cariJudul_3003)) {
                System.out.println(
                    "Lagu dengan judul " + cariJudul_3003 + " ditemukan"
                );
                break;
            }

            curr_3003 = curr_3003.next_3003;
        }
    }

    public static void main(String[] args) {
        Scanner sc_3003 = new Scanner(System.in);
        Lagu_2511533003 head_3003 = null;
        Lagu_2511533003 tail_3003 = null;

        while (true) {
            System.out.println("\n=== Playlist Musik NIM: 2411531005 === ");
            System.out.println("1. Tambah Lagu ");
            System.out.println("2. Hapus Lagu Pertama ");
            System.out.println("3. Lihat Playlist (Maju) ");
            System.out.println("4. Lihat Playlist (Mundur) ");
            System.out.println("5. Cari Lagu ");
            System.out.println("6. Keluar \n");
            System.out.print("pilihan: ");

            int option_3003 = sc_3003.nextInt();

            if (option_3003 == 1) {
                Lagu_2511533003 lagu_3003 = tambahLagu_3003(
                    head_3003,
                    tail_3003
                );
                if (head_3003 == null && tail_3003 == null) {
                    System.out.println("this run");
                    head_3003 = lagu_3003;
                    tail_3003 = lagu_3003;
                } else {
                    lagu_3003.prev_3003 = tail_3003;
                    tail_3003.next_3003 = lagu_3003;
                    tail_3003 = lagu_3003;
                }

                System.out.println("berhasil ditambahkan! ");
            } else if (option_3003 == 2) {
                head_3003 = hapusLaguAwal_3003(head_3003);
                head_3003.prev_3003 = null;
                System.out.println("berhasil di hapus");
            } else if (option_3003 == 3) {
                tampilMaju_3003(head_3003);
            } else if (option_3003 == 4) {
                tampilMundur_3003(tail_3003);
            } else if (option_3003 == 5) {
                cariLagu(head_3003);
            } else if (option_3003 == 6) {
                break;
            } else {
                System.out.println("pilihan tidak ada di opsi");
            }
        }

        sc_3003.close();
    }
}
