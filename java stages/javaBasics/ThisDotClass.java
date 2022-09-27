package javaBasics;

public class ThisDotClass {
	String name;
	String name1;
	int age;

	public ThisDotClass() {
		this("jai");
	}

	public ThisDotClass(String name) {
		this("jai", "prasad");
		System.out.println("print first name =" + name);
	}

	public ThisDotClass(String name, String name1) {
		this("majji", "ramya", 25);
		System.out.println("print full name =" + name + " " + name1);
	}

	public ThisDotClass(String name, String name1, int age) {
		System.out.println("print full name and age=" + name + " " + name1 + " " + age);
	}

	public static void main(String args[]) {
		new ThisDotClass();
	}
}
