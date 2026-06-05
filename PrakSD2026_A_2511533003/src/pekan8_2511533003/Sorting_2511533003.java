package pekan8_2511533003;

import java.util.Scanner;

public class Sorting_2511533003 {

    static void swap_3003(Lagu_2511533003[] arr_3003, int i_3003, int j_3003) {
        Lagu_2511533003 temp_3003 = arr_3003[i_3003];
        arr_3003[i_3003] = arr_3003[j_3003];
        arr_3003[j_3003] = temp_3003;
    }

    static void medianOfThree_3003(
        Lagu_2511533003[] arr_3003,
        int low_3003,
        int high_3003
    ) {
        int mid_3003 = low_3003 + (high_3003 - low_3003) / 2;

        if (arr_3003[low_3003].durasi_3003 > arr_3003[mid_3003].durasi_3003) {
            swap_3003(arr_3003, low_3003, mid_3003);
        }

        if (arr_3003[low_3003].durasi_3003 > arr_3003[high_3003].durasi_3003) {
            swap_3003(arr_3003, low_3003, high_3003);
        }

        if (arr_3003[mid_3003].durasi_3003 > arr_3003[high_3003].durasi_3003) {
            swap_3003(arr_3003, mid_3003, high_3003);
        }

        swap_3003(arr_3003, mid_3003, high_3003);
    }

    static int partition_3003(
        Lagu_2511533003[] arr_3003,
        int low_3003,
        int high_3003
    ) {
        medianOfThree_3003(arr_3003, low_3003, high_3003);
        int pivot_3003 = arr_3003[high_3003].durasi_3003;
        int i_3003 = (low_3003 - 1);

        for (int j_3003 = low_3003; j_3003 <= high_3003 - 1; j_3003++) {
            if (arr_3003[j_3003].durasi_3003 < pivot_3003) {
                i_3003++;
                swap_3003(arr_3003, i_3003, j_3003);
            }
        }
        swap_3003(arr_3003, i_3003 + 1, high_3003);
        return i_3003 + 1;
    }

    public static void quickSort_3003(
        Lagu_2511533003[] arr_3003,
        int low_3003,
        int high_3003
    ) {
        if (low_3003 < high_3003) {
            int pi_3003 = partition_3003(arr_3003, low_3003, high_3003);
            quickSort_3003(arr_3003, low_3003, pi_3003 - 1);
            quickSort_3003(arr_3003, pi_3003 + 1, high_3003);
        }
    }

    static int[] mergeSort_3003(int[] arr_3003) {
        if (arr_3003.length == 1) {
            return arr_3003;
        }
        int half_3003 = arr_3003.length / 2;

        // splitting
        int[] left_split_3003 = new int[half_3003];
        int[] right_split_3003 = new int[arr_3003.length - half_3003];
        for (int i_3003 = 0; i_3003 < arr_3003.length; i_3003++) {
            if (i_3003 < half_3003) {
                left_split_3003[i_3003] = arr_3003[i_3003];
            } else {
                right_split_3003[i_3003 - half_3003] = arr_3003[i_3003];
            }
        }

        int[] left_arr_3003 = mergeSort_3003(left_split_3003);
        int left_len_3003 = left_arr_3003.length;
        int left_idx_3003 = 0;

        int[] right_arr_3003 = mergeSort_3003(right_split_3003);
        int right_len_3003 = right_arr_3003.length;
        int right_idx_3003 = 0;

        int idx_3003 = 0;
        int[] result_3003 = new int[left_len_3003 + right_len_3003];
        while (true) {
            if (left_idx_3003 >= left_len_3003) {
                while (right_idx_3003 < right_len_3003) {
                    result_3003[idx_3003] = right_arr_3003[right_idx_3003];
                    right_idx_3003 += 1;
                    idx_3003 += 1;
                }
                break;
            } else if (right_idx_3003 >= right_len_3003) {
                while (left_idx_3003 < left_len_3003) {
                    result_3003[idx_3003] = left_arr_3003[left_idx_3003];
                    left_idx_3003 += 1;
                    idx_3003 += 1;
                }
                break;
            }

            int left_value_3003 = left_arr_3003[left_idx_3003];
            int right_value_3003 = right_arr_3003[right_idx_3003];

            if (left_value_3003 < right_value_3003) {
                result_3003[idx_3003] = left_value_3003;
                left_idx_3003 += 1;
            } else {
                result_3003[idx_3003] = right_value_3003;
                right_idx_3003 += 1;
            }
            idx_3003 += 1;
        }

        return result_3003;
    }

