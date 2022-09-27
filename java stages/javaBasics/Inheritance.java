package javaBasics;

class Sections{
	int totalnumber = 200;

	public void display(){
		
		System.out.println("parent class");
	}
}
class BoysExample extends Sections{
	String name = "jai prasad";
	public void show(){
		
		System.out.println("parent child class");
	}
}
class GirlsExample extends BoysExample{
	int age = 25;
	public void presents(){

		System.out.println("child class");
	}
}
public class Inheritance{
	public static void main(String args[]){

		GirlsExample obj = new GirlsExample();
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.totalnumber);
		obj.presents();
		obj.show();
		obj.display();
		}
	}
		
		
	