public class GreaterThanLessThan {
	public static void main(String[] args) {   
		double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;

    boolean canIGraduate = creditsToGraduate < creditsEarned;

    System.out.println(canIGraduate);

    double creditsAfterSeminar = creditsEarned + creditsOfSeminar;

    System.out.println(creditsToGraduate < creditsAfterSeminar);



	}
}
