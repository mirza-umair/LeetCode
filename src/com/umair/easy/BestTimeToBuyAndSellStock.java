package com.umair.easy;

//121. Best Time to Buy and Sell Stock 
public class BestTimeToBuyAndSellStock {

	public int maxProfit(int[] prices) {

		int maxProfit = 0, i = 0, j = 1;
		while (j < prices.length) {
			if (prices[i] > prices[j])
				i++;
			else
				maxProfit = Integer.max(maxProfit, prices[j++] - prices[i]);
		}
		return maxProfit;
	}

	public int maxProfit1(int[] prices) {

		if (prices == null || prices.length == 0)
			return 0;

		int l = 0, r = 1;
		int maxProfit = 0;
		while (r < prices.length) {
			if (prices[l] < prices[r])
				maxProfit = Math.max(maxProfit, prices[r] - prices[l]);
			else
				l = r;
			r++;
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		new BestTimeToBuyAndSellStock().maxProfit(new int[] { 7, 1, 5, 3, 6, 4 });
	}
}
