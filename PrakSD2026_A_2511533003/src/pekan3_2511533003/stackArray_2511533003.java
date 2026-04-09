package pekan3_2511533003;


public class stackArray_2511533003 {

	static final int MAX_3003 = 1000;
	int top_3003;
	int a_3003[] = new int[MAX_3003];


	boolean isEmpty_3003(){
		return top_3003 < MAX_3003;
	}

    public stackArray_2511533003() {
		top_3003 -= 1;
    }

	boolean push_3003(int x_3003){
		if (top_3003 >= (MAX_3003 - 1)){
			System.out.println("Stack Overflow");
			return false;
		} else {
			a_3003[++top_3003] = x_3003;
			System.out.println(x_3003 + " dimasukkan dalam stack");	
			return true;
		}
	}
	
	int pop_3003(){
		if (top_3003 < 0){
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x_3003 = a_3003[top_3003--];
			return x_3003;
		}
	}

	int peek_3003(){
		if (top_3003 < 0){
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x_3003 = a_3003[top_3003];
			return x_3003;
		}
	}

	void print_3003(){
		for (int i_3003 = top_3003; i_3003 > -1; i_3003--) {
			System.out.print(" " + a_3003[i_3003]);
		}
	}

}
