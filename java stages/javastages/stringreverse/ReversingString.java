package javastages.stringreverse;

public class ReversingString {
	public static void main(String[] args) {
		String str = "Majjijayaprasad", reverseString = "";
		char ch;

		for (int i = 0; i <str.length(); i++) {

			ch = str.charAt(i);
			reverseString = ch + reverseString;
		}
		if(str.toLowerCase().equals(reverseString.toLowerCase())) {
		System.out.println("Original String = "+str+ "\n");
		}else {
		System.out.println("Reverse  String = "+reverseString);
		}
	}
}