package javaBasics;

public class ConstructorsExample {

	String venila = "Venilla is white";

	String straberry = "straberry is pink";

	int venilaPrice = 222;

	int straberryPrice = 333;

	public ConstructorsExample() {
		System.out.println("Default constructor excecution");
	}

	public ConstructorsExample(String venila1, String straberry1) {

		this.venila = venila1;
		this.straberry = straberry1;
		System.out.println("paramaterized constructor excecution");
	}

	public String add() {
		return "customer have ordr the venilla and paid =" + venilaPrice;
	}

	public static void main(String[] args) {
		ConstructorsExample obj1 = new ConstructorsExample();
		System.out.println("values before changing");
		String a = obj1.straberry;
		String b = obj1.venila;
		int c = obj1.straberryPrice;
		int d = obj1.venilaPrice;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		ConstructorsExample obj = new ConstructorsExample("Venilla is half white", "straberry is half pink");
		obj.venilaPrice = 444;
		obj.straberryPrice = 555;
		System.out.println("new color of venila :" + obj.venila);
		System.out.println("new color of straberry :" + obj.straberry);
		System.out.println("new price of venila :" + obj.venilaPrice);
		System.out.println("new price of straburry :" + obj.straberryPrice);

	}
}