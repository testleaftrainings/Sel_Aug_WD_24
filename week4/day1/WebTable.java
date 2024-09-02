package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {


		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/table.xhtml");
		
		//value presented in 1st row and 1st col
		String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td")).getText();
		System.out.println("1st row and col value :"+text);
		
		
		String text2 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[3]/td[2]")).getText();
		System.out.println("data 3rd row and 2nd col :"+text2);
		
		
		//find no of rows
		List<WebElement> rowValue = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
		int rowSize = rowValue.size();
		System.out.println("row count :"+rowSize);
		
		
		//find no of col
		List<WebElement> colValue = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
		int colSize = colValue.size();
		
		System.out.println("Col count :"+ colSize);
		
		
		//for loop
		
		for (int i = 1; i <=rowSize; i++) {
			
			for (int j = 1; j <=colSize; j++) {
				
				String text3 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(text3);
				
			}
		}
		
		
		
		
		
		
		
	}

}
