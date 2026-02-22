package Revision_V1.Easy;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
//Arrays

import java.util.Arrays;

public class BuySellStock {
    public int maxProfit(int[] prices){
        int n = prices.length;
        if(n<=1) return 0;
        int maxP = prices[1]-prices[0];
        int minBuy = prices[0];
        for(int i=1;i<n;i++){
            maxP = Math.max(prices[i]-minBuy, maxP);
            if(prices[i]<minBuy){
                minBuy = prices[i];
            }
        }
        if(maxP<0) maxP=0;
        return maxP;
    }

    public static void main(String[] args){
        BuySellStock obj = new BuySellStock();
        int[][] inputs = {{7,1,5,3,6,4},
                          {7, 6, 4, 3, 1}};

        for(int[] input:inputs){
            System.out.println("\nInput is: "+Arrays.toString(input));
            System.out.println("Max Profit is:"+obj.maxProfit(input));
        }
    }
}

/*Sample Output:
Input is: [7, 1, 5, 3, 6, 4]
Max Profit is:5

Input is: [7, 6, 4, 3, 1]
Max Profit is:0

 */
