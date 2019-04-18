package com.philomath.basic;

public class RecursiveDivision {
	public static void main(String[] args) {
		int a = 16;
		int b = 15;
		int result = divide(a,b);
		System.out.println(result);
	}

	private static int divide(int a, int b) {
		// a/b = 1+(a-b)/b
		if(a < b) {
			return 0;
		}		
		return 1+divide(a-b,b);
	}
}
