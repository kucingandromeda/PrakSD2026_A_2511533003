package pekan5_2511533003;

public class PencarianSLL_2511533003 {

    static boolean searchKey_3003(NodeSLL_2511533003 head_3003, int key_3003) {
        NodeSLL_2511533003 curr_3003 = head_3003;
        while (curr_3003 != null) {
            if (curr_3003.data_3003 == key_3003) return true;
            curr_3003 = curr_3003.next_3003;
        }
        return false;
    }

    public static void traversal_3003(NodeSLL_2511533003 head_3003) {
        NodeSLL_2511533003 curr_3003 = head_3003;

        while (curr_3003 != null) {
            System.out.print(" " + curr_3003.data_3003);
            curr_3003 = curr_3003.next_3003;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        NodeSLL_2511533003 head_3003 = new NodeSLL_2511533003(14);
        head_3003.next_3003 = new NodeSLL_2511533003(21);
        head_3003.next_3003.next_3003 = new NodeSLL_2511533003(13);
        head_3003.next_3003.next_3003.next_3003 = new NodeSLL_2511533003(30);
        head_3003.next_3003.next_3003.next_3003.next_3003 =
            new NodeSLL_2511533003(10);

        System.out.print("Penelusuran SLL : ");
        traversal_3003(head_3003);

        int key_3003 = 30;
        System.out.print("Cari data  " + key_3003 + " = ");
        if (searchKey_3003(head_3003, key_3003)) System.out.println("ketemu");
        else System.out.println("Tidak Ada");
    }
}
