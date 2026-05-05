package pekan5_2511533003;

public class HapusSLL_2511533003 {

    public static NodeSLL_2511533003 deletedHead_3003(
        NodeSLL_2511533003 head_3003
    ) {
        if (head_3003 == null) return null;
        head_3003 = head_3003.next_3003;
        return head_3003;
    }

    public static NodeSLL_2511533003 removeLastNode_3003(
        NodeSLL_2511533003 head_3003
    ) {
        if (head_3003 == null) {
            return null;
        }

        if (head_3003.next_3003 == null) {
            return null;
        }

        NodeSLL_2511533003 secondLast_3003 = head_3003;
        while (secondLast_3003.next_3003.next_3003 != null) {
            secondLast_3003 = secondLast_3003.next_3003;
        }

        secondLast_3003.next_3003 = null;

        return head_3003;
    }

    public static NodeSLL_2511533003 deleteNode_3003(
        NodeSLL_2511533003 head_3003,
        int position_3003
    ) {
        NodeSLL_2511533003 temp_3003 = head_3003;
        NodeSLL_2511533003 prev_3003 = null;

        if (temp_3003 == null) {
            return head_3003;
        }

        if (position_3003 == 1) {
            head_3003 = temp_3003.next_3003;
            return head_3003;
        }

        for (
            int i_3003 = 1;
            temp_3003 != null && i_3003 < position_3003;
            i_3003++
        ) {
            prev_3003 = temp_3003;
            temp_3003 = temp_3003.next_3003;
        }

        if (temp_3003 != null) {
            prev_3003.next_3003 = temp_3003.next_3003;
        } else {
            System.out.println("Data Tidak Ada");
        }

        return head_3003;
    }

    public static void printList_3003(NodeSLL_2511533003 head_3003) {
        NodeSLL_2511533003 curr_3003 = head_3003;

        while (curr_3003.next_3003 != null) {
            System.out.print(curr_3003.data_3003 + "-->");
            curr_3003 = curr_3003.next_3003;
        }

        if (curr_3003.next_3003 == null) {
            System.out.println(curr_3003.data_3003);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        NodeSLL_2511533003 head_3003 = new NodeSLL_2511533003(1);
        head_3003.next_3003 = new NodeSLL_2511533003(2);
        head_3003.next_3003.next_3003 = new NodeSLL_2511533003(3);
        head_3003.next_3003.next_3003.next_3003 = new NodeSLL_2511533003(4);
        head_3003.next_3003.next_3003.next_3003.next_3003 =
            new NodeSLL_2511533003(5);
        head_3003.next_3003.next_3003.next_3003.next_3003.next_3003 =
            new NodeSLL_2511533003(6);

        System.out.println("list awal: ");
        printList_3003(head_3003);

        head_3003 = deletedHead_3003(head_3003);
        System.out.println("list setelah head dihapus: ");
        printList_3003(head_3003);

        head_3003 = removeLastNode_3003(head_3003);
        System.out.println("list setelah simpul terakhir dihapus : ");
        printList_3003(head_3003);

        int position_3003 = 2;
        head_3003 = deleteNode_3003(head_3003, position_3003);
        System.out.println("list setelah posisi 2 dihapus : ");
        printList_3003(head_3003);
    }
}
