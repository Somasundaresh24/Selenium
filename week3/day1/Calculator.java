package week3.day1;

public class Calculator {
	
	public void sub() {
		System.out.println(1324);

	}
	public void sub(float a, double b) {
		System.out.println(a-b);

	}
	public void sub(int a, long b) {
		System.out.println(a+b);

	}
	public static void main(String[] args) {
	Calculator cl= new Calculator();
	cl.sub();
	cl.sub(37.3f, 57.157d);
	cl.sub(15, 25360);
	}

}
