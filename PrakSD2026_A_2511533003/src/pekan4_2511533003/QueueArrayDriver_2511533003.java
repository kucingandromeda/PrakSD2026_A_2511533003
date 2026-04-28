package pekan4_2511533003;

public class QueueArrayDriver_2511533003 {
    public static void main(String[] args) {
        QueueArray_2511533003 queue_3003 = new QueueArray_2511533003(1000);
        queue_3003.enqueue_3003(10);
        queue_3003.enqueue_3003(20);
        queue_3003.enqueue_3003(30);
        queue_3003.enqueue_3003(40);

        System.out.println("item di dapan " + queue_3003.front_3003());
        System.out.println("item paling di belakang " + queue_3003.rear_3003());
        System.out.println("tampilkan queue");
        queue_3003.display_3003();

        System.out.println();
        System.out.println(queue_3003.dequeue_3003() + " dihapus dari queue");
        System.out.println("item di dapan: " + queue_3003.front_3003());
        System.out.println("item dibelakang " + queue_3003.rear_3003());
        System.out.println("tampilkan queue setelah satu data dihapus");
        queue_3003.display_3003();
    }    
}
