package com.philomath.basic;

public class RecursiveGCD {
	public static void main(String[] args) {
		int[] arr = {0,20,205};
		int gcd = findGCD(arr,arr.length);
		System.out.println(gcd);
	}

	private static int findGCD(int[] arr, int n) {
		if(n == 2) {
			return gcd(arr[0],arr[1]);
		}
		
		int a = arr[n-1];
		int b = findGCD(arr, n-1);
		return gcd(a,b);
		
	}
	/**
	 * GCD of two  number such as gcd(5,15)  = gcd(5,10)  = gcd(5,5)= 5
	 * in other words gcd of two numbers is gcd of smaller number and the difference
	 * between the two numbers.
	 * @param a
	 * @param b
	 * @return
	 */
	private static int gcd(int a, int b) {
		if(a == 0) {
			return b;
		}
		if(b == 0) {
			return a;
		}
		if(a == b) {
			return a;
		}
	    int difference = Math.abs(a-b);
	    int smallerNumber = Math.min(a, b);
		return gcd(difference,smallerNumber);
	}
	/**
	 * Elegant solution
	 * @param a
	 * @param b
	 * @return
	 */
	private static int gcdf(int a, int b) {

		if(b == 0) {
			return a;
		}
		
		return gcdf(b,a%b);
	}
}
