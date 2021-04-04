package com.test.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {

	public SupplierDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Hello I am Supplier";
		
		System.out.println(supplier.get());
		
		SupplierDemo demoSupplier = new SupplierDemo();
		System.out.println(demoSupplier.get());
		
		List<String> list = Arrays.asList("a","b","c","d");
		long count = list.stream().filter(t -> t.equals("d")).count();
		System.out.println(count);
		
		//list.stream().collect(supplier, (t) -> System.out.println(t), null);
		list = Arrays.asList();
		System.out.println(list.stream().findAny().orElseGet(supplier));
		}

	@Override
	public String get() {
		return "Hello";
	}

}
