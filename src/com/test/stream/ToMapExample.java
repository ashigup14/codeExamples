package com.test.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
  
public class ToMapExample {
    public static void main(String[] args)
    {
  
        // Create a String with no repeated keys
        Stream<String[]>
            str = Stream
                      .of(new String[][] { { "IN", "India" },
                                           { "GB", "Great Britain" },
                                           { "DE", "Germany" } });
  
        // Convert the String to Map
        // using toMap() method
        Map<String, String>
            map = str.collect(
                Collectors.toMap(p -> p[0], p -> (p[0] + "->" + p[1])));
  
        // Print the returned Map
        System.out.println("Map:" + map);
    }
}