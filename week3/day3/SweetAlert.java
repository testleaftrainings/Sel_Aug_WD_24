package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SweetAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-closethick']")).click();
	}

}
