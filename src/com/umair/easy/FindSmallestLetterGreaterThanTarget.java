package com.umair.easy;

public class FindSmallestLetterGreaterThanTarget {

	// time O(log n) and space O(1)
	public char nextGreatestLetterLeetCodeSol(char[] letters, char target) {
		int lo = 0, hi = letters.length;
		while (lo < hi) {
			int mi = lo + (hi - lo) / 2;
			if (letters[mi] <= target)
				lo = mi + 1;
			else
				hi = mi;
		}
		return letters[lo % letters.length];
	}

	// time O(log n) and space O(1)
	public char nextGreatestLetter(char[] letters, char target) {

		int l = 0, r = letters.length - 1;
		int index = 0;

		while (l <= r) {
			int m = l + (r - l) / 2;
			char c = letters[m];
			if (c > target) {
				index = m;
				r = m - 1;
			} else {
				l = m + 1;
			}
		}
		return letters[index];
	}

	// time O(n) and space O(1)
	public char nextGreatestLetter2(char[] letters, char target) {
		System.out.println('a' < 'z');
		for (char c : letters)
			if (c > target)
				return c;
		return letters[0];
	}

	// time O(n) and space O(1)
	public char nextGreatestLetter1(char[] letters, char target) {
		boolean[] seen = new boolean[26];
		for (char c : letters) {
			seen[c - 'a'] = true;
		}
		while (true) {
			target++;
			if (target > 'z')
				target = 'a';
			if (seen[target - 'a'])
				return target;
		}
	}

	public static void main(String[] args) {
		System.out.println(
				new FindSmallestLetterGreaterThanTarget().nextGreatestLetterLeetCodeSol(new char[] { 'a', 'b' }, 'z'));

	}

}
