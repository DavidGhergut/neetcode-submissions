class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int left = 0, right = 1, N = prices.length;
        while (right < N) {
            if (prices[left] > prices[right]){
                left = right;
            }
            else {
                int diff = prices[right] - prices[left];
                if (diff > max_profit) {
                    max_profit = diff;
                }
            }
            right++;
        }
        return max_profit;
    }
}
