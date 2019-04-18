package com.philomath.basic;

public class Print100 {
	
	public static void main(String[] args) {
		print(100);
	}

	private static void print(int i) {
		if(i == 0) {
			return;
		}
		// here syso statement would have printed from 100 to 1
		print(i-1);
		System.out.println(i); // prints 1 to 100
		
	}

}
