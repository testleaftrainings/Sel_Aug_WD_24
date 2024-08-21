package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath{

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//div[@id='username_container']//input")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("testleaf@2024");
		driver.findElement(By.xpath("//form[@name='login']/input[@id='Login']")).click();
		
	}

}
