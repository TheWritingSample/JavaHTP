// April 05, 2022
// Calculate the total marks obtained in three tests
import java.util.Scanner; // program uses class Scanner

public class Welcome26ASE {
	// main method begins execution of Java application
	public static void main(String[] args) {
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter marks in first test: "); // prompt
		int t1 = input.nextInt(); // read from user
		
		System.out.print("Enter marks in first test: "); // prompt
		int t2 = input.nextInt(); // read from user
		
		System.out.print("Enter marks in first test: "); // prompt
		int t3 = input.nextInt(); // read from user
		
		int total = t1 + t2 + t3; // calculate total
		
		System.out.printf("Total marks for three tests: %d%n", total);
		
	} // end method main
}; // end class 