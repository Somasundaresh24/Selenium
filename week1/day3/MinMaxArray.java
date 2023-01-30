package week1.day3;

import java.util.Arrays;

public class MinMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find min, max value using index
		
		int[]nums = {45,567,67,8787,5657,23,19};
		int count=nums.length;
		Arrays.sort(nums);
		System.out.println("Minimum value :"+nums[0]);
		System.out.println("Maximum value :"+nums[count-1]);
		System.out.println("second Maximum value :"+nums[count-2]);
	}
	

}
