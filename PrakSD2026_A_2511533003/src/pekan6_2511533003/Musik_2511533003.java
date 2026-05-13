package pekan6_2511533003;

import java.util.Scanner;

public class Musik_2511533003 {

    public static void main(String[] args) {
        Scanner sc_3003 = new Scanner(System.in);
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
            } else if (option_3003 == 2) {
            } else if (option_3003 == 3) {
            } else if (option_3003 == 4) {
            } else if (option_3003 == 5) {
            } else if (option_3003 == 6) {
                break;
            } else {
                System.out.println("pilihan tidak ada di opsi");
            }
        }

        // sc_3003.close();
    }
}
