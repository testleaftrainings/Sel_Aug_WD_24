package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeranFrame {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
		
		//switch frame
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("Click")).click();
		
		//switch back to main page
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
	}

}
