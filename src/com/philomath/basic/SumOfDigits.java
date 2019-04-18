package com.philomath.basic;

public class SumOfDigits {
	public static void main(String[] args) {
		int number = 2345;// casting out 9s is same as number % 9
		int result = sumOfDigits(number);
		System.out.println(result);
	}

	private static int sumOfDigits(int number) {
		if(number == 0) {
			return 0;
		}
		return number%10+sumOfDigits(number/10);
	}
}
