package com.philomath.dividenconquer;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int index = binarySearch(arr,10);
		index = binarySearchRecursive(arr,10);
		System.out.println("binary serach result : "+index);
	}

	private static int binarySearchRecursive(int[] arr, int i) {
		return bs(arr,0,arr.length-1,i);
		
	}

	private static int bs(int[] arr, int low, int high, int number) {
		
		if(low <= high) {
			int middle = (low+high)/2;
			if(arr[middle] == number) {
				return middle;
			}
			else if(arr[middle] < number) {
				return bs(arr,middle+1,high,number);
			}
			else {
				return bs(arr,low,middle-1,number);
			}
		}
		return -1;
	}

	private static int binarySearch(int[] arr, int i) {
		int low = 0,high = arr.length-1;
		int middle = (low+high)/2;
		while(low <= high) {
			if(arr[middle] == i) {
				return middle;
			}
			else if(arr[middle] < i) {
				low = middle+1;
				middle = (low+high)/2;
			}
			else {
				high = middle-1;
				middle = (low+high)/2;
			}
		}
		return -1;
	}
	

}
