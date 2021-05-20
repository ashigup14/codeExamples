package com.test.ds;

public class RecusrsiveSummation {

	private static int sum(int n){
		System.out.println("in sum n=" + n);
		if(n == 0)
			return 0;
		return sum(n-1) + n;
	}

	public static void main(String[] args) {
		System.out.println(sum(3));

	}

}
