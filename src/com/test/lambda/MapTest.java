package com.test.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapTest {

	public static void main(String[] args) {
		
		map_times_10();
		
		map_times_10_refactor();
	}
	
	public static void map_times_10() {

	    List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5);

	    Stream<Integer> multipleOf10 = myList.stream().map((x) -> x * 10);

	    multipleOf10.forEach(System.out::println);
	}
	
	public static void map_times_10_refactor() {

	    List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5);
	    Function<Integer, Integer> times10 = (x) -> x * 10;

	    List<Integer> multipleOf10 = myList.stream().map(times10)
	            .collect(Collectors.toList());

	    multipleOf10.forEach(System.out::println);
	}

}
