package week3.day1;

public class LearnOverLoading {

	int sum =0;
	
	//Overloading with 1 argument
	public void sum(int  a) {
		System.out.println(a);
	}
	//Overloading with 2 argument
	public void sum(int  a,int b) {
		System.out.println(a-b);
	}
	//Overloading with 2 argument with different datatypes
	public void sum(int  a, float b) {
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		LearnOverLoading lol =new LearnOverLoading();
		lol.sum(24,13);
		lol.sum(94, 20.00f);
	}
}

