package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		//step 1
		ChromeDriver driver=new ChromeDriver();
		
		//step 2 max the screen
		driver.manage().window().maximize();
		
		//step 3 load the url
		driver.get("https://www.webex.com");
		
		//step 4 close the browser
		driver.close();
		
	}

}
