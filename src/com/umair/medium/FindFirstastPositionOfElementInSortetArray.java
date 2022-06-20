package com.umair.medium;

import java.util.Arrays;

//34. Find First and Last Position of Element in Sorted Array
public class FindFirstastPositionOfElementInSortetArray {

	public int[] searchRange(int[] nums, int target) {
		int[] result = new int[] { -1, -1 };
		int l = 0, r = nums.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;
			if (nums[m] == target) {
				result[0] = m;
				result[1] = m;
				while (result[0] - 1 >= 0 && nums[result[0] - 1] == target)
					result[0]--;
				while (result[1] + 1 < nums.length && nums[result[1] + 1] == target)
					result[1]++;
				return result;
			}
			if (nums[m] < target) {
				l = m + 1;
			} else {
				r = m - 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(
				Arrays.toString(new FindFirstastPositionOfElementInSortetArray().searchRange(new int[] { 8, 9 }, 8)));
	}

}
