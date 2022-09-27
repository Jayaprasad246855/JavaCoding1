package javaBasics;

public class StringBufferClass{
	public static void main(String args[]){
		StringBuffer obj = new StringBuffer(" Welcome ");
		
		System.out.println(obj);
		System.out.println(obj.append("To Java"));
		System.out.println(obj.insert(10,"Core"));
		System.out.println(obj.delete(10,14));
		System.out.println(obj.replace(1,8,"WELCOME"));
		System.out.println(obj.substring(12));
		System.out.println(obj.subSequence(4,9));
		System.out.println(obj.length());
		System.out.println(obj.reverse());
		System.out.println(obj.indexOf("C"));
		System.out.println(obj.charAt(10));

	}
}
		