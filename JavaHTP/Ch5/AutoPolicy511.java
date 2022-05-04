// April 22 2022  
// Class that represents an auto insurance policy.



public class AutoPolicy511 {
	private int accountNumber; // policy account number
	private String makeAndModel; // car that the policy applies to
	private String state; // to-letter state abbreviation
	
	//constructor
	public AutoPolicy(int accountNumber, String makeAndModel, String state) {
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		this.state = state;
	}
	
	// sets the accountNumber
	public void setAccountNumber(int accountNumber) {
		this.accountNumber;
	}
	
	// returns the accountNumber
	public int getAccountNumber() 
	
	
	
	
	public static void main(String[] args) {
		int total = 0; // sum of grades
		int gradeCounter = 0; // number of grades entered
		int aCount = 0; // count of A grades
		int bCount = 0; // count of B grades
		int cCount = 0; // count of C grades
		int dCount = 0; // count of D grades
		int fCount = 0; // count of F grades
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s%n%s%n    %s%n    %s%n", 
				"Enter the integer grades in the range 0-100.",
				"Type the end-of-file indicator to terminate input:",
				"On UNIX/Linux/macOS type <Ctrl> d then press Enter",
				"On Windows type <Ctrl> z then press Enter");
		
		// loop until user enters the end-of-file indicator
		while (input.hasNext()) {
			int grade = input.nextInt(); // read grade 
			total += grade; // add grade to total
			++gradeCounter; // increment number of grades
			
			// increment appropriate letter-grade counter
			switch (grade / 10) {
				case 9: // grade was between 90
				case 10: // and 100, inclusive
					++aCount;
					break; // exits switch
				case 8: // grade was between 80 and 89
					++bCount;
					break; // exits switch
				case 7: // grade was between 70 and 79
					++cCount;
					break; // exits switch
				case 6: // grade was between 60 and 69
					++dCount;
					break; // exits switch
				default: // grade was less than 60
					++fCount;
					break; // optional; exits switch anyway
			}
		}
		
		// display grade report
		System.out.printf("%nGrade Report:%n");
		
		// if user entered at least on grade...
		if (gradeCounter != 0) {
			// calculate average of all grades entered
			double average = (double) total / gradeCounter;
			
			// output summary of results
			System.out.printf("Total of the %d grades entered is %d%n",
				gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);
			System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
				"Number of students who received each grade:", 
				"A: ", aCount, // display number of A grades
				"B: ", bCount, // display number of B grades
				"C: ", cCount, // display number of C grades
				"D: ", dCount, // display number of D grades
				"F: ", fCount); // display number of F grades
				
		}
		else { // no grades were entered, so output appropriate message
			System.out.println("No grades were entered");
		}
	}

}
