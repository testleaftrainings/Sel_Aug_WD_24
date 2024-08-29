package week3.day4;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowWithTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();

		Set<String> anotherchild = driver.getWindowHandles();
		System.out.println(anotherchild);
		
		//Set Title page which i need handle
		String desiredTitle="Dashboard";
		String d="Web Table";
		//iterate through all window 
		for (String s : anotherchild) {
			driver.switchTo().window(s);
			
			//then check the title of the window
			if(driver.getTitle().contains(desiredTitle)) {
				String currentUrl = driver.getCurrentUrl();
				System.out.println(currentUrl);
				driver.manage().window().maximize();
				driver.close();	
			}
		}
		//it will come to main window
		driver.switchTo().defaultContent();
	}

}
