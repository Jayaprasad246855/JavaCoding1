package fundamentals.thissuper;

class Location {
	int longitude, latitude;
	String name;

	public Location() {
	}

	public Location(int longitude, int latitude) {
		this.longitude = longitude;
		this.latitude = latitude;

	}

	public Location(int longitude, int latitude, String name) {
		this.longitude = longitude;
		this.latitude = latitude;
		this.name = name;
	}
}

public class ThisClass extends Location {
	public ThisClass() {
		this(10, 20, "Jai Prasad");
	}

	public ThisClass(int x, int y) {
		super(x, y);
	}

	public ThisClass(int x, int y, String z) {
		super(x, y, z);
	}

	public static void main(String arg[]) {

		ThisClass c2 = new ThisClass();
		ThisClass obj = new ThisClass(22, 33);
		System.out.println(obj.longitude);
		System.out.println(obj.latitude);

		ThisClass c = new ThisClass(44, 55);
		ThisClass c1 = new ThisClass(66, 77);
		ThisClass c3 = new ThisClass(88, 99, "jai prasad");
		System.out.println(c.longitude);
		System.out.println(c.latitude);
		System.out.println(c1.longitude);
		System.out.println(c1.latitude);
		System.out.println(c3.latitude);
		System.out.println(c3.latitude);
		System.out.println(c3.name);

		ThisClass tc = new ThisClass();
		System.out.println(tc.longitude);
		System.out.println(tc.latitude);
		System.out.println(tc.name);
	}
}