package week3.day2;

public class LearnStatic {

	String name;
	//static keyword common reference value
	static String companyname;
	int idNo;
	
	
	void dispaly() {
		System.out.println("Name :"+name);
		System.out.println("IdNo :"+idNo);
		System.out.println("CompanyName :"+companyname);
	}
	
	//static method
	public static void value() {
		companyname="TestLeaf";
		System.out.println(companyname);
	}
	
	//non static method
	public void add() {
		
	}
	//static block
	static {
	companyname="TestLeaf software";	
	System.out.println(companyname);
	}
	
	public static void main(String[] args) {
		LearnStatic s1= new LearnStatic();
		LearnStatic s2=new LearnStatic();
		
		LearnStatic.companyname="TestLeaf software solution";
		s1.name="Dilip";
		s1.idNo=37;
		//s1.companyname="TestLeaf software solution private limited";
		
		
		s2.name="Bhuvanesh";
		s2.idNo=56;
		
		
		//static method- ClassName.methodName()
		LearnStatic.value();
		
		
		
		s1.dispaly();
		s2.dispaly();
	}
}
