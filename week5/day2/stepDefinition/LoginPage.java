package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethod{

	
	
	@Given("Launch the Browser and Load the Url")
	public void launch_the_browser_and_load_the_url() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@When("Enter the username as {string}")
	public void enter_the_username_as_demo_sales_manager(String user) {
		driver.findElement(By.id("username")).sendKeys(user);
	}

	@When("Enter the passWord as {string}")
	public void enter_the_pass_word_as_crmsfa(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	   
	}

	@When("Click on Login Button")
	public void click_on_login_button() {
        driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("Verfiy the login is Successful")
	public void verfiy_the_login_is_successful() {
		String title = driver.getTitle();
		if(title.contains("Leaftaps")) {
			System.out.println("Login Successful");
		}else {
			System.out.println("Login is not Successful");
		}
	    
	}
	
	
	@But("Verfiy the login is not Successful")
	public void negativeLogin() {
		String title = driver.getTitle();
		if(title.contains("Leaftaps")) {
			System.out.println("Login is not Successful");
		}else {
			System.out.println("Login is  Successful");
		}
	}
	
}
