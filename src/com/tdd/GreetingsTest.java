package com.tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GreetingsTest {
	
	@Test
	public void testGreeting(){
		Greetings greetings = new Greetings();
		assertThat(greetings.getMessage(), is("Hello World!!"));
	}
}
