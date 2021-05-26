package com.test.stream.mapreduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * 
Example test:   [1, 3, 6, 4, 1, 2]
Output:
[1, 1, 2, 3, 4, 6]
WRONG ANSWER (got 0 expected 5)

Example test:   [1, 2, 3]
Output:
[1, 2, 3]
WRONG ANSWER (got 0 expected 4)

Example test:   [-1, -3]
Output:
[-3, -1]
WRONG ANSWER (got 0 expected 1)

Your test case: [1, 3, 6, 4, 1, 2]
Output:
[1, 1, 2, 3, 4, 6]
Returned value: 0
 */
public class ZolandoTest {

	public static void main(String[] args) {
//		int[] abc = new int[]{1, 3, 6, 4, 1, 2};
//		System.out.println(solution(abc));
//		int[] b = new int[]{-1,-3};
//		System.out.println(solution(b));
//		int[] c = new int[]{1, 2, 3};
//		System.out.println(solution(c));
//		int N = 10;
//	    findNumbers(N);
		
		//splitstring("aaaaaa");
		
		//int[] a = new int[]{2, 4, 1, 6, 5, 9, 7};
		//Example test:   [2, 1, 6, 4, 3, 7]
		int[] a = new int[]{2, 1, 6, 4, 3, 7};
		System.out.println(spliter(a));

	}
	
	
	public static int spliter(int[] A) {
        // by contiguous subset i understood is that the split can only be done if the number next to current number is bigger and also the next number to this number is bigger
        // like in 2,4,1,6,5,9,7
        // 6 is bigger than 1 and 5 is also bigger than 1 so we split 
        // 
		int splitCount = 0;
		
		if(A.length==0)
			return 0;
		
		for(int i =0; i<A.length;i++)
		{
//			System.out.println(A[i]);
//			System.out.println(A[i+1]);
			if(i< A.length-1 &&  A[i]<A[i+1])
			{
				splitCount = splitCount +1;
				continue;
			}
			if(i< A.length-2 && A[i+1]>A[i] && A[i+2]>A[i] || i == A.length-2 && A[i+1]>A[i] )
			{
				splitCount = splitCount +1;
				continue;
			}
		}
		return splitCount;
    }
	
	static int splitstring(String S)
	{
		int stringSize = S.length();
	    long count =S.chars().filter(x -> x == 'a')
	             .count();
	    
	    // if S == empty
	        if(stringSize==0)
	        {
	            return 0;
	        }
	    // case where 'a' count is zero 
		    if(count == 0)
		    {
		    	return ((stringSize - 1) * (stringSize - 2)) / 2;
		    }
	    // case 'a' count cannot be divided in three parts
	        if (count % 3 != 0)
		    {
	             return 0;
	        }    
	 
	    // Case3
	    // General case
	 
	    // Number of zeros in each substring
	    int aInSubString = (int) (count / 3);
	 
	    int cutOne = 0;
	    int cutTwo = 0;
	    int counter = 0;
	 
	    for(int i = 0; i < stringSize; i++)
	    {
	        if (S.charAt(i) == 'a')
	        	counter++;
	        if (counter == aInSubString)
	            cutOne++;
	        else if (counter == 2 * aInSubString)
	            cutTwo++;
	    }
	    return cutOne*cutTwo;
	}
	
	static int[] findNumbers(int N)
	{
		
		int[] returnValue = new int[N];
		List<Integer> value= new ArrayList<>();
	    for (int i = 1; i <= N / 2; i++)
	    {
	        value.add(i);
	    	value.add(-i);
	    }
	   
	    if (N % 2 == 1)
	        value.add(0);
	    
	    returnValue = value.stream().mapToInt(i->i).toArray();
	    return returnValue;
	}
	 
	
	
	 public static int solution(int[] A) {
		 IntStream stream = Arrays.stream(A);
	        

	        List<Integer> collect = stream.sorted().boxed().collect(Collectors.toList());
	        if(collect.get(collect.size()-1)<0)
	        {
	        	return 1;
	        }
	        Integer lastValue = collect.get(0);
	        for (Integer integer : collect) {
	        	
				if(integer==lastValue)
					continue;
				if(integer == (lastValue+1))
				{
					lastValue = lastValue+1;
				}
				else
				{
					lastValue = lastValue+1;
					break;
				}
			}
	        if(lastValue == collect.get(collect.size()-1))
	        	return lastValue+1;
	        
	        else
	         return lastValue;
	        
	        
	        
	        
	    }
	
	

}
