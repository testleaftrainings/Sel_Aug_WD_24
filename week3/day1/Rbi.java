package week3.day1;

public interface Rbi {

	//below java 1.7 - 100% abstract method
	public void kyc();
	
	public void deposit();
	
	//connect interface with direct class
	
	public void startApp(String url);
	
	public void startApp(String browser, String url);
}
