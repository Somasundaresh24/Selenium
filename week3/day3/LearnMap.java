package week3.day3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
		// EmployeeId Key, Employeename value
		
		//Map<Integer, String> mp=new LinkedHashMap<>();
		//Map<Integer, String> mp=new TreeMap<>();
		Map<Integer, String> mp=new HashMap<>();
		mp.put(201, "soma");
		mp.put(202, "Jaya");
		mp.put(203, "venkat");
		mp.put(303, "suresh");
		mp.put(108, "Bema");
		mp.put(54, "Theeran");
		
		mp.remove(202);
		System.out.println(mp);
		
		String strValue = mp.get(108);
		System.out.println(strValue);
		
		Set<Integer> keySet = mp.keySet();
		for (Integer eachKey : keySet) {
			System.out.println(eachKey);
			System.out.println(mp.get(eachKey));
		
			
			System.out.println("*****2nd Method*********");
			Set<Entry<Integer, String>> entrySet = mp.entrySet();
		  for (Entry<Integer, String> eachEntry : entrySet) {
			//System.out.println(eachEntry);
			//System.out.println(eachEntry.getKey());
			  System.out.println(eachEntry.getValue());
		}
		}
		
	}

}
