
Hybrid FrameWork
================


  How to setup the framework:
---------------------------
1. Navigate to https://github.com/testleaftrainings/makaia_framework
2. Click on Code -> Download ZIP
3. Extract the zip the file in your system
4. Click on File -> Import... in eclipse
5. Select Existing Maven project -> Next in the wizard
6. Browse the extracted folder -> Select folder
7. Click on Finish button in the wizard



How to setup the framework:
---------------------------

1. Extract the zip the file in your system
2. Click on File -> Import... in eclipse
3. Select Existing Maven project -> Next in the wizard
4. Browse the extracted folder -> Select folder
5. Click on Finish button in the wizard






Hybrid Framework -> TestNG + Cucumber 
--------------------------------------
Framework is created using maven project to have better dependency management
Framework is designed based on Page Object model pattern

External libraries that we used in our framework are
Selenium WebDriver -> used to interact with the web application
TestNG -> is used to support controlled test execution
Apache POI -> is used to read the data from excel and support data driven in our framework
Cucumber -> is used to support BDD automation if needed
ExtentReport -> is used to generate HTML summary report

Component:
com.framework.selenium.api.design
	Browser (I) -> Used to design the reusable methods required for browser interaction
	Element (I) -> Used to design the reusable methods required for element interaction
	Loctors (E) -> Used to declare the locators to be used in the framework
	
com.framework.selenium.api.base
	SeleniumBase -> Implementation class for both Browser and Element interfaces
				 -> Wrapper class, contains wrapper methods which are created on top of selenium methods
				 -> library for the automation in our framework
				 -> Exception handling is commonly implemented in all the methods
	DriverInstance -> Contains remoteWebdriver declaration and maintenance			 
com.framework.testng.api.base:
	ProjectSpecificMethods - Its a base class for all the pages and testcases. It contains all the common methods and variables required for the pages and testcases
com.leaftaps.pages:
	All the java classes for each page that we navigate in the application with reusable methods for each action that we do it in respective pages
com.leaftaps.testcases:
    All the java classes for each testcase with sequence of the steps
com.framework.utils:
	DataLibrary - to read the data from excel
	Reporter - ExtentReport configuration
	
data -> to keep the test data files 
reports -> to keep the result.html (ExtentReport)
testng.xml -> which is having the configuration for test execution
pom.xml -> to have the dependencies and the project details



Hierarchy of classes in our framework:
AbstractTestNGCucumberTest
	DriverInstance
		Reporter
			SeleniumBase
				ProjectSpecificMethods
					Pages & TestCase


Execution Flow of a testcase in our framework:
@BeforeSuite					-> startReport() [Reporter]
	@BeforeTest					-> setValues() [TestCase class]
		@BeforeClass			-> startTestCase() [Reporter]
			@DataProvider		-> fetchData() [ProjectSpecificMethods]
				@BeforeMethod	-> preCondition() [ProjectSpecificMethods]
					@Test		-> runLogin() [TestCase class]
				@@AfterMethod	-> postCondition() [ProjectSpecificMethods]
		@AfterClass				-> NA
	@AfterTest					-> NA
@AfterSuite						-> endResult() [Reporter]