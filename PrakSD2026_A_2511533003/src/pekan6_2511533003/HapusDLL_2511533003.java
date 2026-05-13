package pekan6_2511533003;

public class HapusDLL_2511533003 {

    public static NodeDLL_2511533003 delHead_3003(
        NodeDLL_2511533003 head_3003
    ) {
        if (head_3003 == null) {
            return null;
        }

        NodeDLL_2511533003 temp_3003 = head_3003;
        head_3003 = head_3003.next_3003;
        if (head_3003 != null) {
            head_3003.prev_3003 = null;
        }
        return head_3003;
    }

    public static NodeDLL_2511533003 delLast_3003(
        NodeDLL_2511533003 head_3003
    ) {
        if (head_3003 == null) {
            return null;
        }

        if (head_3003.next_3003 == null) {
            return null;
        }

        NodeDLL_2511533003 curr_3003 = head_3003;

        while (curr_3003.next_3003 != null) {
            curr_3003 = curr_3003.next_3003;
        }

        if (curr_3003.prev_3003 != null) {
            curr_3003.prev_3003.next_3003 = null;
        }

        return head_3003;
    }

    public static NodeDLL_2511533003 delPos_3003(
        NodeDLL_2511533003 head_3003,
        int pos_3003
    ) {
        if (head_3003 == null) {
            return head_3003;
        }

        NodeDLL_2511533003 curr_3003 = head_3003;
        for (int i_3003 = 1; curr_3003 != null && i_3003 < pos_3003; ++i_3003) {
            curr_3003 = curr_3003.next_3003;
        }

        if (curr_3003 == null) {
            return head_3003;
        }

        if (curr_3003.prev_3003 != null) {
            curr_3003.prev_3003.next_3003 = curr_3003.next_3003;
        }

        if (curr_3003.next_3003 != null) {
            curr_3003.next_3003.prev_3003 = curr_3003.prev_3003;
        }

        if (head_3003 == curr_3003) {
            head_3003 = curr_3003.next_3003;
        }

        return head_3003;
    }

    public static void printList_3003(NodeDLL_2511533003 head_3003) {
        NodeDLL_2511533003 curr_3003 = head_3003;
        while (curr_3003 != null) {
            System.out.print(curr_3003.data_3003 + " <-> ");
            curr_3003 = curr_3003.next_3003;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NodeDLL_2511533003 head_3003 = new NodeDLL_2511533003(1);
        head_3003.next_3003 = new NodeDLL_2511533003(2);
        head_3003.next_3003.prev_3003 = head_3003;
        head_3003.next_3003.next_3003 = new NodeDLL_2511533003(3);
        head_3003.next_3003.next_3003.prev_3003 = head_3003.next_3003;
        head_3003.next_3003.next_3003.next_3003 = new NodeDLL_2511533003(4);
        head_3003.next_3003.next_3003.next_3003.prev_3003 =
            head_3003.next_3003.next_3003;
        head_3003.next_3003.next_3003.next_3003.next_3003 =
            new NodeDLL_2511533003(5);
        head_3003.next_3003.next_3003.next_3003.next_3003.prev_3003 =
            head_3003.next_3003.next_3003.next_3003;

        System.out.print("DLL Awal: ");
        printList_3003(head_3003);

        System.out.print("Setelah Head Dihapus");
        head_3003 = delHead_3003(head_3003);
        printList_3003(head_3003);

        System.out.print("Setelah node terakhir dihapus");
        head_3003 = delLast_3003(head_3003);
        printList_3003(head_3003);

        System.out.print("Menghapus Node Kedua");
        head_3003 = delPos_3003(head_3003, 2);
        printList_3003(head_3003);
    }
}
