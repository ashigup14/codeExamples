package com.test.stream;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectExample {

	public static void main(String[] args) {
		
		// JDK 9 
		// List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
		
		//in JDK 8
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6); 
		
		List<Integer> evenNumbers = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbers);  // [2, 4, 6]
		
		
		
		List<String> list = Stream.of("foo", "bar")
			      .collect(Collectors.toList());
					
			    assertTrue(list.contains("foo"));
		
	    Set<Integer> oddNumbers = numbers.parallelStream().filter(x -> x % 2 != 0).collect(Collectors.toSet());
	    System.out.println(oddNumbers); // [1, 3, 5]
		
	    
	    Map<Integer, String> mapOddNumbers = numbers.parallelStream().filter(x -> x % 2 != 0)
	    		.collect(Collectors.toMap(Function.identity(), x -> String.valueOf(x)));
	    System.out.println(mapOddNumbers); // {1=1, 3=3, 5=5}
	    
	    
	    String value = Stream.of("a", "b", "c").collect(Collectors.joining());
	   // value ==> "abc"
	    
	    String valueCSV = Stream.of("a", "b", "c").collect(Collectors.joining(","));
	   // valueCSV ==> "a,b,c"
	    
	    String valueCSVLikeArray = Stream.of("a", "b", "c").collect(Collectors.joining(",", "{", "}"));
	    //valueCSVLikeArray ==> "{a,b,c}"
	    
	    String valueObject = Stream.of("1", new StringBuffer("2"), new StringBuilder("3")).collect(Collectors.joining());
	    //valueObject ==> "123"
	}

}
