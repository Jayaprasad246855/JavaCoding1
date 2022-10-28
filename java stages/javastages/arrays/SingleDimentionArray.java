package javastages.arrays;

import java.util.Random;

public class SingleDimentionArray {

	public static void main(String[] args) {

		int list[] = new int[20];

		for (int i = 0; i < list.length; i++) {
			Random obj = new Random();
			list[i] = obj.nextInt();

			if (list[i] >= 100000001 && list[i] <= 50000001) {
				System.out.println("Greatest value :" + list[i]);
			} else if (list[i] >= 1000000000) {
				System.out.println("Inbetween 10 to 50  values :" + list[i]);
			} else {
				System.out.println("smallest values :" + list[i]);
			}
		}
	}
}
