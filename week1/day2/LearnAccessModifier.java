package week1.day2;

public class LearnAccessModifier {

	public void accessATM() {
		// TODO Auto-generated method stub
		System.out.println("Cash Withdraw");
	}
	private void creditcard() {
		// TODO Auto-generated method stub
      System.out.println("Do not Share it");
	}
	
	void spellcheck() {
		System.out.println("Check Properly");
	}
	
	public static void main(String[] args) {
		LearnAccessModifier lam=new LearnAccessModifier();
		lam.accessATM();
		lam.creditcard();
		lam.spellcheck();
	}
}
