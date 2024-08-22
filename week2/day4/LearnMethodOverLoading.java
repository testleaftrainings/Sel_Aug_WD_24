package week2.day4;

public class LearnMethodOverLoading {


	public void startApp(String url) {

		System.out.println("Url "+url);
	}
	
	public void startApp(String browser,String url) {

		System.out.println("Browser name :"+browser +"\n"+"Url :"+url);
	}
	
	public void startApp(int noOfBrowser) {

		System.out.println("Number of browser is opend :"+noOfBrowser);
	}
	
	
	public static void main(String[] args) {
		LearnMethodOverLoading ol=new LearnMethodOverLoading();
		
		ol.startApp(5);
		ol.startApp("www.google.com");	
		ol.startApp("Chrome", "platform.testleaf.com");
		
		// println();
		//subString(startindex), subString(starindex, endindex)
		//frame(int)
		//frame(string id or name)
		//frame(webElement)
		
		
		
	}
}
