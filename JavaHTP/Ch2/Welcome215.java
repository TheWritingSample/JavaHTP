// April 05, 2022
// Compare integers using if statements, relational operators
// and equality operators
import java.util.Scanner; // program uses class Scanner

public class Welcome215 {
	// main method begins execution of Java application
	public static void main(String[] args) {
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: "); // prompt
		int number1 = input.nextInt(); // read first number from user
		
		System.out.print("Enter second integer: "); // prompt
		int number2 = input.nextInt(); // read second number from user
		
		if (number1 == number2) { // equal
			System.out.printf("%d == %d%n", number1, number2);
		}
		
		if (number1 != number2) { // not equal
			System.out.printf("%d != %d%n", number1, number2);
		}
		
		if (number1 < number2) { // less than
			System.out.printf("%d < %d%n", number1, number2);
		}
		
		if (number1 > number2) { // greater than
			System.out.printf("%d > %d%n", number1, number2);
		}
		
		if (number1 <= number2) { // less than or equal
			System.out.printf("%d <= %d%n", number1, number2);
		}
		
		if (number1 >= number2) { // greater than or equal
			System.out.printf("%d => %d%n", number1, number2);
		}
		
	} // end method main
}; // end class Welcome