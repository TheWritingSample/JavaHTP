// April 14 2022
// Summing integers with the for statement

public class Sum505 {
	public static void main(String[] args) {
		int total = 0;
		
		// total even integers from 2 through 20
		for (int number = 2; number <= 20; number += 2) {
			total += number;
		} // end for loop
		
		System.out.printf("Sum is %d%n", total);
	
	
	} // end main

} // end class
