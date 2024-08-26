package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//connect class and interface - keyword -implements
public class Sbi implements Rbi{

	public void kyc() {
System.out.println("pan card");		
	}

	public void deposit() {
System.out.println("above 10L");		
	}

	public void startApp(String url) {

		ChromeDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.className(url));
	}

	public void startApp(String browser, String url) {

		
	}
	
	
	public static void main(String[] args) {
		Sbi s=new Sbi();
		s.deposit();
		s.kyc();
		s.startApp("www.testleaf.com");
	}

}
