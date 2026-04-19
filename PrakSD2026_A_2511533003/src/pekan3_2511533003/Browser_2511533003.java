package pekan3_2511533003;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2511533003{
    private Stack<Website_2511533003> history_3003 = new Stack<>();

    public void kunjungiWebsite_3003(){
        Scanner sc_3003 = new Scanner(System.in);
        String judulWebsite_3003;
        String URLWebsite_3003;

        
        System.out.println("Masukkan Judul");
        judulWebsite_3003 = sc_3003.nextLine();

        System.out.println("Masukkan URL");
        URLWebsite_3003 = sc_3003.nextLine();

        this.history_3003.add(new Website_2511533003(judulWebsite_3003, URLWebsite_3003));
        System.out.println("Website telah dimasukkan ke dalam hitory");
    }

    public void back_3003(){
        if (!CekStatusHistory_3003()){
            Website_2511533003 removedWebsite_3003 = this.history_3003.pop();
            System.out.println("website berjudul: " + removedWebsite_3003.getJudulWebsite_3003() + " url: "+ removedWebsite_3003.getURLWebsite_3003() + " berhasil dihapus");
        } else {
            System.out.println("history kosong");
        }
    }

    public void halamanSaatAktif_3003(){
        if (!CekStatusHistory_3003()){
            Website_2511533003 peekWebsite_3003 = this.history_3003.peek();
            System.out.println("website berjudul: " + peekWebsite_3003.getJudulWebsite_3003() + " url: "+ peekWebsite_3003.getURLWebsite_3003() + " Sedang Aktif");
        } else {
            System.out.println("history kosong");
        }
    }

    public boolean CekStatusHistory_3003(){
        return this.history_3003.isEmpty();
    }

    public static void main(String[] args) {
        Browser_2511533003 browser_3003 = new Browser_2511533003();

        Scanner sc_3003 = new Scanner(System.in);

        while(true){
            System.out.println("\n=== Browser History NIM: 2511533003 ===");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Keluar");
            System.out.print("pilihan: ");
            System.out.println("");

            int option_3003 = sc_3003.nextInt();
            if (option_3003 == 1){
                browser_3003.kunjungiWebsite_3003();
            } else if(option_3003 == 2){
                browser_3003.back_3003();
            } else if(option_3003 == 3){
                browser_3003.halamanSaatAktif_3003();
            } else if(option_3003 == 4){
                break;
            } else {
                System.out.print("pilihan " + option_3003 + "tidak ada di dalam opsi");
            }
        }

        sc_3003.close();
        
    }
}