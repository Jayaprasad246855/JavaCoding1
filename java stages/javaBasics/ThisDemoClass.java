package javaBasics;

public class ThisDemoClass {
	int num1 = 20; 						// Instance Variable

	public void method() {
		int num1 = 200; 					// Local Variable
		System.out.println("Local Variable:" + num1);							 /* It will print only 200 */
		System.out.println("Instance Variable:" + this.num1); 				/* In the absence of Local Variable it print both instance
																															and local variable*/
	}

	public static void main(String args[]) {
		ThisDemoClass obj = new ThisDemoClass();
		obj.method();
	}
}
