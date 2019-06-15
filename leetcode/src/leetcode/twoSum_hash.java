package leetcode;

import java.lang.reflect.MalformedParametersException;
import java.util.Arrays;
import java.util.HashMap;

//Time complexity O(n), space complexity O(n)
public class twoSum_hash {
	 public static int[] twoSum(int[] nums, int target) {
		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		 for(int i = 0; i < nums.length; i++) {
			 map.put(nums[i], i);
		 }
		 
		 for(int i = 0; i < nums.length; i++) {
			 int complement = target - nums[i]; 
			 if(map.containsKey(complement) && i!=map.get(complement)) {
				 return new int[] {i, map.get(complement)};
			 }
		 }
		 
		 throw new IllegalArgumentException("no compelent");
	 }
	 
//	 public static void main(String[] args) {
//		 int[] nums = {2,2};
//		 int target = 4;
//		 int[] sum = twoSum(nums, target);
//		 System.out.print("result"+ Arrays.toString(sum));
//	 }
}
