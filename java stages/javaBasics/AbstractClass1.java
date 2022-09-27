package javaBasics;

abstract class Parts {
	int bones = 206;
	int legs = 2;

	public String  eyes(String  left, String right) {
		return (left+"+" + right);
	}

	public String legs(String x, String y) {
		return (x + "+" + y);
	}

	public abstract int heartbeat(int x, int y);
}

class Abstract1 extends Parts {
	public int heartbeat(int x, int y) {
		return x + y;
	}
}

class AbstractClass1 extends Parts {
	public int heartbeat(int x, int y) {
		return (x + y);
	}

	public static void main(String args[]) {
		AbstractClass1 obj = new AbstractClass1();
		System.out.println("First person");
		System.out.println(obj.heartbeat(12, 60));
		System.out.println(obj.eyes("right eye", "left eye"));
		System.out.println(obj.bones);
		System.out.println(obj.legs);
		System.out.println(obj.legs("right leg1","left leg1"));

		Abstract1 obj1 = new Abstract1();
		
		System.out.println("Second  person");
		System.out.println(obj1.heartbeat(555, 2));
		System.out.println(obj1.eyes("Right eye light sight", "lefy eye light sight"));
		System.out.println(obj1.legs("right leg","left leg"));

	}
}