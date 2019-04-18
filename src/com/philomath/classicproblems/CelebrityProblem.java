package com.philomath.classicproblems;

public class CelebrityProblem {
	static boolean[][] network = null;
  public static void main(String[] args) {
	  int numberOfPeople = 4;
	  String[] people = {"Adam","Bob","Donald Trump","Don"};
	  
	/*  network = new boolean[][]{{false,false,true,false},
			  	 {false,false,true,false},
			  	 {false,false,false,false},
			  	 {false,false,true,false}};
			  	 */
	  network = new boolean[numberOfPeople][numberOfPeople];
	for (int i = 0; i < network.length; i++) {
		for (int j = 0; j < network.length; j++) {
			network[i][j] = true;
			if(i ==2) {
				network[i][j] = false;
			}
		}
	}
	int celebrity = findCelebrity(numberOfPeople);
	System.out.println(people[celebrity-1]);
	
}
/**
 * Complexity: O(n^2)
 * Let's say 3rd guy is celebrity we 
 * go from 3 knows 4 -> 2 knows 3 -> 1 knows 2 
 * 1 knows 2 (2) -> 2 knows 3 (3) -> 3 knows 4 (false) so return 3
 * Now we start from 3 again i.e. f(n-1) => f(3) and go through same thing again
 * 2 knows 3 -> 1 knows 2 
 * 1 knows 2 (2) -> 2 knows 3 (3) -> finally 3 will be returned
 * @param n
 * @return
 */
private static int findCelebrity(int n) {
	if(n == 1 ) {
		return 1;
	}
	if(knows(findCelebrity(n-1),n)) {
		return n;
	}
	
	return findCelebrity(n-1);
}

private static boolean knows(int a, int b) {
	return network[a-1][b-1];
}
}
