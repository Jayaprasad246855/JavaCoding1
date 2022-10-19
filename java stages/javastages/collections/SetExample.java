package javastages.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("Majji");
		set.add("Jaya");
		set.add("Prasad");
		set.add("Jaya");
		set.add("Prasad");
		set.add("Software");
		set.add("engeneer");
		set.add("Capgemini");
		set.remove("capgemini");
		
		for(String j:set) {
		System.out.println(j+"\n");
		}
		
		System.out.println(set.clone());
		System.out.println(set.contains("prasad"));
		System.out.println(set.hashCode());
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		System.out.println(set.getClass());;
		System.out.println(set+"\n");
		
		LinkedHashSet<String> set1 = new LinkedHashSet();
		
		set1.add("India");
		set1.add("America");
		set1.add("South Africa");
		set1.add("West Indis");
		set1.add("America");
		set1.add("India");
		set1.add("macxico");
		set1.add("Landon");
		set1.add("Landon");
		
		for(String k:set1) {
			System.out.println(k);
		}
		
		System.out.println(set1.size());
		System.out.println(set1.isEmpty());
		System.out.println(set1.clone());
		System.out.println(set1+"\n");
		
		TreeSet<String> set2 = new TreeSet<String>();
		
		set2.addAll(set1);
		set2.add("Brazill");
		set2.comparator();
		
		Iterator<String> itr = set2.iterator();
		while(itr.hasNext()) {
			String i = itr.next();
			System.out.println(i);
		}
	}
}
