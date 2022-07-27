//April 04, 2022
//Addition program that inputs two numbers then displays their sum.
import java.util.Scanner; // program uses class Scanner

public class Welcome207 {
	// main method begins execution of Java application
	public static void main(String[] args) {
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: "); // prompt
		int number1 = input.nextInt(); // read first number from user
		
		System.out.print("Enter second integer: "); // prompt
		int number2 = input.nextInt(); // read second number from user
		
		int sum = number1 + number2; // add numbers, then store total in sum
		int product = number1 * number2; // multiply numbers, then store total in product
		int difference = number1 - number2; // subtract numbers, then store the total in difference
		
		System.out.printf("Sum is %d%n:", sum); // display sum
		System.out.printf("Product is %d%n:", product); // display product
		System.out.printf("Difference is %d%n:", difference); // display difference
		
	} // end method main
}; // end class Welcome