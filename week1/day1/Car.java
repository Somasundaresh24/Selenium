package week1.day1;

public class Car {

	public void driveCar() {
		System.out.println("Drive the CAR carefully");
	}
	private void applyBreak() {
		// TODO Auto-generated method stub
		System.out.println("Stop the Car");
	} 
	
	public static void main(String[] args) {
		Car objNm =new Car();
		objNm.applyBreak();
		objNm.driveCar();
		System.out.println("Complete")
	}
	
}

