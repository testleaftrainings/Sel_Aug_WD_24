package week3.day1;

//class and abstract class - extends
public class ExecutionClass extends SbiChennai implements InterFaceJava8{

	@Override
	public void startApp(String url) {
System.out.println(url);		
	}

	@Override
	public void startApp(String browser, String url) {
		System.out.println(browser +" "+ url);
	}

	@Override
	public void loan() {
System.out.println("personal loan");		
	}

	public static void main(String[] args) {
		ExecutionClass ec=new ExecutionClass();
		
		ec.deposit();
		ec.kyc();
		ec.loan();
		ec.startApp("testleaf");
		ec.startApp("chrome", "gmail");
		ec.minBalance();
		InterFaceJava8.webElement();
		ec.click();
		
		
		
		
	}
	
	
}
