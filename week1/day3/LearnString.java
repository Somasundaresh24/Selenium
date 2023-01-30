package week1.day3;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String literal
		String companyName ="SOrganics";

		String companyName1 ="sOrganics";
		
		//String Object
		String str =new String("organics");
		
		//to find the length of the String
		int length =companyName.length();
		System.out.println(length);
		
		//to convert String to character array
		char[] charArray =companyName.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
		System.out.println(charArray[i]);
		}
		//to retrieve a particular character from string
		System.out.println(companyName.charAt(6));
		
		//to compare two string values
		System.out.println(companyName==companyName1);
		System.out.println(companyName.equals(companyName1));
		//to ignore case sensitivity
		System.out.println(companyName.equalsIgnoreCase(companyName1));
		
		//compare String with matching content
		boolean contains=companyName.contains("nics");
		System.out.println(contains);
		
		int indexOf= companyName.indexOf('n');
		System.out.println(indexOf);
		
		String substring = companyName.substring(2);
		System.out.println(substring);
		
		String substrings = companyName.substring(1, 4);
		System.out.println(substrings);
	}

}
