package com.test.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {

	public static List<Customer> getAll(){
		return Stream.of(
				new Customer(101, "Ashish", "ashi@gmail.com", Arrays.asList("12345","67890")),
				new Customer(102, "Ashishg", "ashi154@gmail.com", Arrays.asList("22136","12312")),
				new Customer(103, "Ashi", "ashi11@gmail.com", Arrays.asList("343256457","132144")),
				new Customer(104, "Ash", "ashi1@gmail.com", Arrays.asList("146734213","324234"))
				).collect(Collectors.toList());
	}

}
