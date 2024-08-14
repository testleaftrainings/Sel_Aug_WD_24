package week1.day3;

import java.util.Arrays;

public class FindDuplicateValue {

	public static void main(String[] args) {
 int[] data= {35,32,77,86,21,35,89,1,77,32};
 
 //method 1: using nested for loop
 //method 2: using single for loop
 
 //have 2 for loop
 //compare values if condition
 
 //outer loop -data[0]=35
 for (int i = 0; i < data.length; i++) {
	
	 //inner loop data[0+1]=data[1] =32
	 for (int j = i+1; j < data.length; j++) {
		 
		 if(data[i]==data[j]) {
			 //data[0]==data[5]
			 //35==35
			 System.out.println("duplicate value is :"+data[i]);
		 }
		
	}
}
 
 //method 2:
 // int[] data= {35,32,77,86,21,35,89,1,77,32};
 //sort value 
 //1,21,32,32,35,35,77,77,86,89
 //compare the next value
 
 Arrays.sort(data);
 for (int i = 0; i <data.length-1; i++) {
	
	 //data[0]==data[1]
	 //data[1]==data[2]
	 if(data[i]==data[i+1]) {
		 System.out.println(data[i+1]);
	 }
}
 
 
 
 
 
	}

}
