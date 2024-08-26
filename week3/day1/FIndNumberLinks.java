package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIndNumberLinks {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		
		//return type - findElements -List<WebElement>
		List<WebElement> sizeCount = driver.findElements(By.tagName("a"));
		int size = sizeCount.size();
		System.out.println("total link is presented :"+size);
		
		//print all text presented inside tag a
		String text = sizeCount.get(4).getText();
		System.out.println(text);
		
		for (int i = 0; i < sizeCount.size(); i++) {
			String text2 = sizeCount.get(i).getText();
			System.out.println(text2);
			
		}
		
		
	}

}
