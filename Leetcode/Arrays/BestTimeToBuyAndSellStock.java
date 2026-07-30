package Leetcode.Arrays;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        int min = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < min) {
                min = prices[i];
            }

            maxProfit = Math.max(maxProfit, prices[i] - min);
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println("Maximum Profit: " + maxProfit(prices));
    }
}
    

