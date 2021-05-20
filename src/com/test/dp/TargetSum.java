package com.test.dp;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TargetSum {

	public static void main(String[] args) {
		System.out.println(canSum(7, Arrays.asList(2,3), new HashMap<>()));
		System.out.println(canSum(7, Arrays.asList(5,3,4,7), new HashMap<>()));
		System.out.println(canSum(7, Arrays.asList(2,4), new HashMap<>()));
		System.out.println(canSum(8, Arrays.asList(2,3,5), new HashMap<>()));
		System.out.println(canSum(300, Arrays.asList(7,14), new HashMap<>()));
		Map<Integer, List<Integer>> memo = new HashMap<>();
		System.out.println(optionsSum(300,300, Arrays.asList(1,2), memo));
		
	}
	
	private static boolean canSum(int targetSum, List<Integer> numbers, Map<Integer, Boolean> results)
	{
		if(results.containsKey(targetSum))
			return results.get(targetSum);
		if(targetSum == 0)
			return true;
		if(targetSum <0)
			return false;
		for (Integer integer : numbers) {
			int remainder = targetSum - integer;
			if(canSum(remainder, numbers, results))
			{
				results.put(targetSum, true);
				return true;
			}
		}
		results.put(targetSum, false);
		return false;
	}
	
	
	// target steps 
	// list of options of steps (1,2) 
	// we can use list of steps multiple times
	/*
	 *                  2
	 *              -1     -2
	 *            1            0  
	 * 		  -1
	 *       0 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	private static List<Integer> optionsSum(int targetSum, int original, List<Integer> numbers, Map<Integer, List<Integer>> memo)
	{
		if(memo.containsKey(targetSum))
			return memo.get(targetSum);
		if(targetSum==0)
			return new ArrayList<>();
		if(targetSum<0) 
			return null;
		
		for (Integer integer : numbers) {
			int remainder = targetSum - integer;
			
			List<Integer> remainderResult = optionsSum(remainder, original, numbers, memo);
			if(remainderResult != null){
				remainderResult.add(integer);
				memo.put(targetSum, remainderResult);
				
				return remainderResult;
				
			}
		}
		
		memo.put(targetSum, null);
		return null;
	}
	
	
	private static List<Integer> bestOptionsSum(int targetSum, List<Integer> numbers, Map<Integer, List<Integer>> memo)
	{
		
		if(targetSum==0)
			return new ArrayList<>();
		if(targetSum<0) 
			return null;
		
		
		for (Integer integer : numbers) {
			int remainder = targetSum - integer;
			
			List<Integer> remainderResult = bestOptionsSum(remainder, numbers, memo);
			if(remainderResult != null){
				
				List<Integer> combination = new ArrayList<>();
						combination.addAll(remainderResult);
						combination.add(integer); 
				memo.put(targetSum, remainderResult);
				
				return remainderResult;
				
			}
		}
		
		memo.put(targetSum, null);
		return null;
	}
	
	

}
