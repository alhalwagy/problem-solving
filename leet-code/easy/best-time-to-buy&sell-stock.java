class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int maxi = 0;

        for (int i = prices.length - 1; i >= 0; i--) {

            if (prices[i] > maxi) {
                maxi = prices[i];
            }
            maxprofit = Math.max(maxprofit, maxi - prices[i]);

        }
        return maxprofit;
    }
}