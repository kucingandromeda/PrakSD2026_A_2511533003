package pekan9_2511533003;

public class BTree_2511533003 {

    private Node_2511533003 root_3003;
    private Node_2511533003 currentNode_3003;

    public BTree_2511533003() {
        this.root_3003 = null;
    }

    private boolean search_3003(Node_2511533003 node_3003, int data_3003) {
        if (node_3003.getData_3003() == data_3003) {
            return true;
        }

        if (node_3003.getLeft_3003() != null) {
            if (search_3003(node_3003.getLeft_3003(), data_3003)) {
                return true;
            }
        }

        if (node_3003.getRight_3003() != null) {
            if (search_3003(node_3003.getRight_3003(), data_3003)) {
                return true;
            }
        }

        return false;
    }

    public boolean search_3003(int data_3003) {
        return search_3003(this.root_3003, data_3003);
    }

    public void printinOrder_3003() {
        this.root_3003.printInorder_3003(this.root_3003);
    }

    public void printPreOrder_3003() {
        this.root_3003.printPreorder_3003(this.root_3003);
    }

    public void printPostOrder_3003() {
        this.root_3003.printPostorder_3003(this.root_3003);
    }

    public Node_2511533003 getRoot_3003() {
        return this.root_3003;
    }

    public boolean isEmpty_3003() {
        return this.root_3003 == null;
    }

    public int countNodes_3003() {
        return this.countNodes_3003(this.root_3003);
    }

    public int countNodes_3003(Node_2511533003 node_3003) {
        int count_3003 = 1;
        if (node_3003 == null) {
            return 0;
        } else {
            count_3003 += countNodes_3003(node_3003.getLeft_3003());
            count_3003 += countNodes_3003(node_3003.getRight_3003());
            return count_3003;
        }
    }

    public void print_3003() {
        this.root_3003.print_3003();
    }

    public Node_2511533003 getCurrent_3003() {
        return currentNode_3003;
    }

    public void setCurrent_3003(Node_2511533003 node_3003) {
        this.currentNode_3003 = node_3003;
    }

    public void setRoot_3003(Node_2511533003 root_3003) {
        this.root_3003 = root_3003;
    }
}
