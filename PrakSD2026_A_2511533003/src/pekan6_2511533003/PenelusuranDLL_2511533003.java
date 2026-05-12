package pekan6_2511533003;

public class PenelusuranDLL_2511533003 {

    static void forwaldTraversal_3003(NodeDLL_2511533003 head_3003) {
        NodeDLL_2511533003 curr_3003 = head_3003;
        while (curr_3003 != null) {
            System.out.print(curr_3003.data_3003 + " <-> ");
            curr_3003 = curr_3003.next_3003;
        }
        System.out.println();
    }

    static void backwardTransversal(NodeDLL_2511533003 tail_3003) {
        NodeDLL_2511533003 curr_3003 = tail_3003;
        while (curr_3003 != null) {
            System.out.print(curr_3003.data_3003 + " <-> ");
            curr_3003 = curr_3003.prev_3003;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NodeDLL_2511533003 head_3003 = new NodeDLL_2511533003(1);
        NodeDLL_2511533003 second_3003 = new NodeDLL_2511533003(2);
        NodeDLL_2511533003 third_3003 = new NodeDLL_2511533003(3);

        head_3003.next_3003 = second_3003;
        second_3003.prev_3003 = head_3003;
        second_3003.next_3003 = third_3003;
        third_3003.prev_3003 = second_3003;

        System.out.println("Penelusuran maju:");
        forwaldTraversal_3003(head_3003);
        System.out.println("Penelusuran mundur:");
        backwardTransversal(third_3003);
    }
}
