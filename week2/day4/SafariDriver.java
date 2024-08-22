package week2.day4;

public class SafariDriver  extends ChromeDriver{
	
	public void browser() {
		System.out.println("its safari browser");
	}
	
	
	public static void main(String[] args) {
		SafariDriver sd=new SafariDriver();
		sd.browser();
	}

}
