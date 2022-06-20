package com.umair.easy;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

//155. Min Stack
public class MinStack {

	private Stack<Integer> stack = new Stack<>();

	public MinStack() {

	}

	public void push(int val) {
		stack.push(val);
	}

	public void pop() {
		stack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return Collections.min(stack);
	}

	public List<Integer> getStack() {
		return stack;
	}

	public static void main(String[] args) {

		MinStack obj = new MinStack();
		obj.push(-2);
		obj.push(0);
		obj.push(-3);
		System.out.println(obj.getStack());

		System.out.println(obj.getMin());
		obj.pop();
		System.out.println(obj.getStack());
		System.out.println(obj.top());
		System.out.println(obj.getMin());

	}
}
