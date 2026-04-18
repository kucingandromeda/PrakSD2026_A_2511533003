package pekan2_2511533003;

public class Musik_2511533003 {
    private String judulLagu_3003;   
    private String penyanyi_3003;
    private int durasi_3003;

    // Konstruktor
    public Musik_2511533003(String judulLagu_3003, String penyanyi_3003, int durasi_3003){
        this.judulLagu_3003 = judulLagu_3003;
        this.penyanyi_3003 = penyanyi_3003;
        this.durasi_3003 = durasi_3003;
    }

    // Selector
    public String getJudulLagu_3003(){
        return this.judulLagu_3003;
    }

    public String getPenyanyi_3003(){
        return this.penyanyi_3003;
    }

    public int getDurasi_3003(){
        return this.durasi_3003;
    }

    // Mutator
    public void setJudulLagu_3003(String judulLagu_3003){
        this.judulLagu_3003 = judulLagu_3003;
    }

    public void setPenyanyi_3003(String penyanyi_3003){
        this.penyanyi_3003 = penyanyi_3003;
    }

    public void setDurasi_3003(int durasi_3003){
        this.durasi_3003 = durasi_3003;
    }

    @Override
    public String toString(){
        return "judul: " + this.judulLagu_3003 + " penyanyi: " + this.penyanyi_3003 + " durasi(detik): " + this.durasi_3003;
    }
}
