package week2.day4;

public class MyVehicle {

	public static void main(String[] args) {
		Audi audi= new Audi();
		audi.autoGear();
		audi.fourSeater();
		audi.applyBreak();
		audi.soundHorn();
		
		BMW bmw =new BMW();
		bmw.airBags();
		bmw.fourSeater();
		bmw.applyBreak();
		bmw.soundHorn();
		
		Bajaj bj =new Bajaj();
		bj.autoStart();
		bj.applyBreak();
		bj.soundHorn();
		

	}

}
