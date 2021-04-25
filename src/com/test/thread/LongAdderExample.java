package com.test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.IntStream;
import static org.junit.Assert.*;

public class LongAdderExample {

	public LongAdderExample() {
	}

	public static void main(String[] args) throws InterruptedException {
		LongAdder counter = new LongAdder();
		ExecutorService executorService = Executors.newFixedThreadPool(8);

		//@sun.misc.Contended("tlr")
		int numberOfThreads = 4;
		int numberOfIncrements = 100;

		Runnable incrementAction = () -> IntStream
		  .range(0, numberOfIncrements)
		  .forEach(i -> counter.increment());

		for (int i = 0; i < numberOfThreads; i++) {
		    executorService.execute(incrementAction);
		}
		Thread.sleep(1000);
		long sum = counter.sum();
		
		assertEquals(numberOfIncrements * numberOfThreads, sum);
		executorService.shutdown();
	}

}
