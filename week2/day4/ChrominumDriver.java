package week2.day4;

public class ChrominumDriver  extends RemoteWebDriver{

	public void chrome() {
System.out.println("its coming from ChrominumDriver - chrome()");
	}
	
	
	public static void main(String[] args) {
		ChrominumDriver dr=new ChrominumDriver();
		dr.chrome();
		dr.driver();
	}
}
