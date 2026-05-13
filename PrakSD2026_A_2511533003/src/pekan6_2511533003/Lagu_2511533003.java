package pekan6_2511533003;

public class Lagu_2511533003 {

    String judul;
    String penyanyi;
    Lagu_2511533003 next;
    Lagu_2511533003 prev;

    // konstruktor
    public Lagu_2511533003(String judul, String penyanyi) {
        this.judul = judul;
        this.penyanyi = penyanyi;
    }

    // getter
    public String getJudul() {
        return this.judul;
    }

    public String getPenyanyi() {
        return this.penyanyi;
    }

    public Lagu_2511533003 getNext() {
        return this.next;
    }

    public Lagu_2511533003 getPrev() {
        return this.prev;
    }

    // setter
    public void getJudul(String judul) {
        this.judul = judul;
    }

    public void getPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }

    public void getNext(Lagu_2511533003 next) {
        this.next = next;
    }

    public void getPrev(Lagu_2511533003 prev) {
        this.prev = prev;
    }
}
