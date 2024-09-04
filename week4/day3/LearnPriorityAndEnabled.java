package week4.day3;

import org.testng.annotations.Test;

public class LearnPriorityAndEnabled {

	//if i am not setting priority it be as default value =0 and check ascii value
	//lowest value -accept the -ve value
	
	@Test
	public void editLead() {
		System.out.println("Edit");
	}
	
	@Test(priority=2)
	public void createLead() {
		System.out.println("Create");
	}
	
	
	@Test(priority=-1,enabled=false)
	public void deleteLead() {
		System.out.println("Delete");
	}
	
	@Test(enabled=false)
	public void duplicateLead() {
		System.out.println("Duplicate");
	}
}
