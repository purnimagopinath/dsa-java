/*Say you have an array, A, for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction
(ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Return the maximum possible profit.

 */

package arrays;

import java.util.Arrays;

public class BestTimeToBuyAndSellStocks1 {

    public static int maxProfit(int[] A) {
        int n = A.length;
        if(n==0||n==1){
            return 0;
        }
        int max=A[n-1];
        int profit=0;
        for(int i=n-1;i>=0;i--){
            if(A[i]>max){
                max=A[i];
            }
            profit = Math.max(profit, max-A[i]);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5};
        int[] input2 = {5, 1, 10, 1};
        int[] input3 = {1, 2};
        int[] input4 = {1, 4, 5, 2, 4};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Maximum Profit Obtained is: "+maxProfit(input1));

        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Maximum Profit Obtained is: "+maxProfit(input2));

        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Maximum Profit Obtained is: "+maxProfit(input3));

        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Maximum Profit Obtained is: "+maxProfit(input4));

    }
}

/*Sample Output:

Input array: [1, 2, 3, 4, 5]
Maximum Profit Obtained is: 4

Input array: [5, 1, 10, 1]
Maximum Profit Obtained is: 9

Input array: [5, 1, 10, 1]
Maximum Profit Obtained is: 1

Input array: [5, 1, 10, 1]
Maximum Profit Obtained is: 4
 */