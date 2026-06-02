package pekan8_2511533003;

public class QuickSort_2511533003 {

    static void swap_3003(int[] arr_3003, int i_3003, int j_3003) {
        int temp_3003 = arr_3003[i_3003];
        arr_3003[i_3003] = arr_3003[j_3003];
        arr_3003[j_3003] = temp_3003;
    }

    static void medianOfThree_3003(
        int[] arr_3003,
        int low_3003,
        int high_3003
    ) {
        int mid_3003 = low_3003 + (high_3003 - low_3003) / 2;

        if (arr_3003[low_3003] > arr_3003[mid_3003]) {
            swap_3003(arr_3003, low_3003, mid_3003);
        }

        if (arr_3003[low_3003] > arr_3003[high_3003]) {
            swap_3003(arr_3003, low_3003, high_3003);
        }

        if (arr_3003[mid_3003] > arr_3003[high_3003]) {
            swap_3003(arr_3003, mid_3003, high_3003);
        }

        swap_3003(arr_3003, mid_3003, high_3003);
    }

    static int partition_3003(int[] arr_3003, int low_3003, int high_3003) {
        medianOfThree_3003(arr_3003, low_3003, high_3003);
        int pivot_3003 = arr_3003[high_3003];
        int i_3003 = (low_3003 - 1);

        for (int j_3003 = low_3003; j_3003 <= high_3003 - 1; j_3003++) {
            if (arr_3003[j_3003] < pivot_3003) {
                i_3003++;
                swap_3003(arr_3003, i_3003, j_3003);
            }
        }
        swap_3003(arr_3003, i_3003 + 1, high_3003);
        return i_3003 + 1;
    }

    public static void printArr_3003(int[] arr_3003) {
        for (int i_3003 : arr_3003) {
            System.out.print(i_3003 + " ");
        }
        System.out.println();
    }

    public static void quickSort_3003(
        int[] arr_3003,
        int low_3003,
        int high_3003
    ) {
        if (low_3003 < high_3003) {
            int pi_3003 = partition_3003(arr_3003, low_3003, high_3003);
            quickSort_3003(arr_3003, low_3003, pi_3003 - 1);
            quickSort_3003(arr_3003, pi_3003 + 1, high_3003);
        }
    }

    public static void main(String[] args) {
        int[] arr_3003 = { 3, 10, 4, 6, 8, 9, 7, 2, 1, 5 };
        int N_3003 = arr_3003.length;

        System.out.print("Data Sebelum Diurutkan: ");
        printArr_3003(arr_3003);

        quickSort_3003(arr_3003, 0, N_3003 - 1);

        System.out.print("Data Terurut quicksort: ");
        printArr_3003(arr_3003);
    }
}
