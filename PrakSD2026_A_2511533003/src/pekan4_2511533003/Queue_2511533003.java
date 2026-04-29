package pekan4_2511533003;

import java.util.Scanner;
import java.util.Stack;

public class Queue_2511533003 {

    int front_3003, rear_3003, size_3003;
    int max_3003;
    String queue_3003[];

    public Queue_2511533003(int capacity_3003) {
        this.max_3003 = capacity_3003;
        front_3003 = this.size_3003 = 0;
        rear_3003 = capacity_3003 - 1;
        queue_3003 = new String[this.max_3003];
    }

    boolean isFull_3003(Queue_2511533003 queue_3003) {
        return (queue_3003.size_3003 == queue_3003.max_3003);
    }

    boolean isEmpty_3003(Queue_2511533003 queue_3003) {
        return (queue_3003.size_3003 == 0);
    }

    void enqueue_3003() {
        if (isFull_3003(this)) {
            System.out.println("penuh");
            return;
        }

        Scanner sc_3003 = new Scanner(System.in);
        System.out.print("Masukkan nama pelanggan: ");
        String item_3003 = sc_3003.nextLine();

        this.rear_3003 = (this.rear_3003 + 1) % this.max_3003;
        this.queue_3003[this.rear_3003] = item_3003;
        this.size_3003 = this.size_3003 + 1;
        System.out.println("Data berhasil ditambahkan ke antrian");
    }

    String dequeue_3003() {
        if (isEmpty_3003(this)) {
            System.out.println("Antrian Kosong");
            return "kosong";
        }

        String item_3003 = this.queue_3003[this.front_3003];
        this.front_3003 = (this.front_3003 + 1) % this.max_3003;
        this.size_3003 = this.size_3003 - 1;

        System.out.println(item_3003 + " telah dilayani");

        return item_3003;
    }

    void display_3003() {
        if (this.isEmpty_3003(this)) {
            System.out.println("\nAntrian Kosong\n");
            return;
        }

        System.out.println("\nIsi antrian: \n");
        for (
            int i_3003 = this.front_3003;
            i_3003 < this.front_3003 + this.size_3003;
            i_3003++
        ) {
            System.out.println(" " + queue_3003[i_3003]);
        }
    }

    void reverse() {
        if (isEmpty_3003(this)) {
            System.out.println("Antrian Kosong");
            return;
        }

        Stack<String> s_3003 = new Stack<>();

        for (
            int i_3003 = this.front_3003;
            i_3003 < this.front_3003 + this.size_3003;
            i_3003++
        ) {
            s_3003.push(queue_3003[i_3003]);
        }

        for (
            int i_3003 = this.front_3003;
            i_3003 < this.front_3003 + this.size_3003;
            i_3003++
        ) {
            queue_3003[i_3003] = s_3003.pop();
        }

        this.display_3003();
    }
}
