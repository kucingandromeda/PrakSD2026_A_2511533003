package pekan5_2511533003;

public class TambahSLL_2511533003 {

    public static NodeSLL_2511533003 insertAtFront_3003(
        NodeSLL_2511533003 head_3003,
        int value_3003
    ) {
        NodeSLL_2511533003 new_node_3003 = new NodeSLL_2511533003(value_3003);
        new_node_3003.next_3003 = head_3003;
        return new_node_3003;
    }

    public static NodeSLL_2511533003 insertAtEnd_3003(
        NodeSLL_2511533003 head_3003,
        int value_3003
    ) {
        NodeSLL_2511533003 newNode3003 = new NodeSLL_2511533003(value_3003);

        if (head_3003 == null) {
            return newNode3003;
        }

        NodeSLL_2511533003 last_3003 = head_3003;

        while (last_3003.next_3003 != null) {
            last_3003 = last_3003.next_3003;
        }

        last_3003.next_3003 = newNode3003;

        return head_3003;
    }

    static NodeSLL_2511533003 GetNode_3003(int data_3003) {
        return new NodeSLL_2511533003(data_3003);
    }

    static NodeSLL_2511533003 insertPos_3003(
        NodeSLL_2511533003 headNode_3003,
        int position_3003,
        int value_3003
    ) {
        NodeSLL_2511533003 head_3003 = headNode_3003;
        if (position_3003 < 1) System.out.println("Invalid Position");

        if (position_3003 == 1) {
            NodeSLL_2511533003 new_node_3003 = new NodeSLL_2511533003(
                value_3003
            );
            new_node_3003.next_3003 = head_3003;
            return new_node_3003;
        } else {
            while (position_3003-- != 0) {
                if (position_3003 == 1) {
                    NodeSLL_2511533003 newNode_3003 = GetNode_3003(value_3003);
                    newNode_3003.next_3003 = headNode_3003.next_3003;
                    headNode_3003.next_3003 = newNode_3003;
                    break;
                }
                headNode_3003 = headNode_3003.next_3003;
            }

            if (position_3003 != 1) System.out.println(
                "Posisi di luar jangkauan"
            );

            return head_3003;
        }
    }

    public static void printList_3003(NodeSLL_2511533003 head_3003) {
        NodeSLL_2511533003 curr_3003 = head_3003;

        while (curr_3003.next_3003 != null) {
            System.out.print(curr_3003.data_3003 + "-->");
            curr_3003 = curr_3003.next_3003;
        }

        if (curr_3003.next_3003 == null) {
            System.out.print(curr_3003.data_3003);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NodeSLL_2511533003 head_3003 = new NodeSLL_2511533003(2);
        head_3003.next_3003 = new NodeSLL_2511533003(3);
        head_3003.next_3003.next_3003 = new NodeSLL_2511533003(5);
        head_3003.next_3003.next_3003.next_3003 = new NodeSLL_2511533003(6);

        System.out.print("Senarai berantai awal:");
        printList_3003(head_3003);

        System.out.print("Tambah 1 simpul di depan: ");
        int data_3003 = 1;
        head_3003 = insertAtFront_3003(head_3003, data_3003);

        printList_3003(head_3003);

        System.out.print("Tambah 1 simpul di belakang: ");
        int data2_3003 = 7;
        head_3003 = insertAtEnd_3003(head_3003, data2_3003);

        printList_3003(head_3003);

        System.out.print("Tambah 1 simpul ke data 4: ");
        int data3_3003 = 4;
        int pos_3003 = 4;
        head_3003 = insertPos_3003(head_3003, pos_3003, data3_3003);

        printList_3003(head_3003);
    }
}
