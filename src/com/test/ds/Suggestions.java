package com.test.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Suggestions {
	
	public static void main(String[] args) {

		List<String> repository = Arrays.asList("Mobile","mouse","moneypot","monitor","mousepad");
		String customerInput = "mouse";
		
		List<List<String>> searchSuggestions = searchSuggestions(repository, customerInput);
		for (List<String> list : searchSuggestions) {
			System.out.println(list);
		}
		
	}
	
	// sorting is O(nlogn)
	// 
	public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery)
	{
		List<List<String>> returnValue = new ArrayList<>();
		
		if(repository == null || repository.isEmpty() || customerQuery == null  || customerQuery.length()<2)
				return returnValue;
		
		List<String> sortedRepository = new ArrayList<>(repository);
		//sortedRepository.sort((a,b) -> a.compareTo(b));
		Collections.sort(sortedRepository);
		sortedRepository.forEach(e -> e.toLowerCase());
		
		String lowerCaseQuery = customerQuery.toLowerCase();
		
		for(int i =2; i<=lowerCaseQuery.length(); i++)
		{
			String tempQuery = lowerCaseQuery.substring(0,i);
			List<String> singlePassedResult = new ArrayList<>();
			int count = 0;
 			for (String word: sortedRepository)
			{
 				if(word.startsWith(tempQuery))
				{
					singlePassedResult.add(word);
					count ++;
				}
 				if(count == 3)
 					break;
			}
 			
 			returnValue.add(singlePassedResult);
		}
				
		return returnValue;
	}

}
