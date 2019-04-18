package com.philomath.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsWithDuplicates {
	public static void main(String[] args) {
		int[] n = {1,1};
		List<List<Integer>> allSubsets = subsets(n);
		System.out.println(allSubsets.toString());
	}

	private static List<List<Integer>> subsets(int[] n) {
		List<List<Integer>> subsets = new ArrayList<>();
		Arrays.sort(n);
		backtrack(subsets,new ArrayList<>(),n,0);
		return subsets;
	}

	private static void backtrack(List<List<Integer>> subsets, List<Integer> tempList, int[] n, int start) {
	 subsets.add(new ArrayList<>(tempList));
	 for (int i = start; i < n.length; i++) {
		if(i > start && n[i] == n[i-1]) continue;
		tempList.add(n[i]);
		backtrack(subsets, tempList, n,i+1);
		tempList.remove(tempList.size()-1);
	}
	}

}
