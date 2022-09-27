package com.javademo;

import java.util.Random;
import java.util.Scanner;

class SingleDimensionArray {

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int []array= new int[22];
	for(int i = 0;i<=n ;i++)
	{
		array[i] = i * i + 1;
		System.out.println("List of value at index number array[" + i + "] =" + array[i]);
	}
		
	
}

public class MultiDimenesionArray extends SingleDimensionArray {
		public static void main(String[] args) {
			int[][] arr = new int[3][3];
			// int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
			
			Random r = new Random();
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = r.nextInt(100) + 1;
					System.out.println("at index " + i + " and " + j + " = " + arr[i][j]);
				
					
					
					
					
				}
			}	
		}
	}
}