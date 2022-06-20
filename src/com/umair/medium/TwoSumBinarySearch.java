package com.umair.medium;

import java.util.Arrays;

//167. Two Sum II - Input Array Is Sorted
public class TwoSumBinarySearch {

	// binary search time= O(n log n) space O(1)
	public int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			int j = binarySearch(nums, target - nums[i], i + 1);
			if (j != -1)
				return new int[] { i + 1, j + 1 };
		}
		return new int[0];
	}

	// binary search time= O(n log n) space O(1)
	private int binarySearch(int[] nums, int target, int start) {
		int l = start, r = nums.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;
			if (nums[m] == target) {
				return m;
			}
			if (nums[m] < target) {
				l = m + 1;
			} else {
				r = m - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new TwoSumBinarySearch().twoSum(new int[] { 2, 7, 11, 15 }, 22)));

	}
}
