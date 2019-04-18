package com.philomath.patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Achieve k from 1...n
 * @author Anuj Sharma
 *
 */
public class CombinationSumOfTargetK {
  public static void main(String[] args) {
	System.out.println(combinationsOfNSizeK(2,4));
}
  public static List<List<Integer>> combinationsOfNSizeK(int k, int n) {
      List<List<Integer>> res = new ArrayList<>();
      backtrack(res, new ArrayList<>(), new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, k, n, 0);
      return res;
  }

  private static void backtrack(List<List<Integer>> res, List<Integer> tempList, int[] nums, int k, int remain, int start) {
      if (remain < 0 || tempList.size() > k) return;
      else if (remain == 0 && tempList.size() == k) res.add(new ArrayList<>(tempList));
      else {
          for (int i = start; i < nums.length; i++) {
              tempList.add(nums[i]);
              backtrack(res, tempList, nums, k, remain - nums[i], i + 1);
              tempList.remove(tempList.size() - 1);
          }
      }
  }
}

