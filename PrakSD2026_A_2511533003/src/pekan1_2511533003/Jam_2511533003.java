package pekan1_2511533003;

public class Jam_2511533003 {

    private int hh; // 0..23
    private int mm; // 0..59
    private int ss; // 0..59

    // konstruktor
    public Jam_2511533003(int h, int m, int s) {
        this.hh = h;
        this.mm = m;
        this.ss = s;
    }

    // validator
    public static boolean siValid(int h, int m, int s) {
        return (
            (0 <= h && h <= 23) && (0 <= m && m <= 59) && (0 <= s && s <= 59)
        );
    }

    // Selector
    public int GetHour() {
        return this.hh;
    }

    public int GetMinute() {
        return this.mm;
    }

    public int GetSecond() {
        return this.ss;
    }

    // mutator
    public void setHour(int h) {
        this.hh = h;
    }

    public void setMinute(int m) {
        this.mm = m;
    }

    public void setSecond(int s) {
        this.ss = s;
    }

    public int toSeconds() {
        return hh * 3600 + mm * 60 + ss;
    }

    public static Jam_2511533003 fromSeconds(int total) {
        if (total < 0) throw new IllegalArgumentException("detik negatif!");
        total %= 24 * 3600; // wrap 24 jam
        int h = total / 3600;
        total %= 3600;
        int m = total / 60;
        int s = total % 60;
        return new Jam_2511533003(h, m, s);
    }

    // Relational
    public int compareTo(Jam_2511533003 other) {
        return Integer.compare(this.toSeconds(), other.toSeconds());
    }

    public boolean equals(Object o) {
        if (!(o instanceof Jam_2511533003 j)) return false;

        return this.hh == j.hh && this.mm == j.mm && this.ss == j.ss;
    }

    public int hashCode() {
        return java.util.Objects.hash(this.hh, this.mm, this.ss);
    }

    // Aritmatika
    public Jam_2511533003 plus(Jam_2511533003 other) {
        return fromSeconds(this.toSeconds() + other.toSeconds());
    }

    public Jam_2511533003 minus(Jam_2511533003 other) {
        return fromSeconds(
            Math.floorMod(this.toSeconds() - other.toSeconds(), 24 * 3600)
        );
    }

    public Jam_2511533003 nextSecond() {
        return fromSeconds(this.toSeconds() + 1);
    }

    public Jam_2511533003 nextNSeconds(int n) {
        return fromSeconds(this.toSeconds() + Math.max(0, n));
    }

    public Jam_2511533003 prevSecond() {
        return fromSeconds(Math.floorMod(this.toSeconds() - 1, 24 * 3600));
    }

    public Jam_2511533003 prevNSecond(int n) {
        return fromSeconds(
            Math.floorMod(this.toSeconds() - Math.max(0, n), 24 * 3600)
        );
    }

    public static int durasiDetik(Jam_2511533003 jaw, Jam_2511533003 jakh) {
        return jakh.toSeconds() - jaw.toSeconds();
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hh, mm, ss);
    }
}
