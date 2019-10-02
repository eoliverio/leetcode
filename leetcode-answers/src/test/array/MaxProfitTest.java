package test.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import main.array.MaxProfit;

public class MaxProfitTest {
    private MaxProfit mp = new MaxProfit();
    
    @Test
    public void leetcodeSample() {
        int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
        assertEquals(mp.maxProfitBruteForce(prices), mp.maxProfit(prices));
    }
    
    @Test
    public void worstStocksEver() {
        int[] prices = new int[] { 7, 6, 5, 4, 3, 2 };
        assertEquals(mp.maxProfitBruteForce(prices), mp.maxProfit(prices));
    }
    
    @Test
    public void niceStocks() {
        int[] prices = new int[] { 3, 5, 7, 9, 11 };
        assertEquals(mp.maxProfitBruteForce(prices), mp.maxProfit(prices));
    }
    
    @Test
    public void inconsistentStocks() {
        int[] prices = new int[] { 10, 2, 8, 1, 3, 9, 1, 5 };
        assertEquals(mp.maxProfitBruteForce(prices), mp.maxProfit(prices));
    }
    
    @Test
    public void buyAndSellAfterOneDay() {
        int[] prices = new int[] { 9, 5, 1, 10, 2, 3 };
        assertEquals(mp.maxProfitBruteForce(prices), mp.maxProfit(prices));
    }
}
