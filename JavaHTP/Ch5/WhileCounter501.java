// April 14 2022
// Counter-controlled iteration with the while iteration statement.

public class WhileCounter501 {
	public static void main(String[] args) {
		int counter = 1; // declare and initialize control variable
		
		while (counter <= 10) { // loop-continuation condition
			System.out.printf("%d ", counter);
			++counter; // increment control variable
		} // end while
		
		System.out.println();
	} // end main

} // end class
