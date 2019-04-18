package com.philomath.basic;

public class RecursiveSum {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int sum = findSum(arr,arr.length);
		System.out.println(sum);
	}

	private static int findSum(int[] arr, int n) {
		// base case :: if there is only one element, sum would be that element itself
		if(n == 1) {
			return arr[0];
		}
		// sum will be nth element + remaining n-1 elements
		return arr[n-1]+findSum(arr, n-1);
	}
}
