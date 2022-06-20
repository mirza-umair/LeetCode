package com.umair.easy;

import java.util.Arrays;

//1385. Find the Distance Value Between Two Arrays
public class FindTheDistanceValueBetweenTwoArrays {

	public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
		Arrays.sort(arr2);
		int res = 0;
		for (int i = 0; i < arr1.length; i++) {
			res += binarySearch(arr2, arr1[i], d);
		}
		return res;
	}

	int binarySearch(int[] nums, int i, int d) {
		int l = 0, r = nums.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;
			if (Math.abs(i - nums[m]) <= d) {
				return 0;
			} else if (i <= nums[m]) {
				r = m - 1;
			} else {
				l = m + 1;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(new FindTheDistanceValueBetweenTwoArrays()
				.findTheDistanceValue(new int[] { -3, 10, 2, 8, 0, 10 }, new int[] { -9, -1, -4, -9, -8 }, 9));

	}

}
