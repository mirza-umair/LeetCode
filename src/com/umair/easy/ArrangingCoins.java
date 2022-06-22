package com.umair.easy;

//441. Arranging Coins
public class ArrangingCoins {

	public int arrangeCoins(int n) {
		long l = 1, r = n;

		long k, curr;
		while (l <= r) {
			k = l + (r - l) / 2;
			curr = k * (k + 1) / 2;

			if (curr == n)
				return (int) k;

			if (n < curr) {
				r = k - 1;
			} else {
				l = k + 1;
			}
		}
		return (int) r;
	}

//1,2,3,4,5
	public static void main(String[] args) {
		System.out.println(new ArrangingCoins().arrangeCoins(5));
	}
}
