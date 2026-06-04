package pekan8_2511533003;

public class Sorting_2511533003 {

    static int[] merge_3003(int[] arr_3003) {
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

        int[] left_arr = merge_3003(left_split_3003);
        int left_len = left_arr.length;
        int left_idx = 0;

        int[] right_arr = merge_3003(right_split_3003);
        int right_len = right_arr.length;
        int right_idx = 0;

        int idx = 0;
        int[] result = new int[left_len + right_len];
        while (true) {
            if (left_idx >= left_len) {
                while (right_idx < right_len) {
                    result[idx] = right_arr[right_idx];
                    right_idx += 1;
                    idx += 1;
                }
                break;
            } else if (right_idx >= right_len) {
                while (left_idx < left_len) {
                    result[idx] = left_arr[left_idx];
                    left_idx += 1;
                    idx += 1;
                }
                break;
            }

            int left_value = left_arr[left_idx];
            int right_value = right_arr[right_idx];

            if (left_value < right_value) {
                result[idx] = left_value;
                left_idx += 1;
            } else {
                result[idx] = right_value;
                right_idx += 1;
            }
            idx += 1;
        }

        return result;
    }

    public static void main(String[] args) {
        // System.out.println("sorting");
        int[] array_3003 = {
            10,
            9,
            2,
            3,
            8,
            6,
            5,
            90,
            67,
            1,
            23,
            78,
            56,
            45,
            46,
            47,
            65,
            45,
        };
        int[] result_3003 = merge_3003(array_3003);

        // show result
        for (int i : result_3003) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
