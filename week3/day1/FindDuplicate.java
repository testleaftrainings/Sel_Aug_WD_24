package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {

	public static void main(String[] args) {
		
		int[] age= {23,43,12,45,32,76,78,54,33,45,32};
		
		List<Integer> value=new ArrayList<Integer>();
		
		//for each loop
		for (Integer i : age) {
			value.add(i);
		}
		System.out.println(value);
		
	}
}
