// April 14 2022
// Calculate the product of the integers from 1 to 5

public class Product46E {
	public static void main(String[] args) {
		int product = 1; // stores product of integers 1 to 5
		int a = 1; // counter
		
			while (a <= 5) { // loop 5 times
				product *= a ; // multiply a to product
				++a; // increment a
			} // end while
			
		System.out.printf("The product is: %d%n", product);
	} // end main

} // end class
