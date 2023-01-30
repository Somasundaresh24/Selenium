package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplctString {

	public static void main(String[] args) {
		String name= "google";
		String str="";
		char[] charAray = name.toCharArray();
		System.out.println(charAray);
		Set<Character> uniqe=new LinkedHashSet<>();
		for (int i = 0; i < charAray.length; i++) {
			uniqe.add(charAray[i]);
			
		}
		System.out.println(uniqe);
		for (Character each : uniqe) {
			str=str+each;
		}
	  System.out.println(str);
	}
	
}
