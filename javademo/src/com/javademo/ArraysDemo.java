package com.javademo;

import java.util.Random;

public class ArraysDemo {

	public static void main(String[] args) {

		long list[] = new long[20];
		
		for (int  i = 0; i < list.length; i++) {
			Random obj = new Random();
			list[i]=obj.nextLong();
			
			if(list[i]>=10000) {
				System.out.println("Greatest value :" + list[i]);
			}
			else if(list[i]>=10 && list[i]<=50) {
				System.out.println("Inbetween 10 to 50  values :" + list[i]);
			}
			else{
				System.out.println("smallest values :" + list[i]);
			}
		}
	}

}
