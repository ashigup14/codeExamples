package com.test.stream;

import java.util.ArrayList;
import java.util.List;
 
public class ListOfIntegersStatefulLambda {
 
    public static void main(String[] args) {
 
        List<Integer> listOfIntegers = new ArrayList<>();
        Integer[] intArray =new Integer[] {40,34,21,37,20};
        for(Integer in:intArray)
        {
            listOfIntegers.add(in);
        }
        listOfIntegers.parallelStream()
 
        .peek( i -> listOfIntegers.add(7))      
        .forEach(e -> System.out.print(e + " "));
 
        System.out.println("");
 
    }
}
