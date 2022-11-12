package javaBasics;

public class ArrayClass {

	public void methodArray() {
		int a[] = new int[20];

		for (int i = 0; i < a.length; i++) {
			a[i] = i * i;
		}
		/*
		 * a[0]=11; a[1]=22; a[2]=33; a[3]=44; a[4]=55; a[5]=66; a[6]=77; a[7]=88;
		 * a[8]=99; a[9]=111; a[10]=222; a[11]=333; a[12]=444; a[13]=555; a[14]=666;
		 * a[15]=777; a[16]=888; a[17]=999; a[18]=1000; a[19]=1001;
		 */
		System.out.println(a[19]);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Forward Value's of array:" + a[i]);
		}
		System.out.println(" ");
		for (int j = (a.length - 1); j != -1; j--) {
			System.out.println("Reverse Value's of array:" + a[j]);
		}
	}

	public static void main(String args[]) {
		ArrayClass obj = new ArrayClass();
		obj.methodArray();

	}
}