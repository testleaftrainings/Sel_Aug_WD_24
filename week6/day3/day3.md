Week6.day3:




Steps to Integrate Extent Report with POM:
---------------------------------
1. Create startReport() with @BeforeSuite in BaseClass or PSM and copy  step1 to step3 code from extent report
2. Make ExtentReports as global  and static variable
3. Create stopReport() with @AfterSuite to have ExtentReports Objectname (extent).flush()
4. Create testDetails() with @BeforeClass for test case details code
5. Declare ExtentTest test as global and static variable
6. Create 4 global variables testName, testDescription, testAuthor and testCategory
7. Relace the hardcoded values with the respective variable names
8. Assign the values for the variables in the setValues() in the testcases    @BeforeTest 
9. Create reportStep(String stepDetails, String status) in the PSM with conditional implementation for pass / fail
10. methods in pages should have try / catch implementation
11. call the reportStep() with pass status from try block & with pass and fail status 


@BeforeSuite -startReport
  @BeforeTest - testDeatils(name.dscr,aut,cate)
    @BeforeClass -testDetails,screenShot
       @DataProvider
      @BeforeMethod
          @Test 
      @AfterMethod
    @AfterClass
  @AfterTest
@AfterSuite     -stopReport     






<!-- https://mvnrepository.com/artifact/org.aeonbits.owner/owner -->
<dependency>
    <groupId>org.aeonbits.owner</groupId>
    <artifactId>owner</artifactId>
    <version>1.0.12</version>
</dependency>


The Owner library and Configuration Manager are used to manage configuration settings in Java projects, particularly for Selenium and other automated testing environments. These tools provide a more organized, flexible, and maintainable way of handling configuration parameters compared to traditional methods (e.g., hardcoding or reading from .properties files).

1. Owner Library:
The Owner library is a framework that simplifies the management of configuration properties in Java. It provides a way to bind properties to Java interfaces, which makes configuration more type-safe, maintainable, and easier to use. It allows you to load configuration from various sources like .properties files, system properties, and environment variables.

Key Features:
Type-safe: Provides type-safe access to configuration properties.
Annotations: Uses annotations to define configuration keys.
Multiple Sources: Supports multiple sources of configuration (files, environment variables, system properties, etc.).
Automatic Defaults: Allows setting default values for configuration keys.
Example:
Consider a typical .properties file containing some configuration for a Selenium test:

properties
Copy code
url=https://example.com
timeout=5000
browser=chrome



Using the Owner library, you can map this configuration to an interface like this:

Step 1: Define a Configuration Interface
java
Copy code
import org.aeonbits.owner.Config;

public interface WebDriverConfig extends Config {
    @DefaultValue("https://example.com")
    String url();
    
    @DefaultValue("chrome")
    String browser();
    
    @DefaultValue("5000")
    int timeout();
}