package com.javademo;

public class JavaStage1 {

	String venila = "Venilla is white";

	String straberry = "straberry is pink";

	int venilaPrice = 222;

	int straberryPrice = 333;

	public JavaStage1() {
		System.out.println("Default constructor excecution");
	}

	public JavaStage1(String venila1, String straberry1) {

		this.venila = venila1;
		this.straberry = straberry1;
		System.out.println("paramaterized constructor excecution");
	}

	public String add() {
		return "customer have ordr the venilla and paid =" + venilaPrice;
	}

	public static void main(String[] args) {
		JavaStage1 obj1 = new JavaStage1();
		System.out.println("values before changing");
		String a = obj1.straberry;
		String b = obj1.venila;
		int c = obj1.straberryPrice;
		int d = obj1.venilaPrice;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		JavaStage1 obj = new JavaStage1("Venilla is half white", "straberry is half pink");
		obj.venilaPrice = 444;
		obj.straberryPrice = 555;
		System.out.println("new color of venila :" + obj.venila);
		System.out.println("new color of straberry :" + obj.straberry);
		System.out.println("new price of venila :" + obj.venilaPrice);
		System.out.println("new price of straburry :" + obj.straberryPrice);

	}
}