



package javastages.palindrome;

import java.util.Scanner;

public class PalindromeExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Print the original value = ");
		long originalNum =sc.nextInt(), reverseNum = 0, remainder;

		long num = originalNum;

		while (num != 0) {
			remainder = num % 10;
			reverseNum = reverseNum * 10 + remainder;
			num /= 10;
		}

		if (originalNum == reverseNum) {
			System.out.println(originalNum + " is Palindrome.");
		} else {
			System.out.println(originalNum + " is not Palindrome.");
		}
	}
}
