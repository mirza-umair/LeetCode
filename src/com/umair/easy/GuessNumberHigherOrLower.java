package com.umair.easy;

//374. Guess Number Higher or Lower
public class GuessNumberHigherOrLower {

	public int guessNumber(int n) {

		int l = 1;
		int r = n;

		while (l <= r) {
			int mid = l + (r - l) / 2;
			int res = guess(mid);
			if (res == 1) {
				l = mid + 1;
			} else if (res == -1) {
				r = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	private int guess(int mid) {

		return 0;
	}

}
