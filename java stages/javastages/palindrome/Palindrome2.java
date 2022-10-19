package javastages.palindrome;

public class Palindrome2 {
	public static void main(String[] args) {
	long original= 234565432, reverseNUm=0, remainder;
	
	long num=original;
	while(num!=0) {
		remainder = num%10;
		reverseNUm = reverseNUm*10 + remainder;
		num /=10;
	}
	if(reverseNUm==original) {
		System.out.println("reverse value = "+reverseNUm);
	}else {
		System.out.println("Orginal vaue = "+ original );
	}
	
}
}