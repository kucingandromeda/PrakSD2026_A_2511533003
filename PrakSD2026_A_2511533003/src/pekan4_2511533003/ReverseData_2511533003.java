package pekan4_2511533003;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511533003 {

    public static void main(String[] args) {
        Queue<Integer> q_3003 = new LinkedList<Integer>();
        q_3003.add(1);
        q_3003.add(2);
        q_3003.add(3); // [1, 2, 3]
        System.out.println("Sebelum Reverse " + q_3003);
        Stack<Integer> s_3003 = new Stack<Integer>();

        while (!q_3003.isEmpty()) {
            // Q -> S
            s_3003.push(q_3003.remove());
        }

        while (!s_3003.isEmpty()) {
            // S -> Q
            q_3003.add(s_3003.pop());
        }

        System.out.println("Sesudah Reverse = " + q_3003); // [3, 2, 1]
    }
}
