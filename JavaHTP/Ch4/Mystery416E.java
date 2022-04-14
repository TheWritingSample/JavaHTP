// April 14 2022
// Mystery exercise

public class Mystery416E {
	public static void main (String[] args) {
		int x = 2;
		int total = 0;
		
		while (x <= 10) {
			int y = x + 2;
			x++;
			total += y;
			System.out.printf("Y is: %d and total is %d\n", y, total);
		} // end while
	} // end main

} // end class
