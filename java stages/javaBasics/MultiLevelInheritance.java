package javaBasics;

class SectionA{
	int totalnumber = 200;

	public void display(){
		
		System.out.println("parent class");
	}
}
class Boys extends SectionA{
	String name = "jai prasad";
	public void show(){
		
		System.out.println("parent child class");
	}
}
class Girls extends SectionA{
	int age = 25;
	public void presents(){

		System.out.println("child class");
	}
}
public class MultiLevelInheritance{
	public static void main(String args[]){

		Boys obj = new Boys();
		System.out.println(obj.name);
		System.out.println(obj.totalnumber);
		
		obj.show();
		obj.display();
		
		Girls obj1 = new Girls();
		
		System.out.println(obj1.age);
		System.out.println(obj1.totalnumber);
		
		obj1.presents();
		obj1.display();
		}
	}
		
		
	