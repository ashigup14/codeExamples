package com.test;

import java.util.Optional;

public class AlgoTest {

	public static void main(String[] args) {
		AlgoTest altest = new AlgoTest();
		System.out.println(altest.findUserStatus(10l));

	}
	
	// AVOID
	public String computeStatus() {
	    System.out.println("in computeStatus");// some code used to compute status
	    return "computeStatus result";
	}
	public String findUserStatus(long id) {
	    Optional<String> status = Optional.of("Result"); // prone to return an empty Optional
	    // computeStatus() is called even if "status" is not empty
	    // return status.orElse(computeStatus()); 
	    return status.orElseGet(this::computeStatus); 
	    
	    //return status.orElseThrow(IllegalStateException::new);
	}

}
