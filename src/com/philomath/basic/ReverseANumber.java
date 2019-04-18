package com.philomath.basic;

public class ReverseANumber {
	static int reversed = 0;
	static int remainder = 0;
public static void main(String[] args) {
	int n = 123;
	int result = reverse(n);
	System.out.println(result);
}

private static int reverse(int n) {
     if(n > 0) {
    	 remainder = n%10;
    	 reversed = reversed*10+remainder;
    	 reverse(n/10);
     }
     return reversed;
}

}
