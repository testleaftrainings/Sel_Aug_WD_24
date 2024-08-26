package week3.day1;

public interface InterFaceJava8 {

	
	//Implements -2 methods above java 1.7 version
	//static -common reference
	public static void webElement() {
		
	}
	//static -no need create object for it
	//interfaceName.methodName()
	
	default void click() {
		
	}
	
	//public void kyc();
	
	//will not breaking existing implementation
}
