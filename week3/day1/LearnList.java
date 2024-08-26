package week3.day1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {


		List<String> mentors=new ArrayList<String>();
		
		mentors.add("Bhuvanesh");
		mentors.add("Vinoth");
		mentors.add("Vineeth");
		mentors.add("Dilip");
		mentors.add("Vinoth");
		
		System.out.println("Print mentors list :"+mentors);
		
		//list index value start from '0'
		mentors.add(2, "Dilip");
		System.out.println("Print mentors list after adding in 2nd position :"+mentors);

		//size
		int mentorsSize = mentors.size();
		System.out.println("length of the list :"+mentorsSize);
		
		//contains
		boolean contains = mentors.contains("vineeth");
		System.out.println(contains);
		
		//remove
		String remove = mentors.remove(3);
		System.out.println("updated list :"+mentors);
		
		//get
		String string = mentors.get(4);
		System.out.println(string);
		
		//sorting
		Collections.sort(mentors);
		System.out.println("after sorting the list :"+mentors);
		
		//for loop
		for (int i = 0; i < mentors.size(); i++) {
		System.out.println(mentors.get(i));
		}
		//collection list and set
		//foreach loop
		
		//clear
		mentors.clear();
		System.out.println(mentors);
	
		
		
	}

}
