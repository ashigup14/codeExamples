package com.test.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringConcatination {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("alpha", "bravo", "charlie","delta", "echo","foxtot");
		
		StringBuilder sb = new StringBuilder();
		list.forEach(s -> sb.append(s.charAt(0)));
		String result = sb.toString();
		System.out.println(result);
		
		// Using Stream
		// this is the very inefficient way as many string intermediate objects are created
		// O(n2) problem
		result = list.stream()
					.map(s -> s.substring(0,1))
					.reduce("", (a,b) -> a + b);
		
		System.out.println(result);
		
		// this fails as 1st partial result is ignored
		StringBuilder sbStream = new StringBuilder();
		
		Optional<String> optString = list.stream()
										 .map(s -> s.substring(0,1))
										 .reduce((a,b) -> sbStream.append(b).toString());
		
		result = optString.orElse("");
		System.out.println(result);
										
		// the more stream way but correct
		
		result = list.stream()
					 .map(s -> s.substring(0,1))
					 .collect(Collector.of(StringBuilder::new, StringBuilder::append, StringBuilder::append,StringBuilder::toString));
		
		System.out.println(result);
		
		
		// the most clean thing
		result = list.stream()
				 .map(s -> s.substring(0,1))
				 .collect(Collectors.joining());
		
		System.out.println(result);
		
		result = list.stream()
				 .map(s -> s.substring(0,1))
				 .collect(Collectors.joining(":"));
		
		System.out.println(result);
	}

}
