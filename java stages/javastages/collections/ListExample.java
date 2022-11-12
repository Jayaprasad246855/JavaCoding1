package javastages.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ListExample {
	public static void main(String[] args){

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(12);
		list.add(123);
		list.add(1234);

		Iterator<Integer> itr = list.iterator();
		
		while (itr.hasNext()) {

			int obj = itr.next();
			System.out.println(obj);
		}
		System.out.println(list.remove(0));
		System.out.println(list.get(0));
		System.out.println(list.indexOf(1234));
		System.out.println(list.hashCode());
		System.out.println(list.clone());

		LinkedList<String> list1 = new LinkedList<String>();

		for (String i : list1) {

			System.out.println(i);
		}

		list1.add(0, "majji");
		list1.add(1, "jaya");
		list1.add(2, "prasad");
		list1.add("jaya");
		list1.addFirst("Initial");
		list1.addLast("ending");

		System.out.println("------linkedlist initially------- ");
		System.out.println(list1);
		System.out.println(list1.contains("jaya"));
		System.out.println(list1.getClass());
		System.out.println(list1.remove("majji"));
		System.out.println(list1);
		System.out.println(list1.indexOf("ending"));
		System.out.println(list1.equals("jaya"));
		System.out.println(list1.isEmpty());
		System.out.println(list1.size());
		System.out.println(list1.get(1));
		System.out.println(list1.getFirst());

		System.out.println("------After applying the methods ---------");
		System.out.println(list1);

		Vector<Integer> vec = new Vector<Integer>();

		vec.add(1);
		vec.add(22);
		vec.add(333);
		vec.add(4444);
		vec.addAll(4, list);

		for (int j : vec) {
			System.out.println(j);
		}

		Integer j = 22;
		System.out.println(vec.capacity());
		System.out.println(vec.clone());
		System.out.println(vec.hashCode());
		System.out.println(vec.indexOf(4444));
		System.out.println(vec.remove(j));

		System.out.println("---------after applying the methods------------");

		System.out.println(vec);

	}
}
