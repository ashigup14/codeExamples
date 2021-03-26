/**
 * 
 */
package com.test.stream;

import java.util.List;
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
	}

}
