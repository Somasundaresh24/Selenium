package week1.day3;

import java.util.Arrays;

public class FindOccurenceNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {78,34,67,98,84,93,28,91,78,78,61,100,78};
		int findNum=78;
		int count=0;
//		28-0
//		34-1
//		61
//		67
//		78
//		78
//		78
//		78
//		84
//		91
//		93
//		98
//		100-12
		
		Arrays.sort(scores);
		for(int i=0; i<scores.length; i++) {
			if(scores[i]==findNum) {
				count++;
			}
		}
		System.out.println(count);
	}

}
