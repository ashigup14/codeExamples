/**
 * 
 */
package com.test.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Ashish Gupta
 *
 */

//restricting annotations 
@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface MyAnnotation {

	String name() default "rahul";
	int count() default 100;
}
