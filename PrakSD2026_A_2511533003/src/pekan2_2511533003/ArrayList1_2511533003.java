package pekan2_2511533003;

import java.util.ArrayList;

public class ArrayList1_2511533003 {

	public static void main(String[] args) {
		// Size Of ArrayList
		int n = 5;
		// Declaring The ArrayList With Initial size n
		ArrayList<Integer> arrli = new ArrayList<Integer>(n);

		// Appending new Element At The end of the list
		for (int i = 1; i <= n; i++) arrli.add(i);	

		// Printing Element
		System.out.println(arrli);
		// Remove Element At Index 3
		arrli.remove(3);

		// Displaying The ArrayList
		// After Deleting
		System.out.println(arrli);
		
		// Printing Elements one by one
		for (int i = 0; i < arrli.size(); i++) {
			System.out.print(arrli.get(i) + " ");
		}
	}

}
