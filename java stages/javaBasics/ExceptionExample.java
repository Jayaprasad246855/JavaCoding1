package javaBasics;

class Exception {
	void display() {
		try {
			int i = 50 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		try {
			int a[] = new int[5];
			a[6] = 34;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		try {
			String str = "Hello";
			int i = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		try {
			String str = null;
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("Exception Handling:");
	}
}

public class ExceptionExample {
	public static void main(String args[]) {
		Exception obj = new Exception();
		obj.display();
	}
}