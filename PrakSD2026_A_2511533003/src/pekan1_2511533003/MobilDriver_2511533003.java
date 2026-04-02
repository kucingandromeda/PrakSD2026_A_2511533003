package pekan1_2511533003;

public class MobilDriver_2511533003 {

    public static void tambahMobil(Mobil_2511533003[] mobil_list, Mobil_2511533003 mobil) {
        int index = mobil_list.length;
        mobil_list[index] = mobil;
    }

    public static void hapusMobil(Mobil_2511533003[] mobil_list) {
        int index = mobil_list.length - 1;
        if (index < 0){
            System.out.println("list mobil kosong");
        } else {
            mobil_list[index] = null;
        }
    }

    // selector
    public static Mobil_2511533003 selectMobil(Mobil_2511533003[] mobil_list, int idx) {
        return mobil_list[idx];
    }

    // mutator
    public static void ubahMobil(Mobil_2511533003[] mobil_list, int idx, Mobil_2511533003 mobil) {
        mobil_list[idx] = mobil;
    }

    public static void main(String[] args) {
        Mobil_2511533003[] mobil_list = {null, null, null, null, null};

        Mobil_2511533003 mobil1 = new Mobil_2511533003(
            "Avanza",
            2020,
            1300,
            150000000,
            "Toyota"
        );
        tambahMobil(mobil_list, mobil1);

        Mobil_2511533003 mobil2 = new Mobil_2511533003(
            "Avanza",
            2020,
            1300,
            150000000,
            "Toyota"
        );
        mobil2.setCc(1500);
        mobil2.setHarga(20000000);
        mobil2.setTahun(2025);
        mobil2.setMerk("Honda");
        ubahMobil(mobil_list, 0, mobil2);

        Mobil_2511533003 mobil_selected = selectMobil(mobil_list, 0);
        hapusMobil(mobil_list);
    }
}
