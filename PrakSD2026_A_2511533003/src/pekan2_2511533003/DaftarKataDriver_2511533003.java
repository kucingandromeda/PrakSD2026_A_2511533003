package pekan2_2511533003;

public class DaftarKataDriver_2511533003 {

	public static void main(String[] args) {
		
		DaftarKata_2511533003 a1 = new DaftarKata_2511533003();

		// Menambahkan Element (akhir)
		a1.tambah_2511533003("kami");
		a1.tambah_2511533003("informatika");

		// Menyisipkan Element Pada Index 1
		a1.tambahPada_2511533003(1, "mahasiswa");

		// cetak isi awal
		a1.ubahElement_2511533003(1, "Departemen");
		System.out.println("Setelah Ubah: " + a1);
		

		// Menghapus Element (hapus index 0)
		String terhapus = a1.hapusElemen_2511533003(0);
		System.out.println("Terhapus : " + terhapus);
		System.out.println("Setelah Hapus : " + a1);

		System.out.println("Iterasi");
		a1.iterasiCetak_2511533003();
		System.out.println();

	}

}
