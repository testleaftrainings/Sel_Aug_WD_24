package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//getWindowHandle- 1 address
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		System.out.println(driver.getTitle());
		
		//getWindowHandles -all opened browser window address
		Set<String> allwindow= driver.getWindowHandles();
		System.out.println(allwindow);
		
		//get()
		//convert set into list
		List<String> childWindow=new ArrayList<String>(allwindow);
		
		//switch to the child window
		driver.switchTo().window(childWindow.get(1));
		
		//print the title child window
		String title = driver.getTitle();
		System.out.println("Child window name :"+title);
		driver.findElement(By.id("email")).sendKeys("dilip@testleaf.com");
		
		//close the childwindow
		driver.close();
		//again switch to parent window
		driver.switchTo().window(childWindow.get(0));
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		
		//driver.quit();
		
		Set<String> anotherchild = driver.getWindowHandles();
		System.out.println(anotherchild);
		
		
	}

}
