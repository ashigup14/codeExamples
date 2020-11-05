/**
 * 
 */
package com.test.annotation;

import java.lang.annotation.Annotation;

/**
 * @author Ashish
 *
 */
public class AnnotationProcessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Processing...");
		
		int success = 0, failed =0, total = 0, disabled = 0;
		
		Class<AnnotationExample> obj = AnnotationExample.class;
		
		if(obj.isAnnotationPresent(CustomTypeAnnotation.class))
		{
			Annotation annotation = obj.getAnnotation(CustomTypeAnnotation.class);
			CustomTypeAnnotation custom = (CustomTypeAnnotation)annotation;
			
			System.out.printf("%nPriority : %s", custom.priority());
			System.out.printf("%nPriority : %s", custom.createdBy());
			System.out.printf("%nTags :");
			
			int tagLength = custom.tags().length;
			
			for (String tag : custom.tags()) {
				
				if(tagLength > 1)
					System.out.println(tag + ", " );
				else
					System.out.println(tag);
				tagLength--;
			}
			
			System.out.printf("%nLastModified : %s%n%n", custom.lastModified());
			
		}
	}

}
