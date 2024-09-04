package week4.day3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnAnnotation {
  @Test
  public void createLead() {
	  System.out.println("CreateLead @Test");
  }
  
  @Test
  public void editLead() {
	  System.out.println("EditLead @Test");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@BeforeTest");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@AfterTest");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@BeforeSuite");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@AfterSuite");

  }

}
