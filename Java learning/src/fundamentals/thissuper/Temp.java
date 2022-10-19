package fundamentals.thissuper;

class Temp extends Object {
	Temp() {
		this(5);
		System.out.println("The Default constructor");
	}

	Temp(int x) {
		this(5, 15);
		System.out.println(x);
	}

	Temp(int x, int y) {
		System.out.println(x * y);
	}

	public static void main(String args[]) {
		Temp obj=new Temp();
	}
}
