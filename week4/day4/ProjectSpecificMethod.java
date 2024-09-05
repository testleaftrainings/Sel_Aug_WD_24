package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {

	public 	RemoteWebDriver driver;

	//order does not matter from xml file
	@Parameters({"password","url","username","browser"})

	@BeforeMethod
	//seq is matter from @Parameters 
	public void preCondition(String pass,String url,String uName,String browser) {

		//		if(browser.equalsIgnoreCase("Chrome")) {
		//			driver  = new ChromeDriver();	
		//		}else if(browser.equalsIgnoreCase("edge")) {
		//			driver=new EdgeDriver();
		//		}
		switch (browser) {
		case "chrome":
			driver=new ChromeDriver();			
			break;
		case "edge" :
			driver=new EdgeDriver();
			break;
		default:
			System.out.println("NO browser value given");
			break;
		}
		driver.manage().window().maximize();
		//remove the hardcoded values and replace with variable name
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}



	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
