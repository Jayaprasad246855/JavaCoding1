package javaBasics;

public class Arguments {
	int num1, num2, num3;
	static String name;
	public static void main(String[] args) {
		Arguments obj = new Arguments();
		obj.num1 = Integer.parseInt(args[0]);
		obj.num2 = Integer.parseInt(args[1]);
		obj.num3 = Integer.parseInt(args[2]);
		Arguments.name = args[3];
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		System.out.println(obj.num3);
		System.out.println(Arguments.name);
	}

}
