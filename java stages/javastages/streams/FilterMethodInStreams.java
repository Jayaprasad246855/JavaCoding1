package javastages.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethodInStreams {
	public static void main (String[] args) {
		List <String> Strings = Arrays.asList("aadfa", "", "erdg", "aadfa", "", "hgsfk");
		List<Integer> number = Arrays.asList(2, 2, 22, 3, 33, 4, 2, 44, 5, 55,55, 6, 66);
		
		List<String>Strings1 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = Strings1.stream()
				.filter(abc -> !abc.isEmpty())
				.collect(Collectors.toList());
		System.out.println("Filtered List: " + filtered);
		
		String mergedString = Strings1.stream()
				.filter(string -> !string.isEmpty())
				.collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);
		
		List<String> count=  Strings.stream()
				.filter(string -> !string.isEmpty())
				.distinct().sorted()
				.collect(Collectors.toList());
		System.out.println("Eliminating the Null values : "+count);
		
		List<Integer> sort = number.stream()
				.sorted().distinct()
				.collect(Collectors.toList());
		System.out.println("Eliminating the Null values and arranged in Assending order : "+sort);
		
		
	}
}
