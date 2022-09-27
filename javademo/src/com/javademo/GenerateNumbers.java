package com.javademo;

public class GenerateNumbers {
		
	public static void main(String[] args) {
		
		int array[] =new int[10];
		
		for(int j=0;j<array.length;j++) {
			
			array[j]=j+5;
			
			 int num=array[j];
			if(num>12) {
				
				System.out.println("list of Array["+j+"]="+array[j]);
			}
			else if(num>10 && num<12) {
				System.out.println("number in between 10 and 12="+" "+array[j]);
			}
			else{
				
				System.out.println("Number is smaller");
			}
		}
		
	}
	
}
