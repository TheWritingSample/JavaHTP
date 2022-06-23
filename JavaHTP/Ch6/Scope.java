// June 23 2022  
// Scope class demonstrates field and local-variable scopes.

import java.security.SecureRandom; // program uses class SecureRandom

public class Scope {
	// filed that is accessible to all methods of this class
	private static int x = 1;
	
	// method main creates and initializes local variable x
	// and calls methods useLocalVariable and useField
	public static void main(String[] args) {
		int x = 5; // method's local variable x shadows field x
		
		System.out.printf("local x in main is %d%n", x);
		
		
		
		
	}
}
