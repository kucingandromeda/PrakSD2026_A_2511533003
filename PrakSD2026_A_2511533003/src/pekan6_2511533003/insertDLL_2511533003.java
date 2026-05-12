package pekan6_2511533003;

public class insertDLL_2511533003 {

    static NodeDLL_2511533003 insertBegin_3003(
        NodeDLL_2511533003 head_3003,
        int data_3003
    ) {
        // buat node baru
        NodeDLL_2511533003 new_node_3003 = new NodeDLL_2511533003(data_3003);
        new_node_3003.next_3003 = head_3003;

        if (head_3003 != null) {
            head_3003.prev_3003 = new_node_3003;
        }

        return new_node_3003;
    }

    static NodeDLL_2511533003 insertEnd_3003(
        NodeDLL_2511533003 head_3003,
        int newData_3003
    ) {
        NodeDLL_2511533003 newNode_3003 = new NodeDLL_2511533003(newData_3003);

        if (head_3003 == null) {
            head_3003 = newNode_3003;
        } else {
            NodeDLL_2511533003 curr_3003 = head_3003;
            while (curr_3003.next_3003 != null) {
                curr_3003 = curr_3003.next_3003;
            }
            curr_3003.next_3003 = newNode_3003;
            newNode_3003.prev_3003 = curr_3003;
        }

        return head_3003;
    }

    public static NodeDLL_2511533003 insertAtPosition_3003(
        NodeDLL_2511533003 head_3003,
        int pos_3003,
        int new_data_3003
    ) {
        NodeDLL_2511533003 new_node_3003 = new NodeDLL_2511533003(
            new_data_3003
        );
        if (pos_3003 == 1) {
            new_node_3003.next_3003 = head_3003;
            if (head_3003 != null) {
                head_3003.prev_3003 = new_node_3003;
            }
            head_3003 = new_node_3003;
            return head_3003;
        }

        NodeDLL_2511533003 curr_3003 = head_3003;
        for (
            int i_3003 = 1;
            i_3003 < pos_3003 - 1 && curr_3003 != null;
            ++i_3003
        ) {
            curr_3003 = curr_3003.next_3003;
        }

        if (curr_3003 == null) {
            System.out.println("Posisi Tidak Ada");
            return head_3003;
        }

        new_node_3003.prev_3003 = curr_3003;
        new_node_3003.next_3003 = curr_3003.next_3003;
        curr_3003.next_3003 = new_node_3003;
        if (new_node_3003.next_3003 != null) {
            new_node_3003.next_3003.prev_3003 = new_node_3003;
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
        NodeDLL_2511533003 head_3003 = new NodeDLL_2511533003(2);
        head_3003.next_3003 = new NodeDLL_2511533003(3);
        head_3003.next_3003.prev_3003 = head_3003;
        head_3003.next_3003.next_3003 = new NodeDLL_2511533003(5);
        head_3003.next_3003.next_3003.prev_3003 = head_3003.next_3003;

        System.out.print("DLL Awal: ");
        printList_3003(head_3003);

        head_3003 = insertBegin_3003(head_3003, 1);

        System.out.println("Simpul 1 ditambah diawal: ");
        printList_3003(head_3003);

        System.out.print("Simpul 6 ditambah diakhir: ");
        int data_3003 = 6;
        head_3003 = insertEnd_3003(head_3003, data_3003);

        printList_3003(head_3003);

        System.out.print("tambah Node 4 posisi 4: ");

        int data2_3003 = 4;
        int pos_3003 = 4;
        head_3003 = insertAtPosition_3003(head_3003, pos_3003, data2_3003);
        printList_3003(head_3003);
    }
}
