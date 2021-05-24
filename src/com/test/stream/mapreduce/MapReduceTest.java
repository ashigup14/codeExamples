package com.test.stream.mapreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapReduceTest {
	
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(2,4,3,6,1,7,9,8,5);
		
		Integer reduce = intList.stream().reduce(0, (a,b) -> a+b);
		System.out.println(reduce);
		
		Optional<Integer> reduce2 = intList.stream().reduce(Integer::sum);
		Integer result = reduce2.isPresent()?reduce2.get():0;
		System.out.println(result);
		
		int sum = intList.stream().mapToInt(i -> i).sum();
		
	
		IntStream filter = IntStream.rangeClosed(4,10).filter(k -> k%2==0);
		System.out.println(filter.boxed().collect(Collectors.toList()));
		
		
		
	}

}
