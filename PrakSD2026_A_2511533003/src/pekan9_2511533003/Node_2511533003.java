package pekan9_2511533003;

public class Node_2511533003 {

    int data_3003;
    Node_2511533003 left_3003;
    Node_2511533003 right_3003;

    public Node_2511533003(int data_3003) {
        this.data_3003 = data_3003;
        left_3003 = null;
        right_3003 = null;
    }

    public void setLeft_3003(Node_2511533003 node_3003) {
        if (left_3003 == null) left_3003 = node_3003;
    }

    public void setRight_3003(Node_2511533003 node_3003) {
        if (right_3003 == null) right_3003 = node_3003;
    }

    public Node_2511533003 getLeft_3003() {
        return left_3003;
    }

    public Node_2511533003 getRight_3003() {
        return right_3003;
    }

    public int getData_3003() {
        return data_3003;
    }

    public void setData_3003(int data_3003) {
        this.data_3003 = data_3003;
    }

    void printPreorder_3003(Node_2511533003 node_3003) {
        if (node_3003 == null) return;
        System.out.print(node_3003.data_3003 + " ");
        printPreorder_3003(node_3003.left_3003);
        printPreorder_3003(node_3003.right_3003);
    }

    void printPostorder_3003(Node_2511533003 node_3003) {
        if (node_3003 == null) return;
        printPostorder_3003(node_3003.left_3003);
        printPostorder_3003(node_3003.right_3003);
        System.out.print(node_3003.data_3003 + " ");
    }

    void printInorder_3003(Node_2511533003 node) {
        if (node == null) return;
        printInorder_3003(node.left_3003);
        System.out.print(node.data_3003 + " ");
        printInorder_3003(node.right_3003);
    }

    public String print_3003() {
        return this.print_3003("", true, "");
    }

    public String print_3003(
        String prefix_3003,
        boolean isTail_3003,
        String sb_3003
    ) {
        if (right_3003 != null) {
            right_3003.print_3003(
                prefix_3003 + (isTail_3003 ? "|   " : "    "),
                false,
                sb_3003
            );
        }
        System.out.println(
            prefix_3003 + (isTail_3003 ? "\\--" : "/--") + data_3003
        );
        if (left_3003 != null) {
            left_3003.print_3003(
                prefix_3003 + (isTail_3003 ? "    " : "|   "),
                true,
                sb_3003
            );
        }
        return sb_3003;
    }
}
