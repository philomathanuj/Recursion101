package com.philomath.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Reason for sorting:
 * we can tell if the current element is equal to the previous one by comparing nums[i] and nums[i-1]. Sorting an array take O(nlogn) which is better than search if there is a duplication in the temp result list in for loop (n^2)
 * @author Anuj Sharma
 *
 */
public class PermutationsWithDuplicates {
	public static void main(String[] args) {
		int[] n = {2,2,3};
		System.out.println(permute(n));
	}

	private static List<List<Integer>> permute(int[] n) {
		List<List<Integer>> permutations = new ArrayList<>();
		boolean[] used = new boolean[n.length];
		Arrays.sort(n);
		backtrack(permutations, new ArrayList<>(),n,used);
		return permutations;
	}

	private static void backtrack(List<List<Integer>> permutations, List<Integer> tempList, int[] n,boolean[] used) {
		if(tempList.size() == n.length) {
			permutations.add(new ArrayList<>(tempList));
		}
		else {
			for (int i = 0; i < n.length; i++) {
			if(used[i] || i > 0 && n[i] == n[i-1] && !used[i-1]) continue;
			used[i] = true;
			tempList.add(n[i]);
			backtrack(permutations, tempList, n, used);
			used[i] = false;
			tempList.remove(tempList.size()-1);
			}
		}
	}
}
