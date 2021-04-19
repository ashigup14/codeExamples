package com.test.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) myList.add(i);
		
		//sequential stream
		Stream<Integer> sequentialStream = myList.stream();
		
		//parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		
		//using lambda with Stream API, filter example
		Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
		//using lambda in forEach
		highNums.forEach(p -> System.out.println("High Nums parallel="+p));
		
		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
		highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));
		
		myList.add(10);
		Stream<Integer> filteredDataStream = myList.stream().filter(p -> p == 10);
		Optional<Integer> findFirstOptional = filteredDataStream.findFirst();
		System.out.println(findFirstOptional.orElseGet(()-> 10));
		
		List<String> l = new ArrayList(Arrays.asList("one", "two"));
	     Stream<String> sl = l.stream();
	     l.add("three");
	     String s = sl.collect(StringBuilder::new, (x, y) -> x.append(" " +y),
	    			(a, b) -> a.append(" ").append(b)).toString();
System.out.println(s);
	}

//	private static Collector joining(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	

}
