//https://www.geeksforgeeks.org/split-array-three-equal-sum-subarrays/
//https://www.geeksforgeeks.org/problems/split-array-in-three-equal-sum-subarrays/1

package arrays;

import java.util.Arrays;
import java.util.List;

public class SplitArrayIntoThreeEqual {
    public static List<Integer> findSplit(int[] arr) {
        int n=arr.length;
        int totalSum=0;
        for (int j : arr) {
            totalSum = totalSum + j;
        }
        List<Integer> list;
        if(!(totalSum%3==0)){
            list = Arrays.asList(-1, -1);
            return list;
        }
        int currCount=0;
        Integer[] indexArr = new Integer[]{-1, -1};
        int ind=0;
        for(int i=0;i<n;i++){
            currCount+=arr[i];
            if((currCount==totalSum/3)&&(ind<2)){
                indexArr[ind] = i;
                ind++;
                currCount=0;
            }
        }
        if(indexArr[1]==-1){
            indexArr[0]=-1;
        }
        list = Arrays.asList(indexArr);
        return list;
    }
    public static void main(String[] args) {
        int[] input1 = {1, 3, 4, 0, 4};
        int[] input2 = {2, 3, 4};
        int[] input3 = {0, 1, 1};
        int[] input4 = {1, -1, 1, -1, 1, -1, 1, -1};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Splitting array Index: "+findSplit(input1));
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Splitting array Index: "+findSplit(input2));
        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("Splitting array Index: "+findSplit(input3));
        System.out.println("\nInput array: "+Arrays.toString(input4));
        System.out.println("Splitting array Index: "+findSplit(input4));

    }
}

/*Sample Output:

Input array: [1, 3, 4, 0, 4]
Splitting array Index: [1, 2]

Input array: [2, 3, 4]
Splitting array Index: [-1, -1]

Input array: [0, 1, 1]
Splitting array Index: [-1, -1]

Input array: [1, -1, 1, -1, 1, -1, 1, -1]
Splitting array Index: [1, 3]

 */