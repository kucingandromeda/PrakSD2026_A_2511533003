package pekan1_2511533003;

import java.util.Scanner;

public class JamDriver2_2511533003 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== program Driver objek Jam ===");

        // input jam pertama
        System.out.println("=== input jam 1 ===");
        Jam_2511533003 j1 = buatJamDariInput(input);

        // input jam kedua
        System.out.println("=== input jam 2 ===");
        Jam_2511533003 j2 = buatJamDariInput(input);

        // menampilkan data
        System.out.println("\n--- hasil operasi ---");
        System.out.println("jam 1 (String) " + j1.toString());
        System.out.println("jam 2 (String) " + j2.toString());
        System.out.println("jam 1 dalam detik " + j1.toSeconds());
        System.out.println("jam 2 dalam detik " + j2.toSeconds());

        // opearasi relational
        int perbandingan = j1.compareTo(j2);
        if (perbandingan > 0) {
            System.out.println("Status : Jam 1 lebih lambat (setelah) jam 2");
        } else if (perbandingan < 0) {
            System.out.println("Status : Jam 1 lebih awal (sebelum) jam 2");
        } else {
            System.out.println("Status : Jam 1 dan jam 2 sama persis");
        }

        // operasi aritmatika
        System.out.println(
            "Durasi (J1 ke J2) : " + Jam_2511533003.durasiDetik(j1, j2)
        );

        Jam_2511533003 jNext = j1.nextSecond();
        System.out.println("Jam 1 detik berikutnya : " + jNext);

        Jam_2511533003 jPrev = j1.prevSecond();
        System.out.println("Jam 1 detik berikutnya : " + jPrev);

        // operasi penjumlahan jam
        Jam_2511533003 jamHasilPlus = j1.plus(j2);
        System.out.println("Hasil j1 + j2 : " + jamHasilPlus);

        input.close();
        System.out.println("\nProgram selesai.");
    }

    private static Jam_2511533003 buatJamDariInput(Scanner sc) {
        int h, m, s;
        while (true) {
            System.out.println("Masukkan Jam(0-23)   : ");
            h = sc.nextInt();
            System.out.println("Masukkan Menit(0-23) : ");
            m = sc.nextInt();
            System.out.println("Masukkan Detik(0-23) : ");
            s = sc.nextInt();

            if (Jam_2511533003.siValid(h, m, s)) {
                return new Jam_2511533003(h, m, s);
            } else {
                System.out.println(
                    "[Error] Input tidak valid! silahkan ulangi.\n"
                );
            }
        }
    }
}
