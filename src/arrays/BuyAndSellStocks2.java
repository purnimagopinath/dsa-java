/*
https://www.geeksforgeeks.org/stock-buy-sell/

https://www.geeksforgeeks.org/problems/stock-buy-and-sell2615/1
 */
package arrays;

import java.util.Arrays;

public class BuyAndSellStocks2 {
    public static int maximumProfit(int[] prices) {
        // code here
        int n=prices.length;
        int i=0;
        int profit=0;
        int min=Integer.MAX_VALUE, max;
        while(i<n) {
            while (i <= n-2 && (prices[i] > prices[i + 1])) {
                i++;
            }
            if(i<=n-1){
                min = prices[i];
                i++;
            }
            while (i <= n-2 && (prices[i] < prices[i+1])) {
                i++;
            }
            if(i<=n-1){
                max = prices[i];
                profit = profit + max - min;
            }
            i++;
        }
        return profit;

    }
    public static void main(String[] args){
        int[] input1 = {100, 180, 260, 310, 40, 535, 695};
        int[] input2={4,2,2,2,4};
        int[] input3 = {57, 94, 87, 60, 89, 82, 35, 90, 86, 24, 77, 38, 24, 23, 72, 59};
        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Maximum profit is:"+maximumProfit(input1));

        System.out.println("\nInput array: "+ Arrays.toString(input2));
        System.out.println("Maximum profit is:"+maximumProfit(input2));

        System.out.println("\nInput array: "+ Arrays.toString(input3));
        System.out.println("Maximum profit is:"+maximumProfit(input3));

    }
}
/*Sample Output:
Input array: [100, 180, 260, 310, 40, 535, 695]
Maximum profit is:865

Input array: [4, 2, 2, 2, 4]
Maximum profit is:2

Input array: [57, 94, 87, 60, 89, 82, 35, 90, 86, 24, 77, 38, 24, 23, 72, 59]
Maximum profit is:223
 */