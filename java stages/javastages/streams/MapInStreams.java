package javastages.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapInStreams {
	public static void main(String[] args) {
		
		List <Integer> numbers = Arrays.asList(2, 3, 3, 4, 6, 7, 6, 2);
		
		List <Integer> squares = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		System.out.println(squares);
	}
}
