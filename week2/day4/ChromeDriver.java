package week2.day4;

public class ChromeDriver extends ChrominumDriver {

	public void browser() {

		System.out.println("its coming from ChromeDriver- browser()");
	}
	
	
	public static void main(String[] args) {
		ChromeDriver dr=new ChromeDriver();
		dr.browser();
		dr.chrome();
		dr.driver();
	}
}
