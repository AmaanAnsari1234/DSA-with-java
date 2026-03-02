// Leet code Problem NO : 121.
// Best Time to Buy and Sell Stock (Arrays - Mid)

import java.util.*;

public class P21 {

    // You will write this method
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1)
            return 0;
       int minPrice = prices[0];
       int maxP = 0;
        for (int i = 1; i < prices.length ; i++) {
            if (prices[i] < minPrice)
            {
                minPrice= prices[i];
            }
            else {
                int profit = prices[i]-minPrice;
                maxP = Math.max(maxP,profit);
            }

        }
        return maxP;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int result = maxProfit(prices);

        System.out.println("Max Profit = " + result);

        sc.close();
    }
}
