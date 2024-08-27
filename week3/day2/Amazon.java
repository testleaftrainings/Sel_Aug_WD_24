package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		WebElement src = driver.findElement(By.id("twotabsearchtextbox"));
		src.sendKeys("phone",Keys.ENTER);
		
		List<WebElement> totalPhonePrice = driver.findElements(By.className("a-price-whole"));
		int size = totalPhonePrice.size();
		System.out.println(size);
		//empty list
		List<Integer> price=new ArrayList<Integer>();
		for (WebElement s: totalPhonePrice) {
			
			
			String text = s.getText();
			//System.out.println(text);
			
			//text="127,79"
			//text=""
			
			//checking if text is null or empty
			if(!text.isEmpty()) {
			String replaceAll = text.replaceAll(",", "");
			//System.out.println(replaceAll);
	
			//convert the string value into integer 
			int parseInt = Integer.parseInt(replaceAll);
			System.out.println(parseInt);	
			price.add(parseInt);
			}
		}
		//list into set to remove duplicate values
		Set<Integer> value=new TreeSet<Integer>(price);
		System.out.println(value);
		int size2 = value.size();
		System.out.println(size2);
		
		//24!=18
		if(size!=size2) {
			System.out.println("Duplicate values");
		}else {
			System.out.println("No Duplicate values");
		}
		
		
		
	}
}
