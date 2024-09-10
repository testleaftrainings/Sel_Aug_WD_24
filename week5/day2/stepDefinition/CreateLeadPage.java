package stepDefinition;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadPage  extends ProjectSpecificMethod{
	
	

@When("Click Crmsfa Button")
public void click_crmsfa_button() {
	driver.findElement(By.linkText("CRM/SFA")).click();

}

@When("Click on Leads Button")
public void click_on_leads_button() {
	driver.findElement(By.linkText("Leads")).click();

}

@When("Click on CreateLead Button")
public void click_on_create_lead_button() {
	driver.findElement(By.linkText("Create Lead")).click();

   
}

@When("Enter the CompanyName as {string}")
public void enter_the_company_name_as_test_leaf(String comName) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(comName);
   
}

@When("Enter the FirstName as {string}")
public void enter_the_first_name_as_dilip(String fName) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);

   
}

@When("Enter the LastName as {string}")
public void enter_the_last_name_as_kumar(String lName) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);

    
}

@When("Click CreateLead Button")
public void click_create_lead_button() {
	driver.findElement(By.name("submitButton")).click();

    
}

@Then("Verify Lead is Created")
public void verify_lead_is_created() {
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	if (text.contains("Testleaf")) {
		System.out.println("Lead created successfully");
	}
	else {
		System.out.println("Lead is not created");
	}
}

}
