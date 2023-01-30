package week3.day1;

public class Bicycle extends ElectricCycle implements Vehicle{

	public void applyBreak() {
		System.out.println("Break applied");
	}

	public void soundHorn() {
		System.out.println("From Bicycle class");
	}

	public void changeGear() {
		// TODO Auto-generated method stub
		System.out.println("auto gear");
	}

	public static void main(String[] args) {
		Bicycle v=new Bicycle();
		v.applyBreak();
		v.changeGear();
		v.soundHorn();
		
	}

	@Override
	public void seat() {
		// TODO Auto-generated method stub
		
	}
	
}
