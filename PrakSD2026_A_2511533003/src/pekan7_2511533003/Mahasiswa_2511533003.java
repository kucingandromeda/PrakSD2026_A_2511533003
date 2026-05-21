package pekan7_2511533003;

public class Mahasiswa_2511533003 {

    String nama_3003;
    String nim_3003;
    String programStudi_3003;

    // Konstruktor
    Mahasiswa_2511533003(
        String nama_3003,
        String nim_3003,
        String programStudi_3003
    ) {
        this.nama_3003 = nama_3003;
        this.nim_3003 = nim_3003;
        this.programStudi_3003 = programStudi_3003;
    }

    // Getter
    public String getNama_3003() {
        return this.nama_3003;
    }

    public String getNim_3003() {
        return this.nim_3003;
    }

    public String getProgramStudi_3003() {
        return this.programStudi_3003;
    }

    // Setter
    public void setNama_3003(String nama_3003) {
        this.nama_3003 = nama_3003;
    }

    public void setNim_3003(String nim_3003) {
        this.nim_3003 = nim_3003;
    }

    public void setProgramStudi_3003(String programStudi_3003) {
        this.programStudi_3003 = programStudi_3003;
    }

    @Override
    public String toString() {
        return this.getNama_3003();
    }
}
