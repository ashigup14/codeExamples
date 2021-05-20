package com.test.dp;

import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class GridTraveler {

	private static Map<String, BigInteger> results = new HashMap<>();
	
	public static void main(String[] args) {
		System.out.println(gridTraveler(1, 1, results));
		System.out.println(gridTraveler(2, 3, results));
		System.out.println(gridTraveler(3, 2, results));
		System.out.println(gridTraveler(3, 3, results));
		Instant start = Instant.now(); 
		System.out.println(gridTraveler(180, 180, results));
		System.out.println(Duration.between(start, Instant.now()).toMillis() / 1000.0);
	}
	
	private static BigInteger gridTraveler(int row, int column, Map<String, BigInteger> results)
	{
		String key = row + "," +column;
		if(results.containsKey(key))
			return results.get(key);
		if(results.containsKey(column + "," +row))
			return results.get(column + "," +row);
		if(row==1 && column==1)
			return BigInteger.ONE;
		if(row==0 ||column==0)
			return BigInteger.ZERO;
		BigInteger value = gridTraveler(row-1, column, results).add(gridTraveler(row, column-1, results));
		results.put(key, value);
		return value;
	}

}
