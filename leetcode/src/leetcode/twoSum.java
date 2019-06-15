package leetcode;

//bruteforce time complexity O(n^2). space complexity O(1）
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] result;
        
        for(int i = 0; i < length; i++) {
        	for(int j = i+1; j < length; j++) {
        		if(nums[i]+nums[j]==target) {
        			return result = new int[] {i, j};
        		}
        	}
        }

        return null;
    }
}