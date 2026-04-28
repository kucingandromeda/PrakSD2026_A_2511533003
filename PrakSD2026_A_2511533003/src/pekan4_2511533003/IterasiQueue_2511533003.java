package pekan4_2511533003;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IterasiQueue_2511533003 {

    public static void main(String[] args) {
        Queue<String> q_3003 = new LinkedList<>();

        q_3003.add("Pratikum");
        q_3003.add("Struktur");
        q_3003.add("Data");
        q_3003.add("Dan");
        q_3003.add("Algoritma");

        Iterator<String> iterator_3003 = q_3003.iterator();
        while (iterator_3003.hasNext()) {
            System.out.print(iterator_3003.next() + " ");
        }
    }
}
