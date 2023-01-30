package week1.day2;

public class LearnRelationalOperators {
	public static void main(String[] args) {
		
		int num1= 24;
		int num2= 12;
		int num3= 94;
		
		System.err.println(num1 > num2 && num1 >num3);
		System.err.println(num1 < num2 && num2 >num3);
		System.out.println(num1 != num2);
		System.out.println(num1 == num2);
		System.err.println(num3 <= num2 || num3> num1);
		System.out.println(num1 >= num2);
	}

}
