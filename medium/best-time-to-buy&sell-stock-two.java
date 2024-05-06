class Solution {
    public int maxProfit(int[] prices) {
        int m = 0;
        int total =0;

        for(int i =0;i<prices.length-1;i++){
            total = total+ Math.max(m,prices[i+1]-prices[i]);


        }
        return total;

    }
}