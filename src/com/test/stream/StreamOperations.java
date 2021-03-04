package com.test.stream;

import java.util.Arrays;
import java.util.List;
 
public class StreamOperations {
 
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("John", "Martin", "Mary", "Steve");
 
        stringList.stream()
                   .map((s) -> s.toUpperCase())
                   .forEach(System.out::println);
    }
}
