package week1.day3;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {

		int[] mark= {34,35,67,32,56};
		String[] name= {"Dilip","Vinoth","Bhuvanesh"};
		
		//find length of the array
		int length = mark.length;
		System.out.println(length);
		
		//find last value in the array
		System.out.println("print last index value :"+mark[length-1]);
		
		//find first index value 
		System.out.println("print first index value :"+mark[0]);
		
		//find the largest number in the array
		//sort()
		Arrays.sort(mark);
		//32,34,35,56,67
		//0 to 4 -
		System.out.println("print largest value :"+mark[length-1]);
		
		//print all value in console
		for (int i = 0; i < mark.length; i++) {
			System.out.println(mark[i]);
			
		}
		
		for (int i = mark.length-1; i >=0 ; i--) {
			System.out.println(mark[i]);
			
			//ArrayIndexOutOfBoundsException- where you have added length-1
			//where index 5 is present or not 
		}
	}

}
