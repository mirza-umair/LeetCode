package com.umair.easy;

//242. Valid Anagram
public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;

		int[] stores = new int[26];

		for (int i = 0; i < s.length(); i++) {
			stores[s.charAt(i) - 'a']++;
			stores[t.charAt(i) - 'a']--;
		}
		for (int i : stores) {
			if (i != 0) 
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		boolean anagram = new ValidAnagram().isAnagram("aacc", "ccac");

		System.out.println(anagram);
	}
}
