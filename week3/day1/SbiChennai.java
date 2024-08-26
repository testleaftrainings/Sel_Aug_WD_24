package week3.day1;

//class with interface with-implements
public abstract class SbiChennai implements Rbi  {

	@Override
	public void kyc() {
		System.out.println("pan card");
	}

	@Override
	public void deposit() {
		System.out.println("above 10L");
	}

	//we have 0 to 100 % abstract methods
	//both implementation and unimplementation method
	
	public void minBalance() {
System.out.println("min balances 5000rs");
	}
	
	
	//we create Atleast one abstract method
	public abstract void loan();
	
	
	public static void main(String[] args) {
	
		//we cab create object interface ? NO
		//Rbi r=new Rbi()

		
		//we can create object for abstract class? NO
		//SbiChennai c=new  SbiChennai();
		
		
	}
	
}
