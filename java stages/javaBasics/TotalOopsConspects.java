package javaBasics;

abstract class Parent { // Abstract Class
	String surname = "Majji";
	long phnum = 90103032;

	void father() {
		System.out.println("My father is a farmer");
	}

	abstract void mother(); // Abstract Method
}

abstract class child extends Parent { // Abstract class

	void mother() {
		System.out.println("My mother is a House Wife:");
	}

	abstract void sister();
}

class GrantChild extends child { // Concrete Method
	private int length = 33;
	private int breadth = 44;

	void sister() {
		System.out.println("My sister are Govt holders ");
	}

	void setLength(int length1) {
		this.length = length1;
	}

	int getLength() {
		return length;
	}

	void setBreadth(int breadth1) {
		this.breadth = breadth1;
	}

	int getBreadth() {
		return breadth;
	}
}

class SuperChildClass extends GrantChild {
	SuperChildClass() {

	}

	SuperChildClass(int x) {
		System.out.println(x);
	}

	SuperChildClass(int i, int j) {
		System.out.println(i * j);
	}

	void sister() {
		System.out.println("My sister's are self empoliyee's ");
	}

}

public class TotalOopsConspects {
	public static void main(String args[]) {
		// Main Method

		SuperChildClass obj = new SuperChildClass();
		System.out.println(obj.surname);
		System.out.println(obj.phnum);
		obj.father();
		obj.mother();
		obj.sister();
		obj.setLength(66);
		obj.setBreadth(77);
		int area = obj.getBreadth() * obj.getLength();
		System.out.println(area);
		SuperChildClass obj1 = new SuperChildClass(55);
		SuperChildClass obj2 = new SuperChildClass(88, 99);

	}
}