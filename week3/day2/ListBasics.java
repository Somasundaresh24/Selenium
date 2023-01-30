package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListBasics {

	public static void main(String[] args) {
		
		
		List<String> leaders=new ArrayList<String>();
		leaders.add("soma");
		leaders.add("nature");
		leaders.add("sundaresh");
		leaders.add("Jaya");
		leaders.add("suresh");
		leaders.add("sabari");
	
		int size = leaders.size();
		System.out.println(size);
	
		leaders.remove(4);
		System.out.println(leaders);
		leaders.remove("sabari");
		System.out.println(leaders);
		
		leaders.add("venkat");
		System.out.println(leaders);
		leaders.add(5, "uday");
		System.out.println(leaders);
		
		System.out.println(leaders.get(2));
		
		leaders.clear();
		System.out.println(leaders);
	}

}
