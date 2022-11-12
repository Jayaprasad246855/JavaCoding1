package arrays;

		//import java.util.Random;

public class ArrayDemo {
	public static void main(String[] args) {
		long[] arr = new long[5];
		// array start with index 0, ends with n-1

		//Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i*i+i;
			System.out.println(arr[i]);
		}

	}
}
