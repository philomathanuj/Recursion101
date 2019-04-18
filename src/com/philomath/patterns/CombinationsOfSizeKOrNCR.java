package com.philomath.patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 * nck/ncr/n choose k
 * 
 * Example:
 * Input: n = 4, k = 2
	Output:
	[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
	]
 * @author Anuj Sharma
 *
 */
public class CombinationsOfSizeKOrNCR {
	public static void main(String[] args) {
		System.out.println(Combine(4, 2));
	}
	
	public static List<List<Integer>> Combine(int n, int k) {
		List<List<Integer>> combinations = new ArrayList<>();
		backtrack(combinations, new ArrayList<>(),0, n, k);
		return combinations;
		}

	private static void backtrack(List<List<Integer>> combinations, List<Integer> tempList, int start, int n, int k) {
		if(0 == k){
	        combinations.add(new ArrayList<Integer>(tempList));
	    }
	    else
	    {
	        for(int i = start; i<n; i++)
	        {
	            if(tempList.contains(i+1)) continue;
	            tempList.add(i+1);
	            backtrack(combinations,tempList, i, n, k-1);
	            tempList.remove(tempList.size()-1);
	        }
	    }               
	}
}
