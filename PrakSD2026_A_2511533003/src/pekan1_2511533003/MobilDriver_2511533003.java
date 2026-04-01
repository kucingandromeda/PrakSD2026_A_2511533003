package pekan1_2511533003;

import java.util.LinkedList;

public class MobilDriver_2511533003 {

    private LinkedList<Mobil_2511533003> mobil;

    public void tambahMobil(Mobil_2511533003 mobil) {
        this.mobil.add(mobil);
    }

    public void hapusMobil(Mobil_2511533003 mobil) {
        this.mobil.remove();
    }

    // selector
    public Mobil_2511533003 selectMobil(int index) {
        return this.mobil.get(index);
    }

    // mutator
    public void ubahtMobil(int index, Mobil_2511533003 mobil) {
        this.mobil.remove(index);
        this.mobil.add(index, mobil);
    }

    public static void main(String[] args) {
        Mobil_2511533003 mobil = new Mobil_2511533003(
            "Avanza",
            2020,
            1300,
            150000000,
            "Toyota"
        );

        mobil.setCc(1500);
        mobil.setHarga(20000000);
        mobil.setTahun(2025);
        mobil.setMerk("Honda");
    }
}
