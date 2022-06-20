package com.umair.easy;

public class MaxConsecutiveOnes {

	public int findMaxConsecutiveOnes(int[] nums) {
		int count = 0;
		int max = 0;
		for (int i : nums) {
			max = Math.max(max, count = i == 0 ? 0 : count + 1);
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(new MaxConsecutiveOnes().findMaxConsecutiveOnes(new int[] { 1, 0, 1, 1, 0, 1 }));
	}
}
