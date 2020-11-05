package com.test.lambda;

import java.util.stream.StreamSupport;

public class StreamBadExample {

	public static void main(String[] args) {
		Iterable<Double> probes = null;

		StreamSupport.stream(probes.spliterator(), false)
				    .filter(p -> p == 0.0d || p == 1.0d)
				    .limit(10L)
				    .forEach(
					        probe -> System.out.printf(
					            "Probe #%d: %f", 0, probe * 100.0d
					        )
				    		);
	}

}
