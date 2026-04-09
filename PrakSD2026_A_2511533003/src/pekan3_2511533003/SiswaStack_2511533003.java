package pekan3_2511533003;

import java.util.ArrayList;

class Siswa_2511533003{
	String nama_3003;
	int nim_3003;

    public Siswa_2511533003(String nama_3003, int nim_3003) {
		this.nama_3003 = nama_3003;
		this.nim_3003 = nim_3003;
    }

	@Override
	public String toString(){
		return "Nim: " + this.nim_3003 + ", Nama: " + this.nama_3003;
	}
}

public class SiswaStack_2511533003 {

	private ArrayList<Siswa_2511533003> stack_3003;

    public SiswaStack_2511533003() {
        this.stack_3003 = new ArrayList<Siswa_2511533003>();
    }

	
	public void push_3003(Siswa_2511533003 mhs_3003){
		this.stack_3003.add(mhs_3003);
	}

	public Siswa_2511533003 pop_3003(){
		if (!isEmpty_3003()){
			return this.stack_3003.remove(this.stack_3003.size() - 1);
		}

		return null;
	}

	public Siswa_2511533003 peek_3003(){
		if (!isEmpty_3003()){
			return this.stack_3003.get(this.stack_3003.size() - 1);
		}

		return null;
	}

	public boolean isEmpty_3003(){
		return this.stack_3003.isEmpty();
	}

	public void tampilkanMahasiswa_3003(){
		for (int i_3003 = this.stack_3003.size() - 1; i_3003 >= 0; i_3003--) {
			System.out.println(this.stack_3003.get(i_3003));
		}
	}

	public static void main(String[] args) {
		SiswaStack_2511533003 studentStack_3003 = new SiswaStack_2511533003();

		Siswa_2511533003 mhs1_3003 = new Siswa_2511533003("Ali", 1);
		Siswa_2511533003 mhs2_3003 = new Siswa_2511533003("Boby", 2);
		Siswa_2511533003 mhs3_3003 = new Siswa_2511533003("Charles", 3);

		studentStack_3003.push_3003(mhs1_3003);
		studentStack_3003.push_3003(mhs2_3003);
		studentStack_3003.push_3003(mhs3_3003);

		System.out.println("Siswa Di Dalam Stack:");
		studentStack_3003.tampilkanMahasiswa_3003();

		System.out.println("Siswa Teratas " + studentStack_3003.peek_3003());
		System.out.println("Mengeluarkan Siswa Teratas Dari Stack:  " + studentStack_3003.pop_3003());
		System.out.println("Daftar Siswa Setelah Di pop :");
		studentStack_3003.tampilkanMahasiswa_3003();
	}
}
