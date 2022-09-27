package javaBasics;

public class MethodOverload
{
	String name;
	int age;
	int weight;
	String color;
	
	public void methodOverloadinging()
	{
		this.age = 22;
		this.weight = 33;
		this.color = "black";
		System.out.println("sum of age and weight: "+(age+weight)+" : "+color);
	}
	
	public void methodOverloadinging(String name1, int age1)
	{
		this.name = name1;
		this.age = age1;
		System.out.println("name and age: "+name1+" : "+age1);
	}
	
	public void methodOverloadinging(String name2, int age2, int weight1)
	{
		this.name = name2;
		this.age = age2;
		this.weight = weight1;
		System.out.println("name and age, weight: "+name2+" : "+age2+" : "+weight1);
	}
	
	public void methodOverloadinging(String name3, int age3, int weight2, String color1)
	{
		this.name = name3;
		this.age = age3;
		this.weight = weight2;
		this.color= color1;
		System.out.println("name and age, weight, color: "+name3+" : "+age3+" : "+weight2+" : "+color1);
	}
	
	public static void main(String args[])
	{
		MethodOverload obj1 = new MethodOverload();
		obj1.methodOverloadinging();
		System.out.println(obj1.weight);
		System.out.println(obj1.age);
		System.out.println(obj1.color);
		
		MethodOverload obj2 = new MethodOverload();
		obj2.methodOverloadinging("majji jai prasad",23);
		System.out.println(obj2.name);
		System.out.println(obj2.age);
		
		MethodOverload obj3 = new MethodOverload();
		obj3.methodOverloadinging("majji ravanamma", 44, 70);
		System.out.println(obj3.name);
		System.out.println(obj3.age);
		System.out.println(obj3.weight);
		
		MethodOverload obj4 = new MethodOverload();
		obj4.methodOverloadinging("majji rajarao", 46, 80, "normal brown");
		System.out.println(obj4.name);
		System.out.println(obj4.age);
		System.out.println(obj4.weight);
		System.out.println(obj4.color);
	}
}