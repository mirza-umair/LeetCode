package com.umair.easy;

//35. Search Insert Position
public class SearchInsertPosition {

	public int searchInsert(int[] nums, int target) {

		int l = 0, r = nums.length - 1;
		int m = 0;
		while (l <= r) {
			m = l + (r - l) / 2;
			if (nums[m] < target) {
				l = m + 1;
			} else {
				r = m - 1;
			}
			if (nums[m] == target) {
				return m;
			}
		}
		return l + (r - l) / 2;

	}

	public static void main(String[] args) {
		System.out.println(new SearchInsertPosition().searchInsert(new int[] { 3, 5, 7, 9, 10 }, 11));
	}
}
