package com.test.stream;

public class MixingIterationExample {

	public static void main(String[] args) {
		/*
		 * Now the problem with this looping and stream is that we are looping 12 times over the stream of data 
		 * which is really bad.
		 * 
		 * for(int m=0; m<12; m++){
		 * 	int i= m; this is done to make effectively final
		 *  daysOfMonth[i] = data.stream()
		 *  					 .filter(f -> f.getDate().getMonth() == Month.of(i + 1))
		 *  					 .collect(groupingBy(f -> f.getDate().getDayOfMonth(), Collectors.counting()));
		 *  }  
		 *  
		 *  
		 *  better answer to the above solution is to use 
		 *  but we are doing the same thing but it is written in better fashion 
		 *  
		 *  IntStream.range(0, 12).forEach(
		 *  						i -> daysOfMonth[i] = data.stream()
		 *  					 .filter(f -> f.getDate().getMonth() == Month.of(i + 1))
		 *  					 .collect(groupingBy(f -> f.getDate().getDayOfMonth(), Collectors.counting())));
		 *  
		 *  the best way is to 
		 *  
		 *  
		 *  Map<Month, Map<Integer, Long>> results = data.Stream()
		 *  											 .map(DataType::getDate)
		 *  										     .collect(groupingBy(ZonedDateTime::getMonth,
		 *  													  groupingBy(ZonedDateTime::getDayOfMonth,
		 *  																 Collectors.counting())));
		 */
		
		
		
		
		

	}

}
