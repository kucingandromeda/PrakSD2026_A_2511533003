package pekan2_2511533003;

import java.util.ArrayList;

public class DaftarKata_2511533003 {
    private final ArrayList<String> data;

    // Konstruksi Inisialisasi List Kosong
    public DaftarKata_2511533003(){
        this.data = new ArrayList<String>();
    }

    // Menambahkan Element DI akhir list
    public void tambah_2511533003(String element){
        data.add(element);
    }

    // Menambahkan Element pda index tertentu (Menyisipkan)
    public void tambahPada_2511533003(int index, String element){
        data.add(index, element);
    }

    // Menguubah Element Pada Posisi 'Index' menjadi nilai baru
    // Bertindak sebagai setter untuk element tertentu
    public void ubahElement_2511533003(int index, String nilaiBaru){
        data.set(index, nilaiBaru);
    }

    // Mengapus element pada posisi index lalu mengembalikan nilai yang dihapus
    public String hapusElemen_2511533003(int index){
        return data.remove(index);
    }

    // Melakukan Iterasi dan mencetak element dalam format: [index] nilai
    // Metode ini tidak mengembalikan nilai; hanya demonstrasi iterasi
    public void iterasiCetak_2511533003(){
        for (int i = 0; i < this.data.size(); i++) {
            System.out.print(data.get(i) + " ");
        }
    }

    // Mengambil Element Berdasarkan Index
    public String get_2511533003(int index){
        return data.get(index);
    }

    // Representasi String Agar String mUdah Di cetak
    @Override
    public String toString(){
        return this.data.toString();
    }
}
