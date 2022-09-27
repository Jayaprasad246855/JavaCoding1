package javaBasics;

public class StringClassExample {
	public static void main(String args[]) {
		String obj1 = new String("  Hi,Good Morning  ");
		System.out.println(obj1);
		System.out.println("Length of String :" + obj1.length());
		System.out.println("indexnumber of G :" + obj1.indexOf("G"));
		System.out.println("character at index 6:" + obj1.charAt(6));
		System.out.println(obj1.trim());
		System.out.println(obj1.toUpperCase());
		System.out.println(obj1.toLowerCase());
		obj1 = obj1.concat("And Have a nice day");
		System.out.println(obj1);
		System.out.println(obj1);
		
	}
}
  