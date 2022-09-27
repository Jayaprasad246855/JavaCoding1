package javaBasics;
public class TypesOfVariables
{
	int num1 =  10;			//instance variable. We have to create a obj compulsary
	static int num2 = 20;		//static variable .We can call it directl by using class name..
	public static void main(String args[])
	{
		int num3 = 30; 		//local variable. We can call it directly with in the method.
		TypesOfVariables obj = new TypesOfVariables();
		System.out.println("local variable="+num3);
		System.out.println("static variable="+ num2);
		System.out.println("instance variavle="+obj.num1);
	}
}
