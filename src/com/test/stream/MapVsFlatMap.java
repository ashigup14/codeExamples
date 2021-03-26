/**
 * 
 */
package com.test.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author z002y1ra
 *
 */
public class MapVsFlatMap {

	/**
	 * 
	 */
	public MapVsFlatMap() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Customer> customers = EkartDataBase.getAll();
		List<String> emailIds = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
		System.out.println(emailIds);
		
		List<String> phoneNumbers = customers.stream()
											 .flatMap(cus -> cus.getPhoneNumbers().stream())
											 .collect(Collectors.toList());
		System.out.println(phoneNumbers);
		
		List<Integer> numbers =  Arrays.asList(1,2,3,4,5,6,7);
		Optional<Integer> findingMax = numbers.stream().reduce(Integer::max);
		Integer maxNumber = findingMax.isPresent()?findingMax.get():0;
		System.out.println(maxNumber);
		
		List<String> chars =  Arrays.asList("ashi","nupsi","dhaani","krishna","ganesh");
		String stringsAdded = chars.stream().reduce("", (a,b) -> a+b);
		System.out.println(stringsAdded);
		
		Optional<String> longWord = chars.stream().reduce((w1, w2) -> w1.length()>w2.length()?w1:w2);
		String longestString = longWord.isPresent()?longWord.get():"this will never come";
		System.out.println(longestString);
	}

}
