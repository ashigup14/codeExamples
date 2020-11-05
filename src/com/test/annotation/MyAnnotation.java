/**
 * 
 */
package com.test.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author Ashish Gupta
 *
 */

//restricting annotations 
@Target(ElementType.TYPE)
@Documented
public @interface MyAnnotation {

	String name() default "rahul";
	int count() default 100;
}
