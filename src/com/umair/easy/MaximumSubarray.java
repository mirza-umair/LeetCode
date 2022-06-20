package com.umair.easy;

//53. Maximum Subarray
public class MaximumSubarray {

	public int maxSubArray(int[] nums) {
		int maxSum = nums[0];
		int curSum = 0;
		for (int i : nums) {
			if (curSum < 0)
				curSum = 0;
			curSum += i;
			maxSum = Math.max(maxSum, curSum);
		}
		return maxSum;
	}

	public static void main(String[] args) {
		System.out.println(new MaximumSubarray().maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
	}
}
