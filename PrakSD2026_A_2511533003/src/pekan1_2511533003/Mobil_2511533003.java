package pekan1_2511533003;

class Mobil_2511533003 {

    private String nama;
    private int tahun;
    private int cc;
    private int harga;
    private String merk;

    public Mobil_2511533003(
        String nama,
        int tahun,
        int cc,
        int harga,
        String merk
    ) {
        this.nama = nama;
        this.tahun = tahun;
        this.cc = cc;
        this.harga = harga;
        this.merk = merk;
    }

    // getter
    public String getNama() {
        return this.nama;
    }

    public int getTahun() {
        return this.tahun;
    }

    public int getCc() {
        return this.cc;
    }

    public int getHarga() {
        return this.harga;
    }

    public String getMerk() {
        return this.merk;
    }

    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
}
