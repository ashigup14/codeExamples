package com.test.stream;

public class BetterWay {

	
	public static void main(String[] args) {

		
		
		
		/* Which is better and why??
		 * points.stream()
		 * 		 .filter(p -> p.isInView())
		 * 		 .map(p -> invert())
		 * 		 .forEach(p -> System.out.println(p));
		 * 
		 * 
		 * this one is slightly more efficient
		 * saves a level of indirerction when method reference is there
		 * points.stream()
		 * 		 .filter(GraphicPoint::isInView)
		 * 		 .map(GraphicPoint::invert)
		 * 		 .forEach(System.out::println);
		 * 
		 * 
		 * 
		 */
		
		/*
		 * bad way??
		 * 
		 * patientRecords.stream()
		 * 				 .filter(this::isValidRecord)
		 * 				 .sorted(comparing(Patient::getMedication))
		 * 				 .sorted(comparing(Patient::getPhysician))
		 * 	             .sorted(comparing(Patient::getName))				
		 *  			 .collect(toList());
		 * 
		 * 
		 * then comparing with reversed order 
		 * 
		 * 
		 * 
		 * 
		 */
	}

}
