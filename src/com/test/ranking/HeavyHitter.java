package com.test.ranking;

public class HeavyHitter {

	private final String identifier;

	private final int frequency;
	
	public HeavyHitter(String identifier, int frequency) {
		this.identifier = identifier;
		this.frequency = frequency;
	}

	
	public String getIdentifier() {
		return identifier;
	}
	
	public int getFrequency() {
		return frequency;
	}
}
