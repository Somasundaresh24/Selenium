package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicates {

	public static void main(String[] args) {
	
		int[] nums = {4,5,2,3,6,7,3,4,2,1};
		//output 2,3,4
		
		Set<Integer> uniq = new TreeSet();
		Set<Integer> unique = new HashSet();
		for (int i = 0; i < nums.length; i++) {
			
			boolean add = unique.add(nums[i]);
			if(!add) {
			System.out.println(nums[i]);
		}
		
	}

}
}
