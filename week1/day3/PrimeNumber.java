package week1.day3;

public class PrimeNumber {

	public static void main(String[] args) {
		int num= 7;
		//Check whether the given input is prime number or not
		boolean bPrime= true;
		for (int i = 2; i < num-1; i++) {
			if(num%i==0) {
				System.out.println(num+"Non Prime number");
				bPrime=false;
				break;
			}
		}
		if(bPrime) {
			System.out.println(num+"Prime Number");
		}
	}

}
