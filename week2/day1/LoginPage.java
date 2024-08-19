package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        Thread.sleep(3000);
        //get title page
        String title = driver.getTitle();
        if(title.contains("Leaftaps")) {
        	System.out.println("Login is successfull");
        }else {
        	System.out.println("Login is not successfull");
        }
        
  //      driver.findElement(By.linkText("CRM/SFA")).click();
        
        driver.findElement(By.partialLinkText("SFA")).click();
        driver.close();
		
	}

}
