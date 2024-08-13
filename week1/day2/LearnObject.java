package week1.day2;

public class LearnObject {

	public static void main(String[] args) {

		LearnMethod op=new LearnMethod();
		
		op.browserName();
		
		int numberOfBrowser = op.numberOfBrowser();
		System.out.println(numberOfBrowser);
		System.out.println(op.browserUrl("google.in", "Email"));
		
	
	}

}
