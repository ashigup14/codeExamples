package com.test.stream;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class StreamNullCheck {

	public StreamNullCheck() {
	}

	public static void main(String[] args) {
		
		Objects.requireNonNull("String");
		String query = "abc=dhaani&bcw=just&wwe=test&wwe=west";
		Arrays.stream(query.split("&"))
				.filter(t -> Objects.requireNonNull(t)!=null);
		

	}

}
