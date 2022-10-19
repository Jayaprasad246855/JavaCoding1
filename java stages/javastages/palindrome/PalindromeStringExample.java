package javastages.palindrome;

public class PalindromeStringExample {

	public static void main(String[] args) {

		String str = "jayaj", reverseStr = "";

		int strLength = str.length();

		for (int i = (strLength - 1); i >= 0; --i) {
			reverseStr = reverseStr + str.charAt(i);
		}

		if (reverseStr==str) {
			System.out.println(str + " is a Palindrome String.");
		} else {
			System.out.println(str + " is not a Palindrome String.");
		}
 	}
}
