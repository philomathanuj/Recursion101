package com.philomath.basic;

public class ReverseAString {
	public static void main(String[] args) {
		String str = "helloworld";
		String reversedStr = reverseString(str);
		System.out.println(reversedStr);
	}

	private static String reverseString(String str) {
		if(str.length() == 1) {
			return str;
		}
		return str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));
	}
}
