package com.philomath.basic;

public class PalindromeString {
	public static void main(String[] args) {
		String str = "ab";
		boolean isPalindrome = checkIfStrIsPalindrome(str);
		System.out.println(isPalindrome);
	}

	private static boolean checkIfStrIsPalindrome(String str) {
		if(str.length() <= 1) {
			return true;
		}
		return str.charAt(0) == str.charAt(str.length()-1) && checkIfStrIsPalindrome(str.substring(1,str.length()-1));
	}
}
