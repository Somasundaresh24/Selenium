package week1.day1;

import week1.day2.LearnAccessModifier;

public class Mobile {

	private void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("Sms Send Successfuly");
	}
	
	private void takesnap() {
		// TODO Auto-generated method stub
		System.out.println("Smile for snap"); 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mb=new Mobile();
		mb.sendSMS();
		mb.takesnap();
		LearnAccessModifier lam=new LearnAccessModifier();
		lam.accessATM();
		
		
	}

}
