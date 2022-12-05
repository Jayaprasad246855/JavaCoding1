package intitializerBlocks;

public class Demo {
	public Demo() {
		System.out.println("default constructor");
	}

	{
		System.out.println("instance initilizer block");
	}
	static {
		System.out.println("static initializer block");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
	}
}
