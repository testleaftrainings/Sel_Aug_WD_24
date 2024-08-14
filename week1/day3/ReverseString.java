package week1.day3;

public class ReverseString {

	public static void main(String[] args) {
		
		String value="Amazon";
		//nozamA
		char[] charArray = value.toCharArray();
		for (int i = charArray.length-1; i >=0; i--) {
			System.out.print(charArray[i]);
		}
	}

}
