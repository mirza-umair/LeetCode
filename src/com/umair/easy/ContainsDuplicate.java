package com.umair.easy;

import java.util.HashSet;
import java.util.Set;

//217. Contains Duplicate (using hashing)
public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> visited = new HashSet<>();
		for (int i : nums) {
			if (visited.contains(i))
				return true;
			visited.add(i);
		}
		return false;
	}
}
