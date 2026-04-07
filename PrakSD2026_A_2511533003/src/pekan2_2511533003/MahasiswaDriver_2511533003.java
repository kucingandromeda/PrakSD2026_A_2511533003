package pekan2_2511533003;

import java.util.ArrayList;
import java.util.Scanner;

public class MahasiswaDriver_2511533003 {
    // 1. Method Tampilkan Menu
    public static void tampilkanMenu_2511533003() {
        System.out.println("\nMenu:");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Tampilkan Semua Mahasiswa");
        System.out.println("3. Hapus Mahasiswa Berdasarkan NIM");
        System.out.println("4. Cari Mahasiswa Berdasarkan NIM");
        System.out.println("5. Keluar");
    }

    // 2. Method Tambah Mahasiswa
    public static void tambahMahasiswa_2511533003(ArrayList<Mahasiswa_2511533003> list, Scanner sc) {
        System.out.println("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.println("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.println("Masukkan Prodi: ");
        String prodi = sc.nextLine();
        list.add(new Mahasiswa_2511533003(nim, nama, prodi));
        System.out.println("Mahasiswa Berhasil Ditambahkan.");
    }

    // 3. Method untuk tampilkan semua data
    public static void TampilkanSemuaMahasiswa_2511533003(ArrayList<Mahasiswa_2511533003> list) {
        if (list.isEmpty()){
            System.out.println("Daftar Mahasiswa Kosong");
        } else {
            System.out.println("Data Mahasiswa:");
            for (Mahasiswa_2511533003 mhs: list) {
                System.out.println(mhs);
            }
        }
    }

    // 4. Method Unutuk Mengahapus Mahasiswa Berdasarkan NIM
    public static void hapusMahasiswa_2511533003(ArrayList<Mahasiswa_2511533003> list, Scanner sc) {
        System.out.println("Masukkan NIM yang akan di hapus: ");
        String nimHapus = sc.nextLine();
        boolean removed = list.removeIf(mhs -> mhs.nim.equals(nimHapus));

        if (removed){
            System.out.println("Data Dengan NIM " + nimHapus + " Berhasil dihapus");
        } else {
            System.out.println("NIM tidak ditemukan.");
        }
    }

    // 5. Method Untuk Cari Mahasiswa Berdasarkan NIM
    public static void cariMahasiswa_2511533003(ArrayList<Mahasiswa_2511533003> list, Scanner sc) {
        System.out.print("Masukkan NIM yang dicari: ");
        String nimCari = sc.nextLine();
        boolean ditemukan = false;

        for (Mahasiswa_2511533003 mhs : list) {
            if (mhs.nim.equals(nimCari)){
                System.out.println("Hasil Pencarian: " + mhs);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan){
            System.out.println("NIM tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        ArrayList<Mahasiswa_2511533003> mahasiswa_list = new ArrayList<Mahasiswa_2511533003>();
        Scanner sc = new Scanner(System.in);
        int choice;
        

        do { 
            tampilkanMenu_2511533003();
            System.out.println("Pilih Menu: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    tambahMahasiswa_2511533003(mahasiswa_list, sc);
                    break;
                case 2:
                    TampilkanSemuaMahasiswa_2511533003(mahasiswa_list);
                    break;
                case 3:
                    hapusMahasiswa_2511533003(mahasiswa_list, sc);
                    break;
                case 4:
                    cariMahasiswa_2511533003(mahasiswa_list, sc);
                    break;
                case 5:
                    System.out.println("Keluar Dari Program");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid");
                
            }
            
        } while (choice != 5);
        sc.close();
    }
}
