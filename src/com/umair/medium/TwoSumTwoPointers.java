package com.umair.medium;

import java.util.Arrays;

//167. Two Sum II - Input Array Is Sorted
public class TwoSumTwoPointers {

	// time O(n)and space O(1)
	public int[] twoSum(int[] nums, int target) {

		int l = 0, r = nums.length - 1;
		while (l <= r) {
			int sum = nums[l] + nums[r];
			if (sum == target) {
				return new int[] { l + 1, r + 1 };
			}
			if (sum > target) {
				r -= 1;
			} else {
				l += 1;
			}
		}
		return new int[0];
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new TwoSumTwoPointers().twoSum(new int[] { 2, 7, 11, 15 }, 22)));

	}
}
