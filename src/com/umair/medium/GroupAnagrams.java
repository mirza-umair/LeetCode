package com.umair.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//49. Group Anagrams
public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs.length == 0)
			return new ArrayList<>();
		HashMap<String, List<String>> map = new HashMap<>();
		for (String s : strs) {
			char[] hash = new char[26];
			for (char c : s.toCharArray())
				hash[c - 'a']++;

			String key = new String(hash);
			map.computeIfAbsent(key, k -> new ArrayList<>());
			map.get(key).add(s);
		}
		return new ArrayList<>(map.values());
	}

	public static void main(String[] args) {
		System.out
				.println(new GroupAnagrams().groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }));
	}
}
