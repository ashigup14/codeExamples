package com.test.hasmaptest;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public HashMapTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Map<Employee, Integer> map = new HashMap<>();
//		map.put(new Employee("k",10), 5);
//		map.put(new Employee("k", 10), 10);
		
		Employee e = new Employee("k",10);
		map.put(e, 5);
		map.put(e, 10);
		
		System.out.println(map.size());

	}

}
