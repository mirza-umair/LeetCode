package com.umair.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//20. Valid Parentheses
public class ValidParentheses {

	@SuppressWarnings("serial")
	private final static Map<Character, Character> map = new HashMap<>() {
		{
			put('{', '}');
			put('(', ')');
			put('[', ']');
		}
	};

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (Character c : s.toCharArray()) {
			if (map.containsKey(c)) {
				stack.push(c);
			} else if (stack.isEmpty() || map.get(stack.pop()) != c) {
				return false;
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println(new ValidParentheses().isValid("()"));
	}
}
