package com.philomath.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Q: i can`t understand why "i > 0 && nums[i] == nums[i-1] && !used[i - 1]"
 * A: Let's say you have [1, 2, 2, 2, 3]. If you only do nums[i] == nums[i-1] (i>0), you will only have one "2" (the 1st 2) in your final result. In reality, an answer that have multiple 2s can still be an valid answer. So, after we pick the 1st "2", we still want to be able to choose the 2nd or 3nd "2" or both. In order words, we would like to explore 3 possibilities: one 2, two 2s, and 3 2s, so we only want to skip unused "2" in the DFS process. Hope it helps
 * @user4672xl assume permutating [1,2,2,3]. Talking about 2 at index 2, we could have been here as part of path: [1->2->2] in which case previous 2 at index 1 would be a parent to us so used[i-1] = true in this case. However we could also have been here as part of path [1---->2] which is a direct path from 1. In this case previous 2 at index 1 is not a parent of this particular permutation therefore used[i-1] = false so that we skip it to avoid duplicates
 * 
 * @author Anuj Sharma
 *
 */
public class CombinationSumWithoutReuse {
public static void main(String[] args) {
    int[] n = {1,2,3};
    int target = 10;
      System.out.println(combinations(n,target));
}

private static List<List<Integer>> combinations(int[] n, int target) {
	List<List<Integer>> combinations = new ArrayList<>();
	Arrays.sort(n);
	backtrack(combinations,new ArrayList<>(),n,target,0);
	return combinations;
}

private static void backtrack(List<List<Integer>> combinations, List<Integer> tempList, int[] n, int remaining, int start) {
 if(remaining < 0) {
	 return;
 }	
 else if(remaining == 0) {
	 combinations.add(new ArrayList<>(tempList));
 }
 else {
	 for (int i = start; i < n.length; i++) {
		if(i > start && n[i] == n[i-1]) continue;
		tempList.add(n[i]);
		backtrack(combinations, tempList, n,remaining-n[i],i+1);
		tempList.remove(tempList.size()-1);
	}
 }
}
}
