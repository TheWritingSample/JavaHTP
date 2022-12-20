/* this program can also be completed using
compound assignment operators. Use the myNumber and magicNumber variables.
*/
public class Magic {
	public static void main(String[] args) {
    int myNumber = 101; // original number
    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;

    System.out.println(stepSix);


	}
}