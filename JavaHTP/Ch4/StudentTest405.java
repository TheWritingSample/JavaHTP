// April 08, 2022 
// Create and test Student objects.

public class StudentTest405 {
	public static void main(String[] args) {
		Student404 account1 = new Student404("Jane Green", 93.5);
		Student404 account2 = new Student404("John Blue", 72.75);
		
		System.out.printf("%s's letter grade is: %s%n",
				account1.getName(), account1.getLetterGrade());
		System.out.printf("%s's letter grade is: %s%n",
				account2.getName(), account2.getLetterGrade());
	}

	

}
