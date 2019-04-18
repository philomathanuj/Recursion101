package com.philomath.basic;

public class PalindromicNumber {
	static int reversed = 0;
	static int remainder = 0;
	static int num = 0;
	public static void main(String[] args) {
		num = 1234321;
		
		boolean flag = checkIfPalindromicNumber(num);
		System.out.println(flag);
	}
	private static boolean checkIfPalindromicNumber(int n) {
		if(n != 0) {
			remainder = n%10;
			reversed = 10*reversed+remainder;
			checkIfPalindromicNumber(n/10);
		}
		if(reversed == num) {
			return true;
		}
		return false;
	}

}
