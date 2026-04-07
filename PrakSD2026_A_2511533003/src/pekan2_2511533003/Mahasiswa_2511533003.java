package pekan2_2511533003;

public class Mahasiswa_2511533003 {
    String nim;
    String nama;
    String prodi;

    Mahasiswa_2511533003(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    @Override
    public String toString(){
        return "NIM: " + this.nim + ", Nama: " + this.nama + ", Prodi " + this.prodi;
    }
}
