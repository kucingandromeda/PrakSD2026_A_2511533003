package pekan4_2511533003;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511533003 {

    public static void main(String[] args) {
        Queue<Integer> q_3003 = new LinkedList<>();
        // tambah elemen {0, 1, 2, 3, 4, 5} ke antrian
        for (int i = 0; i < 6; i++) q_3003.add(i);

        // Menampilkan ISi Antrian
        System.out.println("Elemen Antrian " + q_3003);
        int hapus_3003 = q_3003.remove();

        // Untuk menghapus kepala antrian
        System.out.println("Hapus Elemen = " + hapus_3003);
        System.out.println(q_3003);

        // Untuk Melihat Antrian Terdepan
        int depan_3003 = q_3003.peek();
        System.out.println("Kepala Antrian " + depan_3003);

        int banyak_3003 = q_3003.size();
        System.out.println("Size Anterian = " + banyak_3003);
    }
}
