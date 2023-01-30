package week1.day3;

public class Fibinocci {

	public static void main(String[] args) {
		// output=0 1 1 2 3 5 8 13 21 34 55  89
		
		int num1 =0;
		int num2 =1;
		int sum=0;
		System.out.println(num1);
		System.out.println(num2);
      for(int i=1;i<=10;i++) {
    	  sum=num1+num2; //0+1=1, 1+2=3,2+3, 3+5, 5+8
    	  System.out.println(sum); //2,3,5,8,13
    	  num1=num2; //5
    	  num2=sum;  //8
      }
	}

}
