package pekan4_2511533003;

public class QueueArray_2511533003 {
    int front_3003, rear_3003, size_3003;
    int capacity_3003;
    int array_3003[];

    public QueueArray_2511533003(int capacity_3003){
        this.capacity_3003 = capacity_3003;
        front_3003 = this.size_3003 = 0;
        rear_3003 = capacity_3003 - 1;
        array_3003 = new int[this.capacity_3003];
    }

    boolean isFull_3003(QueueArray_2511533003 queue_3003){
        return (queue_3003.size_3003 == queue_3003.capacity_3003);
    }

    boolean isEmpty_3003(QueueArray_2511533003 queue_3003){
        return (queue_3003.size_3003 == 0);
    }

    void enqueue_3003(int item_3003){
        if (isFull_3003(this)) return;

        this.rear_3003 = (this.rear_3003 + 1) % this.capacity_3003;
        this.array_3003[this.rear_3003] = item_3003;
        this.size_3003 = this.size_3003 + 1;
        System.out.println(item_3003 + " enqueue to queue");
        
    }

    int dequeue_3003(){
        if (isEmpty_3003(this)) return Integer.MIN_VALUE;

        int item_3003 = this.array_3003[this.front_3003];
        this.front_3003 = (this.front_3003 + 1) % this.capacity_3003;
        this.size_3003 = this.size_3003 - 1;
        return item_3003;
    }

    int front_3003(){
        if (isEmpty_3003(this)) return Integer.MIN_VALUE;

        return this.array_3003[this.front_3003];
    }

    int rear_3003(){
        if (isEmpty_3003(this)) return Integer.MIN_VALUE;

        return this.array_3003[this.rear_3003];
    }

    void display_3003(){
        int i_3003;
        if(this.front_3003 == this.rear_3003){
            System.out.println("\nAntrian Kosong\n");
            return;
        }

        for (i_3003 = this.front_3003; i_3003 < rear_3003; i_3003++){
            System.out.printf(" %d <-- ", array_3003[i_3003]);
        }

        return;
    }
}
