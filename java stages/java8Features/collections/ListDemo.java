package java8Features.collections;

import java8Features.generics.Demo;
import threads.atmExample.Benificiary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List list = new LinkedList();

		list.add("hello");
		list.add("Hi");
		list.remove("Hi");
		list.add("hello1");
		list.add("hello2");
		list.add("hello3");
		
		System.out.println("index = " + list.indexOf("hello"));
		System.out.println("get on 0 index = " + list.get(0));
		System.out.println("size = " + list.size());
		System.out.println("indexof = " + list.indexOf("hello"));
		System.out.println("contains math = " + list.contains("hello"));
		System.out.println(list.toString());

		Iterator i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("=======================================================================");
		Benificiary b = new Benificiary("yugu", 1000);
		Demo<Benificiary> d = new Demo(b);
		Benificiary copy = d.obj;
	}
}
