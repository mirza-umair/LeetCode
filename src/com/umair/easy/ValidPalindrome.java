package com.umair.easy;

import java.util.function.Predicate;

//125. Valid Palindrome
public class ValidPalindrome {

	public boolean isPalindrome(String s) {

		if (s == null)
			return false;

		if (s.isEmpty())
			return true;

		int i = 0, j = s.length() - 1;

		Predicate<Character> testChar = c -> (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');

		while (i < j) {
			char r = s.charAt(i);
			char l = s.charAt(j);
			if (testChar.test(r)) {
				if (testChar.test(l)) {
					if (Character.toLowerCase(r) != Character.toLowerCase(l))
						return false;

					i++;
					j--;
				} else {
					j--;
				}

			} else {
				i++;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
		;
	}
}
