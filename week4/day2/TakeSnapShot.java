package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSnapShot {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		WebElement d = driver.findElement(By.id("glow-ingress-block"));
		
		//step1 -take snap
		File ss = d.getScreenshotAs(OutputType.FILE);
		
		//step 2 set path where to store snap
		File des=new File("./snaps/img1.png");
		
		//step 3-combine step1,step 2
		FileUtils.copyFile(ss, des);
	}

}
