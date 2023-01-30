package week3.day2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqChartr {

	public static void main(String[] args) {
		
		String companyName="google ss";
		char charArry[]=companyName.toCharArray();
		
		Set<Character> uniqChartr=new LinkedHashSet<Character>();
		for (int i = 0; i < companyName.length(); i++) {
			uniqChartr.add(charArry[i]);
		}
		System.out.println(uniqChartr);
	}

}
