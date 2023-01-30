package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
	
		int[] nums = {4,5,2,3,6,7,3,4,2,1,7,7,4};
		//output 2,3,4,5,6,7,1
		
		Set<Integer> uniq = new LinkedHashSet();
		Set<Integer> unique = new HashSet();
		for (int i = 0; i < nums.length; i++) {
			unique.add(nums[i]);
			uniq.add(nums[i]);
		}
		System.out.println(unique);
		System.out.println(uniq);
	}

}
