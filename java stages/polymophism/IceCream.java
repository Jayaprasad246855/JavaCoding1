package polymophism;

public class IceCream {
	public void price(int i, String commodity) {
		System.out.println("parent class price meth");
	}
}

class Venilla extends IceCream {
	public void price(String commodity, int i) {
		System.out.println("venilla price" + i);
	}
}

class Choclate extends IceCream {
	public void price(int i, String commodity, String k) {
		System.out.println("choclate price" + i);
	}
}

class Main1 {
	public static void main(String[] args) {
		Venilla i1 = new Venilla();
		Choclate i3 = new Choclate();
		i1.price("something", 1);
		i1.price(1, "something");
		i3.price(1, "something", "ghjgf");
		i3.price(1, "something");
	}
}
