package javaBasics;

class ThisExample{
	String name= "sdfjgkdh";
	String name1="sdf";
	int age=234;
	public ThisExample(){
		this("hhj ");
	}
	public ThisExample(String name){
		this("fjh", " ");
		this.name=name;
		System.out.println("print first name ="+name);
	}
	public ThisExample(String name, String name1){
		this("kgjk", "kgjhgjhg", 23);
		this.name=name;
		this.name1=name1;
		System.out.println("print full name ="+name+" "+name1);
	}
	public ThisExample(String name, String name1, int age){
		System.out.println("print full name and age="+name+" "+name1+" "+age);
		this.name = name;
		this.name1 = name1;
		this.age = age;
	}
}
public class ThisAndSuperExample extends ThisDotClass{
	public ThisAndSuperExample(){
		super();
	}
	public ThisAndSuperExample(String name){
		super(name);
	}
	public ThisAndSuperExample(String name, String name1){
		super(name,name1);
	}
	public ThisAndSuperExample(String name, String name1, int age){
		super(name, name1, age);
	}
	public static void main(String args[]){
		ThisAndSuperExample obj = new ThisAndSuperExample("satish","basha", 35);
		System.out.println(obj.name);
		System.out.println(obj.name1);
		System.out.println(obj.age);
		
		ThisAndSuperExample obj1 = new ThisAndSuperExample("rajarao","majji");
		System.out.println(obj1.name);
		System.out.println(obj1.name1);
		System.out.println(obj1.age);
		
		ThisAndSuperExample obj2 = new ThisAndSuperExample("ravanamma");
		System.out.println(obj2.name);
		System.out.println(obj2.name1);
		System.out.println(obj2.age);
		
		ThisExample obj3 = new ThisExample();
		
	}
}
