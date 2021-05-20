package com.test.dp;

import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class FibonacciExample {

	private static Map<Integer, BigInteger> results = new HashMap<>();

	public static void main(String[] args) {
		Instant start = Instant.now();
		System.out.println(fib(4500, results));
		System.out.println( Duration.between(start, Instant.now()).toMillis() / 1000.0);
	}
	
	private static BigInteger fib(int number, Map<Integer, BigInteger> results)
	{
		if(results.containsKey(number))
			return results.get(number);
		if(number == 0)
			return BigInteger.ZERO;
		if(number==1 || number == 2)
			return BigInteger.ONE;		
		BigInteger sumResult = fib(number-1, results).add(fib(number-2, results));
		results.put(number, sumResult);
		return sumResult ;
	}
	
}
