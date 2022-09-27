package javaBasics;

class DemoClass {
	static int num1; // Static Variable

	static void display() // Static Method
	{
		System.out.println("STATIC METHOD");
	}

	static // Static Block
	{
		System.out.println("STATIC BLOCK");
	}
}

public class StaticExample {
	public static void main(String args[]) {
		System.out.println("MAIN METHOD");
		DemoClass.num1 = Integer.parseInt(args[0]);
		System.out.println(DemoClass.num1); // We can call it by using className
		DemoClass.display();
	}
}