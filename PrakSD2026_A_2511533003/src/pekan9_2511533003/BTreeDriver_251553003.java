package pekan9_2511533003;

public class BTreeDriver_251553003 {

    public static void main(String[] args) {
        BTree_2511533003 tree_3003 = new BTree_2511533003();
        System.out.println("Jumlah Simpul Awal Awal Pohon: ");
        System.out.println(tree_3003.countNodes_3003());

        Node_2511533003 root_3003 = new Node_2511533003(1);

        tree_3003.setRoot_3003(root_3003);
        System.out.println("Jumlah simpul jika hanya ada root");
        System.out.println(tree_3003.countNodes_3003());

        Node_2511533003 node2_3003 = new Node_2511533003(2);
        Node_2511533003 node3_3003 = new Node_2511533003(3);
        Node_2511533003 node4_3003 = new Node_2511533003(4);
        Node_2511533003 node5_3003 = new Node_2511533003(5);
        Node_2511533003 node6_3003 = new Node_2511533003(6);
        Node_2511533003 node7_3003 = new Node_2511533003(7);
        Node_2511533003 node8_3003 = new Node_2511533003(8);
        Node_2511533003 node9_3003 = new Node_2511533003(9);

        root_3003.setLeft_3003(node2_3003);
        node2_3003.setLeft_3003(node4_3003);
        node2_3003.setRight_3003(node5_3003);
        node4_3003.setRight_3003(node8_3003);
        root_3003.setRight_3003(node3_3003);
        node3_3003.setLeft_3003(node6_3003);
        node3_3003.setRight_3003(node7_3003);
        node6_3003.setLeft_3003(node9_3003);

        tree_3003.setCurrent_3003(tree_3003.getRoot_3003());
        System.out.println("Menampilkan Simpul Terakhir: ");
        System.out.println(tree_3003.getCurrent_3003().getData_3003());
        System.out.println("Jumlah Simpul setelah simpul 7 ditambahkan");
        System.out.println(tree_3003.countNodes_3003());
        System.out.println("inOrder: ");
        tree_3003.printinOrder_3003();
        System.out.println("\npreOrder: ");
        tree_3003.printPreOrder_3003();
        System.out.println("\npostOrder: ");
        tree_3003.printPostOrder_3003();
        System.out.println("Menampilkan Tree Dalam Bnetuk Pohon");
        tree_3003.print_3003();
    }
}
