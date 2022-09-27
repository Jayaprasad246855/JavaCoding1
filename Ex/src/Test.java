
class Base {
	public void m1() {
		System.out.println("Base");

	}
}

class Deravied extends Base {
	public void m1() {
		System.out.println("Deravide");

	}
}

public class Test {

	public static void main(String args[]) {

		Base b = new Base();
		b.m1();
		Deravied d = new Deravied();
		d.m1();
		Base b1 = new Deravied();
		b1.m1();

	}

}
