package com.philomath.patterns;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumWithReuse {
	public static void main(String[] args) {
		int[] n = {1,2,3};
		int target = 5;
		System.out.println(combinationSum(n,target));;
	}

	private static List<List<Integer>> combinationSum(int[] n, int target) {
		List<List<Integer>> combinations = new ArrayList<>();
		backtrack(combinations,new ArrayList<>(),n,target,0);
		return combinations;
	}

	private static void backtrack(List<List<Integer>> combinations, List<Integer> tempList, int[] n, int remaining,int start) {
		if(remaining < 0) {
			return;
		}
		else if(remaining == 0) {
			combinations.add(new ArrayList<>(tempList));
		}
		else {
			for (int i = start; i < n.length; i++) {
				tempList.add(n[i]);
				backtrack(combinations, tempList, n, remaining-n[i], i);
				tempList.remove(tempList.size()-1);
			}
		}
	}
}
