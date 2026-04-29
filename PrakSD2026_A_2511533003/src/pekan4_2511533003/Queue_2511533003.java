package pekan4_2511533003;

import java.util.Stack;

public class Queue_2511533003 {

    int front_3003, rear_3003, size_3003;
    int max_3003;
    String queue_3003[];

    boolean isFull_3003(Queue_2511533003 queue_3003) {
        return (queue_3003.size_3003 >= queue_3003.max_3003);
    }

    boolean isEmpty_3003(Queue_2511533003 queue_3003) {
        return (queue_3003.size_3003 == 0);
    }

    void enqueue_3003(String item_3003) {
        if (isFull_3003(this)) {
            System.out.println("penuh");
            return;
        }

        this.rear_3003 = (this.rear_3003 + 1) % this.max_3003;
        this.queue_3003[this.rear_3003] = item_3003;
        this.size_3003 = this.size_3003 + 1;
        System.out.println(item_3003 + " enqueue to queue");
    }

    String dequeue_3003() {
        if (isEmpty_3003(this)) {
            System.out.println("Antrian Kosong");
            return "kosong";
        }

        String item_3003 = this.queue_3003[this.front_3003];
        this.front_3003 = (this.front_3003 + 1) % this.max_3003;
        this.size_3003 = this.size_3003 - 1;
        return item_3003;
    }

    void display_3003() {
        if (this.front_3003 == this.rear_3003) {
            System.out.println("\nAntrian Kosong\n");
            return;
        }

        System.out.println("Isi Antrian: ");
        for (int i_3003 = 0; i_3003 < this.size_3003; i_3003++) {
            System.out.printf(i_3003 + ". ", queue_3003[i_3003]);
        }
    }

    void reverse() {
        Stack<String> s_3003 = new Stack<>();

        for (int i_3003 = 0; i_3003 < this.size_3003; i_3003++) {
            s_3003.push(queue_3003[i_3003]);
        }

        for (int i_3003 = 0; i_3003 < this.size_3003; i_3003++) {
            queue_3003[i_3003] = s_3003.pop();
        }
    }
}
