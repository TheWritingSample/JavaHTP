// April 05, 2022
// Creating and manipulating an Account object.

import java.util.Scanner;

public class AccountTest306 { 
	public static void main(String[] args) {
		// create two Account objects
		Account305 account1 = new Account305("Jane Green");
		Account305 account2 = new Account305("John Blue");
		
		// display initial value of name for each ACcount
		System.out.printf("account1 name is: %s%n", account1.getName());
		System.out.printf("account2 name is: %s%n", account2.getName());

	} // end method main
}; // end class 