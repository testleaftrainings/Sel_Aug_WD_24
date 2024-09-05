package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod{

	
	@DataProvider(name="getData")
	public String[][] setValue(){
		//Declare and assign the value
		String[][] data=new String[2][4];
		//index will start from 0
		data[0][0]="TestLeaf";
		data[0][1]="Dilip";
		data[0][2]="Kumar";
		data[0][3]="99602";
		
		
		data[1][0]="TestLeaf";
		data[1][1]="Sakthi";
		data[1][2]="N";
		data[1][3]="993043";
		return data;
		
	}
	
	@Test(dataProvider = "getData")
	public  void runCreate(String cName,String fName,String lName,String phNo) {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		

	}

	
	
}
