package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement dd = driver.findElement(By.className("ui-selectonemenu"));
		//webElement- reuse the data again
		//returnType findElement()= WebElement
		
		//object Select class
		Select opt=new Select(dd);
		//opt.selectByIndex(1);
		
		opt.selectByVisibleText("Puppeteer");
		
	
		//non select dropdown
		driver.findElement(By.id("j_idt87:country_label")).click();
		
		driver.findElement(By.id("j_idt87:country_3")).click();
		
		
		
		
		
	}

}
