package com.philomath.basic;

public class RecursiveProduct {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int product = multiply(a,b);
		System.out.println(product);
	}

	private static int multiply(int a, int b) {
		if(b == 0) {
			return 0;
		}
		return a+multiply(a,b-1);
	}
}
