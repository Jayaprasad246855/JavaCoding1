package javaBasics;

class School {
	int rooms = 30;

	School() {
		System.out.println("Parent Class Constructor:");
	}

	void sectionA() {
		System.out.println("Parent class Method");
	}
}

class School2 extends School {
	int rooms = 40;

	School2() {
		System.out.println("Child Class constructor:");
	}

	void sectionA() {
		System.out.println("Child Class Method");
		System.out.println("child class rooms :" + rooms);
		System.out.println("Parent Class rooms :" + super.rooms);
		super.sectionA();
	}
}

class School3 extends School2 {
	int rooms = 50;

	School3() {
		System.out.println("Grant child class Constructor:");
	}

	void sectionA() {

		System.out.println("Grant Child Class Method");
		System.out.println(" Grant child class rooms :" + rooms);
		System.out.println("child Class rooms :" + super.rooms);
		super.sectionA();
	}
}

public class SuperDotClass {
	public static void main(String args[]) {
		School3 obj = new School3();
		obj.sectionA();
	}
}