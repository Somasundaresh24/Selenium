package week3.day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountChartrs {

	public static void main(String[] args) {
		// Character Key , Integer Value
		String cmpyName ="soma sundaresh";
		
		Map<Character, Integer> map =new HashMap<>();
		//Convert String to Charter Array loop through each character add the charater to the map
		//find  the occurence of rach charater
		char[] charArray = cmpyName.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char key= charArray[i];
			if (map.containsKey(key)) {
			Integer value = map.get(key);
			map.put(key, value+1);
			}
			else {
				map.put(key, 1);
			}
		}
		System.out.println(map);
		//print only Single occurence
		for (Entry<Character, Integer> eachEntry : map.entrySet()) {
			if (eachEntry.getValue()==1) {
				System.out.println(eachEntry.getKey());
			}
		}
		//find the maximum occurance char
		int maxOccNum=0;
		char maxOccuChar=0;
				
		for (Entry<Character, Integer> maxChar : map.entrySet()) {
			if (maxChar.getValue()>maxOccNum) {
				maxOccNum=maxChar.getValue();
				maxOccuChar=maxChar.getKey();
			}
		}
		System.out.println("Max occring  "+ maxOccuChar +" occur "+ maxOccNum);
	}

}
