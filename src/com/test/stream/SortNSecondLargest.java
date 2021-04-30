package com.test.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortNSecondLargest {

	public static void main(String[] args) {

		List<Integer> input = Arrays.asList(9,1,4,6,3,7,8,2,10,5);
						
		Optional<Integer> findFirst = input.stream().sorted((p1,p2) -> p2.compareTo(p1)).limit(2).skip(1).findFirst();
		String integer= findFirst.isPresent()?Integer.toString(findFirst.get().intValue()):"";
		System.out.println(integer);
		}

}
