package javaBasics;

public class ConstructorOverload {
	String name;
	int age;
	int weight;
	String color;

	ConstructorOverload() {
		this.age = 22;
		this.weight = 33;
		this.color = "black";
		System.out.println("sum of age and weight: " + (age + weight) + " : " + color);
	}

	ConstructorOverload(String name1, int age1) {
		this.name = name1;
		this.age = age1;
		System.out.println("name and age: " + name1 + " : " + age1);
	}

	ConstructorOverload(String name2, int age2, int weight1) {
		this.name = name2;
		this.age = age2;
		this.weight = weight1;
		System.out.println("name and age, weight: " + name2 + " : " + age2 + " : " + weight1);
	}

	ConstructorOverload(String name3, int age3, int weight2, String color1) {
		this.name = name3;
		this.age = age3;
		this.weight = weight2;
		this.color = color1;
		System.out.println("name and age, weight, color: " + name3 + " : " + age3 + " : " + weight2 + " : " + color1);
	}

	public static void main(String args[]) {
		ConstructorOverload obj1 = new ConstructorOverload();
		System.out.println(obj1.weight);
		System.out.println(obj1.age);
		System.out.println(obj1.color);

		ConstructorOverload obj2 = new ConstructorOverload("majji jai prasad", 23);
		System.out.println(obj2.name);
		System.out.println(obj2.age);

		ConstructorOverload obj3 = new ConstructorOverload("majji ravanamma", 44, 70);
		System.out.println(obj3.name);
		System.out.println(obj3.age);
		System.out.println(obj3.weight);

		ConstructorOverload obj4 = new ConstructorOverload("majji rajarao", 46, 80, "normal brown");
		System.out.println(obj4.name);
		System.out.println(obj4.age);
		System.out.println(obj4.weight);
		System.out.println(obj4.color);
		

		
		
	}
}