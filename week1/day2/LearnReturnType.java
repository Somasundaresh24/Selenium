package week1.day2;

public class LearnReturnType {

		
		public void addTwoNumbers() {
			
		int num1= 10;
		int num2=24;
		
		System.out.println(num1+num2);
	}
		private int subTwoNumbers(int num1,int num2) {
			// TODO Auto-generated method stub
			return num1-num2;
		}
		 
		public boolean switchoff() {
			return true;
		}
		private String getPhoneCo() {
			return "Red";
		}
		
		public static void main(String[] args) {
		
			LearnReturnType lar=new LearnReturnType();
			lar.addTwoNumbers();
			int result= lar.subTwoNumbers(24, 10);
			System.out.println(result);
			System.out.println(lar.subTwoNumbers(24, 12));
			System.out.println(lar.switchoff());
			String phoneColor = lar.getPhoneCo();
			
			System.out.println(phoneColor);
		}
		

}
