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

// public class Mobil_2511533003 {

//     private LinkedList<Unit> mobil;

//     public Mobil_2511533003() {
//         this.mobil = new LinkedList<Unit>();
//     }

//     public void tambahMobil(
//         String nama,
//         int tahun,
//         int cc,
//         int harga,
//         String merk
//     ) {
//         Unit unitMobil = new Unit(nama, tahun, cc, harga, merk);
//         this.mobil.add(unitMobil);
//     }

//     public void hapusMobil() {
//         this.mobil.remove();
//     }

//     // selector
// public Unit selectMobil(int index) {
//     return this.mobil.get(index);
// }

//     // mutator
//     public void setNamaMobil(int index, String nama) {
//         Unit unit = this.mobil.get(index);
//         unit.setNama(nama);
//         this.mobil.add(index, unit);
//     }

//     public void setTahunMobil(int index, int tahun) {
//         Unit unit = this.mobil.get(index);
//         unit.setTahun(tahun);
//         this.mobil.add(index, unit);
//     }

//     public void setCcMobil(int index, int cc) {
//         Unit unit = this.mobil.get(index);
//         unit.setCc(cc);
//         this.mobil.add(index, unit);
//     }

//     public void setMerkMobil(int index, String merk) {
//         Unit unit = this.mobil.get(index);
//         unit.setMerk(merk);
//         this.mobil.add(index, unit);
//     }
// }
