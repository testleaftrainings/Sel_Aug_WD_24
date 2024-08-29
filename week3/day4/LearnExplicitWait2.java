package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		
		WebElement ins = driver.findElement(By.xpath("//span[contains(text(),'I am about')]"));
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		Boolean until = w.until(ExpectedConditions.invisibilityOf(ins));
		System.out.println(until);
		





	}

}
