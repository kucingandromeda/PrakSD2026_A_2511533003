package pekan7_2511533003;

public class InsertionSort_2511533003 {

    public static void insertionSort(int[] arr_3003) {
        int n_3003 = arr_3003.length;
        for (int i_3003 = 1; i_3003 < n_3003; i_3003++) {
            int key_3003 = arr_3003[i_3003];
            int j_3003 = i_3003 - 1;

            while (j_3003 >= 0 && arr_3003[j_3003] > key_3003) {
                arr_3003[j_3003 + 1] = arr_3003[j_3003];
                j_3003--;
            }
            arr_3003[j_3003 + 1] = key_3003;
        }
    }

    public static void main(String[] args) {
        int arr_3003[] = { 23, 78, 45, 8, 32, 52, 1 };

        int n_3003 = arr_3003.length;

        System.out.printf("Array Yang Belum Terurut:\n");
        for (int i_3003 = 0; i_3003 < n_3003; i_3003++) System.out.print(
            arr_3003[i_3003] + " "
        );
        System.out.println();

        insertionSort(arr_3003);

        System.out.printf("Array Yang Terurut:\n");
        for (int i_3003 = 0; i_3003 < n_3003; i_3003++) System.out.print(
            arr_3003[i_3003] + " "
        );
        System.out.println();
    }
}
