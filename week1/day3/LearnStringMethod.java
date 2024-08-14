package week1.day3;

public class LearnStringMethod {

	public static void main(String[] args) {

		String name="Welcome to TestLeaf";
		
		//length
		int length = name.length();
		System.out.println("total character present inside the String :"+length);
		
		//equals =string value
		String value="TestLeaf";
		String data=new String("TestLeaf");
		if(value.equals(data)) {
			System.out.println("its equals");
		}else {
			System.out.println("Its not equals");
		}
		
		//what diff b/w .equals and ==
		//== => will the memory address
		if(value==data) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");
		}
		
		//equalIngorecase
		String a="Selenium";
		String b="sEleniUm";
		if(a.equalsIgnoreCase(b)) {
			System.out.println("value equal");
		}else {
			System.out.println("Value is not equal");
		}
		
		//contains
		boolean contains = a.contains("Se");
		System.out.println(contains);
		
		//charAt
		char charAt = a.charAt(4);
		System.out.println(charAt);
		
		//tocharArray
		String var="WebDriver";
		
		char[] ch = var.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		
	}

}
