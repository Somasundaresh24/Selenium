package week3.day1;

public class SBI extends RBI{

	public void fixedDeposit() {
		super.fixedDeposit();//to call the super class/parent class
		System.out.println("14.5% Interest rate");
	}
	
	public static void main(String[] args) {
		SBI ban =new SBI();
		ban.fixedDeposit();
	}
}
