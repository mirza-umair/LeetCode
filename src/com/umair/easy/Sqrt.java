package com.umair.easy;

//69. Sqrt(x)
public class Sqrt {

	public int mySqrt(int x) {

		int l = 1, r = x;
		if (x <= 1)
			return x;

		while (l <= r) {
			int m = l + (r - l) / 2;
			if (m <= x / m) {
				l = m + 1;
			} else {
				r = m - 1;
			}
		}
		return r;
	}

	public static void main(String[] args) {
		System.out.println(new Sqrt().mySqrt(4));
	}
}

//1,2,3,4