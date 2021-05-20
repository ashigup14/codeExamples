package com.test.stream;

import java.util.*;

public class StreamSorted {

	public StreamSorted() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
    {
  
        List<Point> aList = new ArrayList<>();
        aList.add(new Point(10, 20));
        aList.add(new Point(5, 10));
        aList.add(new Point(1, 100));
        aList.add(new Point(50, 2000));
  
        // displaying the stream with elements
        // sorted according to x coordinate
        aList.stream()
        .sorted((p1, p2)->p1.y.compareTo(p2.y))
        .forEach(System.out::println);
        
        try{
        	System.out.println("ashish");
        	System.exit(0);
        }
        finally {
			System.out.println("hello in finally");
		}
    }
}

class Point
{
    Integer x, y;
    Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
      
    public String toString() { 
        return this.x + ", "+ this.y;
    } 
}
  
