package exception;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println(10 / 0);

		} catch (ArithmeticException ex) {
			ex.printStackTrace();
			System.out.println("arthematic exception");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception occured outer");
		} finally {
			sc.close();
			System.out.println("finally");
		}
		System.out.println("printing 2");
	}
}
