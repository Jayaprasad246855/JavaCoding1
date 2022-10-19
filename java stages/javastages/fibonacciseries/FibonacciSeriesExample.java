package javastages.fibonacciseries;

import java.util.Scanner;

public class FibonacciSeriesExample {

	int i1 = 0, i2 = 1, i3;
	static int j = 5;

	public void fibonacciCalling(int count) {
			if (count != 0) {
				i3 = i1 + i2;
				System.out.print(" " + i3);
				i1 = i2;
				i2 = i3;
				fibonacciCalling(count - 1);
			}
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value for count = ");
		int count = sc.nextInt();
		FibonacciSeriesExample obj = new FibonacciSeriesExample();
		System.out.print(obj.i1 + " " + obj.i2);
		obj.fibonacciCalling(count);
		System.out.println("\n"+"enter the value for count = "+count);
		for(int i=0;i<j;i++) {
			int count1=sc.nextInt();
			obj.fibonacciCalling(count1);
		}
	}
}
