package com.umair.easy;

//367. Valid Perfect Square
public class ValidPerfectSquare {

	public boolean isPerfectSquare(int num) {
		if (num == 0 || num == 1)
			return true;

		long s = 0, end = num / 2;

		while (s <= end) {
			long mid = s + (end - s) / 2;
			if (mid * mid == num)
				return true;
			else if (mid * mid > num)
				end = mid - 1;
			else
				s = mid + 1;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(new ValidPerfectSquare().isPerfectSquare(16));

	}

}
