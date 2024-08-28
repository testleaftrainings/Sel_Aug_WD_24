package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
  
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//syntax for Alert
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println("Text presented inside the alert box :"+text);
		
		
		alert.accept();
		
		
		String mgs = driver.findElement(By.id("simple_result")).getText();
		System.out.println(mgs);
		
		
		Thread.sleep(5000);
		//confirmation alert
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		System.out.println(alert.getText());
		alert.dismiss();
		String text2 = driver.findElement(By.id("result")).getText();
		System.out.println(text2);
		
		
		//1.if alert is not presented but trying to handle it
		//NoAlertPresentException
		//alert.accept();
		
		//2.alert present but not handling the alert
		//UnhandledAlertException
		
		
		
		//driver.close();
	}

}
