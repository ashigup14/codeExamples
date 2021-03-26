package com.test.stream;

import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		Stream<Integer> intStream=Stream.generate(() -> 1).limit(5);
		intStream.forEach(System.out::println);
		

	}

}
