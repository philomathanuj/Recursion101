package com.philomath.basic;

public class RecursiveMax {
	public static void main(String[] args) {
		int[] arr = {10,8,3,5,1,9,16,2,3,8,16};
		int max = findMax(arr,arr.length);
		System.out.println(max);
	}

	private static int findMax(int[] arr, int n) {
		// base case :: when there is only one element, that element will be maximum
		if(n == 1) {
			return arr[0];
		}
		int a = arr[n-1]; // last element or nth element
		int b = findMax(arr,n-1); // remaining n-1 the element
		// max will be max of last and remaining n-1 elements
		if(a >= b) {
			return a;
		}
		else {
			return b;
		}
	}

}
