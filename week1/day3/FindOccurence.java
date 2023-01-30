package week1.day3;

public class FindOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="SomaSundaresh";
		char[] ch=str.toCharArray();
		char expChar='S';
		int count=0;
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]==expChar) {//ch[0]-S==o
				count++;
				
			}
		}
		System.out.println("In string "+str+" the character "+expChar+" is repeating"+count+"times");
	}

}
