package com.umair.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//1. Two Sum 
public class TwoSum {

	public int[] twoSum1(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i]))
				return new int[] { map.get(nums[i]), i };
			else
				map.put(target - nums[i], i);
		}
		return new int[0];
	}

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int x = nums[i];
			if (map.containsKey(target - x))
				return new int[] { map.get(target - x), i};
			map.put(x, i);
		}
		throw new IllegalArgumentException("No two sum solution ");
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new TwoSum().twoSum(new int[] {2, 7, 11, 15 }, 9)));

	}
}
