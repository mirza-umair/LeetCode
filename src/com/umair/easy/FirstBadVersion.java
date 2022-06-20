package com.umair.easy;

//278. First Bad Version
public class FirstBadVersion {

	public int firstBadVersion(int n) {
		if (n == 1)
			return 1;
		int start = 1;
		int end = n;
		int badV = -1;
		while (start <= end) {
			int mid = start + ((end - start) / 2);
			if (isBadVersion(mid)) {
				badV = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}

		return badV;
	}

	private boolean isBadVersion(int l) {
		// TODO Auto-generated method stub
		return false;
	}
}