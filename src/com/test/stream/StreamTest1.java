package com.test.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
public class StreamTest1 
{
    public static void main(String[] args) 
    {
        List<Integer> tokens = Arrays.asList(1, 2, 3, 4, 5);
         
        //first use
        Optional<Integer> result = tokens.stream().max(Integer::compareTo);
        System.out.println(result.get());
         
        //second use
        result = tokens.stream().min(Integer::compareTo);
        System.out.println(result.get());
         
        //third use
        long count = tokens.stream().count();
        System.out.println(count);
        String abc = "boo:and:foo";
        String[] parts = abc.split(":", 3);
        
        System.out.println(Arrays.toString(parts));
        
        Stream<Customer> streamCustomers = Stream.of(
				new Customer(101, "Ashish", "ashi@gmail.com", Arrays.asList("12345","67890")),
				new Customer(102, "Ashishg", "ashi154@gmail.com", Arrays.asList("22136","12312")),
				new Customer(103, "Ashi", "ashi11@gmail.com", Arrays.asList("343256457","132144")),
				new Customer(104, "Ash", "ashi1@gmail.com", Arrays.asList("146734213","324234"))
				);
        
        List<Customer> collect = streamCustomers.sorted((Customer x, Customer y) -> (x.getName()).compareTo(y.getName())).collect(Collectors.toList());
        collect.forEach(x ->  System.out.println(x.getName()));
    }
}