    public static void shellSort(Lagu_2511533003[] A_3003) {
        int n_3003 = A_3003.length;
        int gap_3003 = n_3003 / 2;
        while (gap_3003 > 0) {
            for (int i_3003 = gap_3003; i_3003 < n_3003; i_3003++) {
                Lagu_2511533003 temp_3003 = A_3003[i_3003];
                int j_3003 = i_3003;

                while (
                    j_3003 >= gap_3003 &&
                    A_3003[j_3003 - gap_3003].judul_3003
                        .substring(0, 1)
                        .compareToIgnoreCase(
                            temp_3003.judul_3003.substring(0, 1)
                        ) > 0
                ) {
                    A_3003[j_3003] = A_3003[j_3003 - gap_3003];
                    j_3003 = j_3003 - gap_3003;
                }
                A_3003[j_3003] = temp_3003;
            }

            gap_3003 = gap_3003 / 2;
        }
    }

    static int inputData_3003(Lagu_2511533003[] array_3003, int len_3003) {
        if (len_3003 == 20) {
            System.out.println("Jumlah Lagu Sudah Maksimal");
            return len_3003;
        }

        Scanner scanner_3003 = new Scanner(System.in);

        System.out.println("Masukkan Data Lagu");
        System.out.println("Masukkan Judul");
        String judul_3003 = scanner_3003.nextLine();

        System.out.println("Masukkan Judul");
        String penyanyi_3003 = scanner_3003.nextLine();

        System.out.println("Masukkan Durasi");
        int durasi_3003 = scanner_3003.nextInt();

        System.out.println("Data Berhasil Dibuat");

        array_3003[len_3003] = new Lagu_2511533003(
            judul_3003,
            penyanyi_3003,
            durasi_3003
        );

        len_3003 += 1;
        return len_3003;
    }

    static Boolean pilihAlgo_3003(Lagu_2511533003[] array_3003, int len_3003) {
        if (len_3003 == 0) {
            System.out.print("Data Lagu Kosong");
            return false;
        }

        Scanner scanner_3003 = new Scanner(System.in);
        System.out.print("Pilih Algoritma (1=Shell, 2=Quick, 3=Merge): ");
        int algo_3003 = scanner_3003.nextInt();

        Lagu_2511533003[] array_lagu_3003 = new Lagu_2511533003[len_3003];
        System.out.println("Data Sebelum Sorting: ");
        for (int i_3003 = 0; i_3003 < len_3003; i_3003++) {
            array_lagu_3003[i_3003] = array_3003[i_3003];
            System.out.println(
                i_3003 +
                    ". " +
                    array_3003[i_3003].judul_3003 +
                    " - " +
                    array_3003[i_3003].durasi_3003 +
                    " detik"
            );
        }

        if (algo_3003 == 1) {
            shellSort(array_lagu_3003);
        } else if (algo_3003 == 2) {
            quickSort_3003(array_lagu_3003, 0, array_lagu_3003.length - 1);
        } else {
        }

        System.out.println("Data Setelah Sorting: ");
        for (int i_3003 = 0; i_3003 < len_3003; i_3003++) {
            System.out.println(
                i_3003 +
                    ". " +
                    array_lagu_3003[i_3003].judul_3003 +
                    " - " +
                    array_lagu_3003[i_3003].durasi_3003 +
                    " detik"
            );
        }

        return true;
    }

    public static void main(String[] args) {
        Lagu_2511533003[] array_3003 = new Lagu_2511533003[20];
        int len_3003 = 0;
        Scanner scanner_3003 = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Sorting Playlist NIM: 2411532014 ===");
            System.out.println("1. Masukkan Data");
            System.out.println("2. Mulai Sorting");
            System.out.println("3. Exit");
            System.out.print("pilihan: ");
            int option_3003 = scanner_3003.nextInt();

            if (option_3003 == 1) {
                len_3003 = inputData_3003(array_3003, len_3003);
            } else if (option_3003 == 2) {
                if (pilihAlgo_3003(array_3003, len_3003)) {
                    break;
                }
            } else if (option_3003 == 3) {
                break;
            } else {
            }
        }
    }
}
