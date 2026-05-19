package pekan7_2511533003;

public class SelectionSort_2511533003 {

    public static void selectionSort_3003(int[] arr_3003) {
        int n_3003 = arr_3003.length;

        for (int i_3003 = 0; i_3003 < n_3003; i_3003++) {
            int minIndex_3003 = i_3003;
            for (int j_3003 = i_3003 + 1; j_3003 < n_3003; j_3003++) {
                if (arr_3003[j_3003] < arr_3003[minIndex_3003]) {
                    minIndex_3003 = j_3003;
                }
            }

            int temp_3003 = arr_3003[i_3003];
            arr_3003[i_3003] = arr_3003[minIndex_3003];
            arr_3003[minIndex_3003] = temp_3003;
        }
    }

    public static void main(String[] args) {
        int arr_3003[] = {23, 78, 45, 8, 32, 52, 1};
        int n_3003 = arr_3003.length;

        System.out.printf("Array Yang Belum Terurut:\n");
        for (int i_3003 = 0; i_3003 < n_3003; i_3003++) System.out.print(
            arr_3003[i_3003] + " "
        );
        System.out.println();

        selectionSort_3003(arr_3003);

        System.out.printf("Array Yang Belum Terurut:\n");
        for (int i_3003 = 0; i_3003 < n_3003; i_3003++) System.out.print(
            arr_3003[i_3003] + " "
        );
        System.out.println();
    }
}
