package pekan3_2511533003;

import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511533003 {

	public static int postfixEvaluate_3003(String expression_3003){
		Stack<Integer> s_3003 = new Stack<Integer>();
		Scanner input_3003 = new Scanner(expression_3003);

		while (input_3003.hasNext()) { 
			if (input_3003.hasNextInt()){
				s_3003.push(input_3003.nextInt());
			} else {
				String operator_3003 = input_3003.next();
				int operand2_3003 = s_3003.pop();
				int operant1_3003 = s_3003.pop();
				if (operator_3003.equals("+")){
					s_3003.push(operant1_3003 + operand2_3003);
				} else if (operator_3003.equals("-")){
					s_3003.push(operant1_3003 - operand2_3003);
				} else if (operator_3003.equals("*")){
					s_3003.push(operant1_3003 * operand2_3003);
				} else {
					s_3003.push(operant1_3003 / operand2_3003);
				}

			}
		}

		input_3003.close();
		return s_3003.pop();
	}

	public static void main(String[] args) {
		System.out.println("hasil profix= " + postfixEvaluate_3003("5 2 4 * + 7 -"));
	}
}
