package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MovieOrder {

	private static final int _30 = 30;

	public MovieOrder() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//6,20,70,90,30,60,110}
		List<Integer> arrayInt =  new ArrayList<>();
		arrayInt.add(6);
		arrayInt.add(20);
		arrayInt.add(25);
		arrayInt.add(90);
		arrayInt.add(30);
		arrayInt.add(110);
		System.out.println(foo(110, arrayInt ));

	}
	
	public static List<Integer> foo(int flightDuration, List<Integer> movieDuration) {
        List<Integer> copy = new ArrayList<>(movieDuration);
        Collections.sort(movieDuration, Collections.reverseOrder());
        List<Integer> returnedList = new ArrayList<>();
        
        if(movieDuration.isEmpty())
        {
            returnedList.add(-1);
            returnedList.add(-1);
           return returnedList; 
        }    
                        
        for(int i=0; i< movieDuration.size();i++)
        {
            int nextElement = i+1;
            int element = movieDuration.get(i);
            if(element>=flightDuration || element + _30 >= flightDuration )
                continue;
           
            while(nextElement < movieDuration.size())
            {
                   	if(element + movieDuration.get(nextElement) + _30 <= flightDuration)
                    {
                        returnedList.add(copy.indexOf(element)); 
                        returnedList.add(copy.indexOf(movieDuration.get(nextElement)));
                        return returnedList; 
                    }                    
                    nextElement = nextElement+1;
            }         
        }
        
        return returnedList;
    }

}
