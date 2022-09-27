package com.java.foreach;

import java.util.ArrayList;
import java.util.Iterator;

public class Java8ForEachExample {

	public static void main(String[] args) {
		// Creating sample collections

		ArrayList<Integer> myList = new ArrayList<Integer>();

		for (int i = 0; i <= 20; i++) {

			myList.add(i);
			System.out.println("array values at index : [" + i + "] :" + myList.add(i));

			// traversing using Iterator

			Iterator<Integer> it = myList.iterator();
			while (it.hasNext()) {
				int j = it.next();
				System.out.println("Iterator values" + j);

			}
		}

	}
}