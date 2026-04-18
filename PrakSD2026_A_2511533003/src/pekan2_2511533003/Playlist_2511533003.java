package pekan2_2511533003;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Playlist_2511533003 {
    public static void tampilkanMenu_3003(ArrayList<Musik_2511533003> musikList_3003){
        System.out.println("pilih menu");
        Scanner sc_3003 = new Scanner(System.in);
        while(true){
            System.out.println("\n1. tambah lagu");
            System.out.println("2. lihat playlist");
            System.out.println("3. hapus lagu");
            System.out.println("4. keluar");

            int option_3003 = sc_3003.nextInt();
            if (option_3003 == 1){
                tambahLagu_3003(musikList_3003);
                
            } else if (option_3003 == 2){
                lihatPlaylist_3003(musikList_3003);

            } else if (option_3003 == 3){
                System.out.println("masukkan index musik yang akan dihapus");
                hapusLagu_3003(sc_3003.nextInt(), musikList_3003);
            } else if (option_3003 == 4){
                System.out.println("keluar");
                break;
            } else {
                System.out.println("tidak ada pilihan di opsi");
            }

        }
        sc_3003.close();
    }

    public static void tambahLagu_3003(ArrayList<Musik_2511533003> musikList_3003){
        Scanner sc_3003 = new Scanner(System.in);
        String judul_3003;
        String penyanyi_3003;
        int durasi_3003;

        System.out.println("\ntambah lagu");
        while(true){
            try {
                System.out.println("Masukkan Judul Lagu");
                judul_3003 = sc_3003.nextLine();
                break;
            } catch (InputMismatchException e_3003) {
                System.out.println("Format Judul Lagu Salah");
            }
        }

        while(true){
            try {
                System.out.println("Masukkan penyanyi");
                penyanyi_3003 = sc_3003.nextLine();
                break;
            } catch (InputMismatchException e_3003) {
                System.out.println("Format penyanyi Salah");
            }
        }

        while(true){
            try {
                System.out.println("Masukkan durasi(detik)");
                durasi_3003 = sc_3003.nextInt();
                break;
            } catch (InputMismatchException e_3003) {
                System.out.println("Format durasi Lagu Salah");
            }
        }

        musikList_3003.add(new Musik_2511533003(judul_3003, penyanyi_3003, durasi_3003));
        System.out.println("musik berhasil ditambahkan!");
    }

    public static void lihatPlaylist_3003(ArrayList<Musik_2511533003> musikList_3003){
        int size_3003 = cekKapasitas_3003(musikList_3003);

        if (size_3003 != 0){
            System.out.println("\nlist lagu");
            for (int i_3003 = 0; i_3003 < musikList_3003.size(); i_3003++) {
                System.out.println(i_3003 + ". " + musikList_3003.get(i_3003));
            }
        } else {
            System.out.println("playlist lagu kosong");
        }
    }

    public static void hapusLagu_3003(int idx_3003, ArrayList<Musik_2511533003> musikList_3003){
        int size_3003 = cekKapasitas_3003(musikList_3003);
        if (size_3003 <= 0){
            System.out.println("playlist lagu kosong");
        } else {
            Musik_2511533003 removedMusik_3003 = musikList_3003.remove(idx_3003);
            System.out.println(removedMusik_3003);
            System.out.println("berhasil dihapus");
        }
    }

    public static int cekKapasitas_3003(ArrayList<Musik_2511533003> musikList_3003){
        return musikList_3003.size();
    }

    public static void main(String[] args) {
        ArrayList<Musik_2511533003> musikList_3003 = new ArrayList<Musik_2511533003>();

        tampilkanMenu_3003(musikList_3003);
    }
}
