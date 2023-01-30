package week1.day3;

import java.util.Arrays;

public class LearnArrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {78,34,67,98,84,93,28,91,78,78,61,100,78};
		// to find size of array
		//in array length is a property
		int length= scores.length;
		System.out.println("length of array:"+length);
		//to sort an array
		Arrays.sort(scores);
		//index value will be always length-1
		//to retrieve a single element from an array it can fetched based on the index
		System.out.println("Single element of array:"+scores[4]);
		for(int i=0; i<length; i++) {
			System.out.println(scores[i]);
		}
	}

}
