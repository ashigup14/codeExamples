package com.test.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
// import java.util.function.IntConsumer;

public class ConsumerDemo// implements Consumer<Integer>
{

//	@Override
//	public void accept(Integer t) {
//		System.out.println("Printing: " + t);		
//	}
	
	public static void main(String[] args)
	{
		Consumer<Integer> consumer = t -> System.out.println("Printing: " + t);	
	//	IntConsumer consumer = t -> System.out.println("Printing: " + t);	
		consumer.accept(10);
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		//list.stream().forEach(consumer);
		list.stream().forEach(t -> System.out.println("Printing: " + t));
		
	}

}
