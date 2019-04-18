package com.philomath.basic;

public class RecursivePower {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		// need to compute x^y
		int result = power(x,y);
		System.out.println(result);
	}

	private static int power(int x, int y) {
		// x*x*x....y times
		// x*x^y-1
		if(y ==0) {
			return 1;
		}
		return x*power(x,y-1);
	}
}
