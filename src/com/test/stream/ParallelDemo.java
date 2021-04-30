package com.test.stream;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelDemo {

	public  static int doubleInt(int n) {
		try{
			Thread.sleep(100);
			System.out.println(Thread.currentThread().getName() + " with n=" + n);
			
		}catch(InterruptedException e)
		{
		}
		return n*2;
	}

	public static void main(String[] args) {

		List<Integer> ints = Arrays.asList(3,1,2,5,4,9);
		
		int total =0;
//		for(int i : ints){
//			total += i;
//		}
//		System.out.println("Total = " + total);
//		
//		total = IntStream.of(3,1,4,1,5,9).sum();
//		System.out.println("Total = " + total);
//		
		
		Instant before = Instant.now();
		total = IntStream.of(3,1,4,1,5)
						 .parallel()
						 .map(ParallelDemo::doubleInt)
						 .sum();
		Instant after = Instant.now();
		Duration duration = Duration.between(before, after);
		System.out.println("Total of doubles =" + total);
		System.out.println("time =" +duration.toMillis() + " ms");
		
		
		
	}

}
