package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeranNestedFrame {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
		
		//switch frame 1st
		driver.switchTo().frame(2);
		
		//switch frame 2nd
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.id("Click")).click();
		
		//switch parent frame
		driver.switchTo().parentFrame();
		
		//switch back main page
		driver.switchTo().defaultContent();
		
	}

}
