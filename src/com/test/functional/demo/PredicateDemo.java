package com.test.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo //implements Predicate<Integer> 
{

//	@Override
//	public boolean test(Integer t) {
//			return t%2==0;
//	}
	
	public static void main(String[] args)
	{
		//Predicate<Integer> predicate = new PredicateDemo();
//		System.out.println(predicate.test(10));
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		list.stream().filter(t -> (t%2==0)).forEach(t -> System.out.println(t));
		
	}

	
}
