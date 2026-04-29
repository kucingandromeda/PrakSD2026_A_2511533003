package pekan4_2511533003;

import java.util.Scanner;

public class AntrianLoket_2511533003 {

    public static void main(String[] args) {
        Queue_2511533003 queue_3003 = new Queue_2511533003(100);

        Scanner sc_3003 = new Scanner(System.in);
        System.out.println("=== PROGRAM ANTRIAN LOKET ===");
        while (true) {
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. keluar");

            System.out.print("pilih menu: ");
            int option_3003 = sc_3003.nextInt();
            System.out.println("");
            if (option_3003 == 1) {
                queue_3003.enqueue_3003();
            } else if (option_3003 == 2) {
                queue_3003.dequeue_3003();
            } else if (option_3003 == 3) {
                queue_3003.display_3003();
            } else if (option_3003 == 4) {
                queue_3003.reverse();
            } else if (option_3003 == 5) {
                break;
            } else {
                System.out.println("Pilihan tidak tersedia pada opsi");
            }
            System.out.println("");
        }

        sc_3003.close();
    }
}
