package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum_onepass {
	 public static int[] twoSum(int[] nums, int target) {
		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		 for(int i = 0; i < nums.length; i++) {
			 int compliment = target - nums[i];
			 if(map.containsKey(compliment)) {
				 return new int[]{map.get(compliment), i};
			 }
			 map.put(nums[i], i);
		 }
		 
		 throw new IllegalArgumentException("answer not found");
	 }
	 
	 public static void main(String[] args) {
		 int[] nums = {3,2,4};
		 int target = 6;
		 int[] sum = twoSum(nums, target);
		 System.out.print("result"+ Arrays.toString(sum));
	 }
}
