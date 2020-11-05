package com.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TestArrays {

	public static void main(String[] args) {
		 int[] selectedRows = {1,2,3,9,4,5,6,7,8,11};
		 
		 int[] filteredRows = {9,4,5,99};
		 
         Set<Integer> collect = Arrays.stream(selectedRows).boxed().collect(Collectors.toSet());
         System.out.println(collect.contains(5));
         System.out.println(collect);
         
         Set<Integer> newColelction = Arrays.stream(filteredRows).boxed().collect(Collectors.toSet());

         System.out.println(collect.containsAll(newColelction));
	}

}
