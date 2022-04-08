// April 07, 2022 
// Student class that stores a student name and average.

public class Student404 {
	private String name;
	private double average;
	
	// constructor initializes instance variables
	public Student(String name, double average) {
		this.name = name;
		
		// validate that average is > 0.0 and <= 100.0; otherwise, 
		// keep instance variable average's default value (0.0)
		if (average > 0.0) {
			if (average <= 100.0) {
				this.average = average; // assign to instance variable
			}
		}
	}

}
