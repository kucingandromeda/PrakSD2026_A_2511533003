package pekan3_2511533003;

import java.util.Stack;

public class NilaiMaximum_2511533003 {

	public static int max_3003(Stack<Integer> s_3003){
		Stack<Integer> backup_3003 = new Stack<Integer>();
		int maxValue_3003 = s_3003.pop();
		backup_3003.push(maxValue_3003);

		while (!s_3003.isEmpty()){
			int next_3003 = s_3003.pop();
			backup_3003.push(next_3003);
			maxValue_3003 = Math.max(maxValue_3003, next_3003);
		}

		while (!backup_3003.isEmpty()){
			s_3003.push(backup_3003.pop());
		}

		return maxValue_3003;
	}

	public static void main(String[] args) {
		Stack<Integer> s_3003 = new Stack<Integer>();
		s_3003.push(70);
		s_3003.push(12);
		s_3003.push(20);
		System.out.println("isi stack " + s_3003);
        System.out.println("Stack Teratas " + s_3003.peek());
        System.out.println("Nilai maksimum " + max_3003(s_3003));

	}

}
