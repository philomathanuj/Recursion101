package com.philomath.patterns;

import java.util.ArrayList;
import java.util.List;
/**
 * Q: Can anyone pls tell me why we have the "remove" line for this ? Thank you very much
 * A:I think because we reuse the tempList for all the backtrack function calls. We reuse the tempList for performance.
We can delete the "remove" line and create a new List instance every time. The result is the same.
	public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> list = new ArrayList<>();
       // Arrays.sort(nums); // not necessary
       backtrack(list, new ArrayList<>(), nums);
       return list;
}

private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
       if(tempList.size() == nums.length){
          list.add(new ArrayList<>(tempList));
       } else{
          for(int i = 0; i < nums.length; i++){ 
             if(tempList.contains(nums[i])) continue; // element already exists, skip
              List<Integer> current = new ArrayList<>(tempList); //here we create a new List instance
             current.add(nums[i]);
             backtrack(list, current, nums);
             // tempList.remove(tempList.size() - 1); we don't need to remove the last element anymore
          }
       }
 } 
 * @author Anuj Sharma
 * 
 * https://www.youtube.com/watch?v=78t_yHuGg-0&feature=youtu.be
 *
 */
public class PermutationsWithoutDuplicates {
	public static void main(String[] args) {
		int[] n = {1,2,3};
		System.out.println(permute(n));
	}
	
	public static List<List<Integer>> permute(int[] nums) {
		   List<List<Integer>> list = new ArrayList<>();
		   // Arrays.sort(nums); // not necessary
		   backtrack(list, new ArrayList<>(), nums);
		   return list;
		}

		private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
		   if(tempList.size() == nums.length){
		      list.add(new ArrayList<>(tempList));
		   } else{
		      for(int i = 0; i < nums.length; i++){ 
		         if(tempList.contains(nums[i])) continue; // element already exists, skip
		         tempList.add(nums[i]);
		         backtrack(list, tempList, nums);
		         tempList.remove(tempList.size() - 1);
		      }
		   }
		} 
}
