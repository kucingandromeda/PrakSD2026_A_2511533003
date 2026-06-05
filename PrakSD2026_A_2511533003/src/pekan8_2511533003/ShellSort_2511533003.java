package pekan8_2511533003;

public class ShellSort_2511533003 {

    public static void shellSort_3003(int[] A_3003) {
        int n_3003 = A_3003.length;
        int gap_3003 = n_3003 / 2;
        while (gap_3003 > 0) {
            for (int i_3003 = gap_3003; i_3003 < n_3003; i_3003++) {
                int temp_3003 = A_3003[i_3003];
                int j_3003 = i_3003;
                while (
                    j_3003 >= gap_3003 && A_3003[j_3003 - gap_3003] > temp_3003
                ) {
                    A_3003[j_3003] = A_3003[j_3003 - gap_3003];
                    j_3003 = j_3003 - gap_3003;
                }
                A_3003[j_3003] = temp_3003;
            }

            gap_3003 = gap_3003 / 2;
        }
    }

    public static void printArray_3003(int[] arr_3003) {
        for (int i_3003 : arr_3003) {
            System.out.print(i_3003 + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] data_3003 = { 3, 10, 4, 6, 8, 9, 7, 2, 1, 5 };

        System.out.print("Sebelum: ");
        printArray_3003(data_3003);

        shellSort_3003(data_3003);

        System.out.print("Sesidah (ShellSort): ");
        printArray_3003(data_3003);
    }
}
