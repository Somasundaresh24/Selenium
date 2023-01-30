package week1.day3;

public class PrimeNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =4;
		int rem=0;
		
		for(int i=2; i< num-1; i++) {
			if(num%i==0) {
				System.out.println("Non Prime");
			rem=1;
			break;
			}
		}
		if (rem==0) {
			System.out.println("Prime number");
		}
	}

}
