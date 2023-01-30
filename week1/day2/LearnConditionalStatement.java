package week1.day2;

public class LearnConditionalStatement {

	public static void main(String[] args) {
		int number = 0;  //check it +ve or -ve
		if (number<0) {
			System.out.println("given no is -ve: "+ number);
		}
		else if (number>0) {
			System.out.println("given no is +ve: "+ number);
		}
		else  {
			System.out.println("given no is neutral: "+ number);
		}
	}

}
