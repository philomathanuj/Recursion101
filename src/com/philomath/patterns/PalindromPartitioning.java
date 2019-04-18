package com.philomath.patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/permutations/discuss/18239/a-general-approach-to-backtracking-questions-in-java-subsets-permutations-combination-sum-palindrome-partioning
 * Given a string s, partition s such that every substring of the partition is a palindrome.
   Return all possible palindrome partitioning of s.
   Input: "aab"
   Output:
	[
  ["aa","b"],
  ["a","a","b"]
	]
 * @author Anuj Sharma
 *
 */
public class PalindromPartitioning {
	public static void main(String[] args) {
		System.out.println(partition("abcba"));
	}
	
	public static List<List<String>> partition(String s) {
		   List<List<String>> list = new ArrayList<>();
		   backtrack(list, new ArrayList<>(), s, 0);
		   return list;
		}

		public static void backtrack(List<List<String>> list, List<String> tempList, String s, int start){
		   if(start == s.length())
		      list.add(new ArrayList<>(tempList));
		   else{
		      for(int i = start; i < s.length(); i++){
		         if(isPalindrome(s, start, i)){
		            tempList.add(s.substring(start, i + 1));
		            backtrack(list, tempList, s, i + 1);
		            tempList.remove(tempList.size() - 1);
		         }
		      }
		   }
		}

		public static boolean isPalindrome(String s, int low, int high){
		   while(low < high)
		      if(s.charAt(low++) != s.charAt(high--)) return false;
		   return true;
		} 

}
