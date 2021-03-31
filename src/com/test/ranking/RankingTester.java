package com.test.ranking;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class RankingTester {

	
	public static void main(String[] args) {
		String[] eventArray= {"a",
							  "b",
							  "c",
							  "d",
							  "b",
							  "d",
							  "a",
							  "b",
							  "b",
							  "b",
							  "d",
							  "b",
							  "e",
							  "d",
							  "d"}; 
		List<HeavyHitter> topK = topK(eventArray, 3);
		for (HeavyHitter heavyHitter : topK) {
			System.out.println(heavyHitter.getIdentifier());
		}
	}
	
	private static List<HeavyHitter> topK(String[] events, int k)
	{
		Map<String, Integer> frequencyTable = new HashMap<String, Integer>();
		
		for (String event : events) {
			frequencyTable.put(event, frequencyTable.getOrDefault(event, 0)+1);
		}
		
		PriorityQueue<HeavyHitter> heap = new PriorityQueue<HeavyHitter>(Comparator.comparing(e -> e.getFrequency()));
	
		for (Map.Entry<String, Integer> entry : frequencyTable.entrySet()) {
			
			heap.offer(new HeavyHitter(entry.getKey(), entry.getValue()));
			
			if(heap.size()>k)
				heap.poll();
		}
		
		Long collect = heap.stream().collect(Collectors.counting());
		System.out.println(collect);
		return heap.stream()
			//	.sorted(Comparator.comparing(e -> e.getFrequency()))
				.collect(Collectors.toList());
	}

}
