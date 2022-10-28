package javastages.arrays;

import java.util.Random;
import java.util.Scanner;

public class MultiDimentionalArrays {
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value=");
		n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = i * i + 1;
			System.out.println("List of value at index number array[" + i + "] =" + array[i]);
		}
		int[][] arr = new int[3][3];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = r.nextInt(10) + 1;

				System.out.println("at index " + i + " and " + j + " = " + arr[i][j]);

			}
		}
	}
}
