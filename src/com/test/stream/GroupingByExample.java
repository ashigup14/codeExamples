package com.test.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
  
public class GroupingByExample {
    public static void main(String[] args)
    {
  
        // Get the List
        List<String> g
            = Arrays.asList("test", "India", "Europe", "India");
  
        // Collect the list as map
        // by groupingBy() method
        Map<String, Long> result
            = g.stream().collect(
                Collectors.groupingBy(
                    Function.identity(),
                    Collectors.counting()));
  
        // Print the result
        System.out.println(result);
    }
}
