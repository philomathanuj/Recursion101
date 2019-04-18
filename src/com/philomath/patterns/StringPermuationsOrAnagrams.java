package com.philomath.patterns;

import java.util.ArrayList;
import java.util.List;

public class StringPermuationsOrAnagrams {
	public static void main(String[] args) {
		System.out.println(anagrams("abc"));
	}
	
	public static List<String> anagrams (String input){
		char[] inp = input.toCharArray();
		List<String> result = new ArrayList<>();
	   	backtrack(inp,result,inp.length,"");
	   	return result;
	} 
	public static void backtrack(char[] input,List<String> result,final int size,String str) {
		if(str.length()==size){  // or can be input.length
			result.add(str);// no need to do new String(str) as string is immuatable
		}
		else{
			for(int i =0 ;i<input.length;i++){
				if(str.contains(""+input[i])){
					continue;
				}
				String newStr = str + input[i];
				backtrack(input,result,size,newStr);
			}
		}
	}
}
