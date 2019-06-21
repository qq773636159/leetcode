package leetcode;

public class removeDuplicate {
	public int removeDuplicate(int[] nums) {
		if(nums == null) return 0;
		int count = 1; //remember to set this to 1 instead of 0
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] != nums[i-1]) {
				nums[count] = nums[i];
				count++;
			}
		}
		
		return count;
	}
}
