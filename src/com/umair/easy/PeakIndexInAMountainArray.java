package com.umair.easy;

//852. Peak Index in a Mountain Array
public class PeakIndexInAMountainArray {

	public int peakIndexInMountainArray(int[] arr) {
		int l = 0, r = arr.length - 1;
		while (l < r) {
			int m = l + (r - l) / 2;
			if (arr[m] < arr[m + 1])
				l = m + 1;
			else
				r = m;
		}
		return l;

	}

	public static void main(String[] args) {
		System.out.println(new PeakIndexInAMountainArray().peakIndexInMountainArray(new int[] { 3, 4, 5, 1 }));
	}
}
