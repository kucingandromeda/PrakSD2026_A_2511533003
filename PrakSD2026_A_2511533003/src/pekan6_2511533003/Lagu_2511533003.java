package pekan6_2511533003;

public class Lagu_2511533003 {

    String judul_3003;
    String penyanyi_3003;
    Lagu_2511533003 next_3003;
    Lagu_2511533003 prev_3003;

    // konstruktor
    public Lagu_2511533003(String judul_3003, String penyanyi_3003) {
        this.judul_3003 = judul_3003;
        this.penyanyi_3003 = penyanyi_3003;
    }

    // getter
    public String getJudul_3003() {
        return this.judul_3003;
    }

    public String getPenyanyi_3003() {
        return this.penyanyi_3003;
    }

    public Lagu_2511533003 getNext_3003() {
        return this.next_3003;
    }

    public Lagu_2511533003 getPrev_3003() {
        return this.prev_3003;
    }

    // setter
    public void getJudul_3003(String judu_3003l) {
        this.judul_3003 = judul_3003;
    }

    public void getPenyanyi_3003(String penyany_3003i) {
        this.penyanyi_3003 = penyanyi_3003;
    }

    public void getNext_3003(Lagu_2511533003 nex_3003t) {
        this.next_3003 = next_3003;
    }

    public void getPrev_3003(Lagu_2511533003 prev) {
        this.prev_3003 = prev;
    }
}
