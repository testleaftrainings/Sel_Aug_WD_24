package week1.day3;

public class StringMethods {

	public static void main(String[] args) {

		String value="TestLeaf have Multiple Courses";
		
		//TestLeafhaveMultipleCourses
String[] split = value.split("");
for (int i = 0; i < split.length; i++) {
	System.out.print(split[i]);
}

System.out.println();

//replace
String data="selenium";
String replace = data.replace('e', '9');
System.out.println(replace);

//replaceAll
String var="Amazon Have Launched 100 Product";
String replaceAll = var.replaceAll("[^0-9]", "a");
//^ -retrain the value in string
System.out.println(replaceAll);

//tolowercase

String lowerCase = var.toLowerCase();
System.out.println(lowerCase);


String upperCase = var.toUpperCase();
System.out.println(upperCase);


//subString
String substring = var.substring(12);
System.out.println(substring);

//ending index-1 
//19-1= 18
String substring2 = var.substring(12, 20);
System.out.println(substring2);

//convert string to int
String value1="60000";
int parseInt = Integer.parseInt(value1);
System.out.println(parseInt);

String val="343.54";
double parseDouble = Double.parseDouble(val);
System.out.println(parseDouble);









	}

}
