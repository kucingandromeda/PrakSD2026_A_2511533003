package pekan8_2511533003;

public class MergeSort_2511533003 {

    void merge_3003(int[] arr_3003, int l_3003, int m_3003, int r_3003) {
        int n1_3003 = m_3003 - l_3003 + 1;
        int n2_3003 = r_3003 - m_3003;

        int L_3003[] = new int[n1_3003];
        int R_3003[] = new int[n2_3003];

        for (int i_3003 = 0; i_3003 < n1_3003; ++i_3003) L_3003[i_3003] =
            arr_3003[l_3003 + i_3003];

        for (int j_3003 = 0; j_3003 < n2_3003; ++j_3003) R_3003[j_3003] =
            arr_3003[m_3003 + 1 + j_3003];

        int i_3003 = 0,
            j_3003 = 0;

        int k_3003 = l_3003;

        while (i_3003 < n1_3003 && j_3003 < n2_3003) {
            if (L_3003[i_3003] <= R_3003[j_3003]) {
                arr_3003[k_3003] = L_3003[i_3003];
                i_3003++;
            } else {
                arr_3003[k_3003] = R_3003[j_3003];
                j_3003++;
            }
            k_3003++;
        }

        while (i_3003 < n1_3003) {
            arr_3003[k_3003] = L_3003[i_3003];
            i_3003++;
            k_3003++;
        }

        while (j_3003 < n2_3003) {
            arr_3003[k_3003] = R_3003[j_3003];
            j_3003++;
            k_3003++;
        }
    }

    void sort_3003(int[] arr_3003, int l_3003, int r_3003) {
        if (l_3003 < r_3003) {
            int m_3003 = (l_3003 + r_3003) / 2;
            sort_3003(arr_3003, l_3003, m_3003);
            sort_3003(arr_3003, m_3003 + 1, r_3003);
            merge_3003(arr_3003, l_3003, m_3003, r_3003);
        }
    }

    public static void printArray_3003(int[] arr_3003) {
        int n_3003 = arr_3003.length;
        for (int i_3003 = 0; i_3003 < n_3003; i_3003++) {
            System.out.print(arr_3003[i_3003] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr_3003 = { 12, 11, 13, 5, 6, 7 };

        System.out.print("Sebelum Diurutkan: ");
        printArray_3003(arr_3003);

        MergeSort_2511533003 ob_3003 = new MergeSort_2511533003();
        ob_3003.sort_3003(arr_3003, 0, arr_3003.length - 1);

        System.out.println("\nSesudah Terurut Menggunakan Merge Sort: ");
        printArray_3003(arr_3003);
    }
}
