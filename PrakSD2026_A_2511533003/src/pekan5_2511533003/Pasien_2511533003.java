package pekan5_2511533003;

public class Pasien_2511533003 {

    String name_3003;
    String keluhan_3003;
    int no_antrian_3003;
    Pasien_2511533003 next_3003;

    // Konstruktor
    public Pasien_2511533003(
        String name_3003,
        String keluhan_3003,
        int no_antrian_3003,
        Pasien_2511533003 next_3003
    ) {
        this.name_3003 = name_3003;
        this.keluhan_3003 = keluhan_3003;
        this.no_antrian_3003 = no_antrian_3003;
        this.next_3003 = next_3003;
    }

    // getter
    public String getName_3003() {
        return this.name_3003;
    }

    public String getKeluhan_3003() {
        return this.keluhan_3003;
    }

    public int getNoAntrian_3003() {
        return this.no_antrian_3003;
    }

    public Pasien_2511533003 getNext_3003() {
        return this.next_3003;
    }

    // mutator
    public void setName_3003(String name_3003) {
        this.name_3003 = name_3003;
    }

    public void setKeluhan_3003(String keluhan_3003) {
        this.keluhan_3003 = keluhan_3003;
    }

    public void setNoAntrian_3003(int no_antrian_3003) {
        this.no_antrian_3003 = no_antrian_3003;
    }

    public void setNext_3003(Pasien_2511533003 next_3003) {
        this.next_3003 = next_3003;
    }
}
