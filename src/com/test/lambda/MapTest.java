package com.test.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapTest {

	public static void main(String[] args) {
		
		map_times_10();
	}
	
	public static void map_times_10() {

	    List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5);

	    Stream<Integer> multipleOf10 = myList.stream().map((x) -> x * 10);

	    multipleOf10.forEach(System.out::println);
	}

}
