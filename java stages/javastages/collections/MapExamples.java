package javastages.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class MapExamples {
	public static void main(String[] args) {

		HashMap<String, Double> map = new HashMap<String, Double>();

		map.put("jaya", 9010293032.);
		map.put("jyothi sis", 8466922636.);
		map.put("Ramya sis", 9948229054.);
		map.put("Dad", 9293738679.);
		map.put("Amma", 6305666796.);

		Iterator<Entry<String, Double>> itr = map.entrySet().iterator();

		while (itr.hasNext()) {

			Entry<String, Double> entry = itr.next();

			String key = entry.getKey();
			Double value = entry.getValue();

			System.out.println("Name = " + "  " + key + " : " + "Phone number = " + value + "\n");
		}

		LinkedHashMap<String, Double> map1 = new LinkedHashMap<String, Double>();

		map1.putAll(map);
		map1.put("Bava", 9676769653.);
		map1.remove("Dad", 9293738679.);

		Iterator<Entry<String, Double>> itr1 = map1.entrySet().iterator();

		while (itr1.hasNext()) {

			Entry<String, Double> entry1 = itr1.next();

			String key1 = entry1.getKey();
			Double value1 = entry1.getValue();

			System.out.println("Name = " + "  " + key1 + " : " + "Phone number = " + value1);
		}
	}
}
