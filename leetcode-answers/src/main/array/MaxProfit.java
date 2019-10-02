package main.array;

public class MaxProfit {
    /**
     * Contiguously check and record the maximum profit using the cheapest stock price as a starting (buying) point
     * 
     * @param prices stock price in list as days
     * @return optimal buy and sell indices for maximum profit
     */
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        
        // like how we view stock market graphs, imagine a graph where x is days and y is stock price
        // two things we need to monitor:
        // 1. when the prices were at its lowest (we buy stocks!)
        // 2. how much can be earned if selling the stocks (if it's the best ever, record it)
        for (int i = 0; i < prices.length; i++) {
            // if a new minimum price found, we renew the checking (buy new stocks)
            // in the case there was any previous profit (stocks became more expensive) at all,
            //     it would have been recorded by maxprofit
            if (prices[i] < minprice)
                minprice = prices[i];
            // check if selling stocks now would result in greater returns than before (maxprofit)
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
    
    /**
     * Brute force implementation: check all buy and sell combinations
     * 
     * @param prices stock price in list as days
     * @return optimal buy and sell indices for maximum profit
     */
    public int maxProfitBruteForce(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int newProfit = prices[j] - prices[i];
                if (newProfit > maxProfit) {
                    maxProfit = newProfit;
                }
            }
        }
        return maxProfit;
    }
}
