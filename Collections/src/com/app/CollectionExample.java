package com.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionExample {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Reddy");
		list.add("Arun");
		list.add("Moseen");
		list.add("Vamsi");
		list.add("jai prasad");
		list.add("jai prasad");

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {

			String str = itr.next();

			System.out.println(str);

		}

		Set<String> set = new HashSet<String>();

		set.add("macbook");
		set.add("dell");
		set.add("vostro");
		set.add("vostro");

		Iterator<String> itr2 = set.iterator();

		while (itr2.hasNext()) {

			String str4 = itr2.next();
			itr2.remove();
			System.out.println(str4+"\n");
		}

		Map<String, Integer> map = new HashMap<>();

		map.put("Java", 8);
		map.put("Pytjon", 11);
		map.put(".net", 6);

		Iterator<Entry<String, Integer>> itr1 = map.entrySet().iterator();

		while (itr1.hasNext()) {

			Entry<String, Integer> entry = itr1.next();

			String str1 = entry.getKey();
			Integer int1 = entry.getValue();

			System.out.println(str1 + " == " + int1);

		}
	}
}
