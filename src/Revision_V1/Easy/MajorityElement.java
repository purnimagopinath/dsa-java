package Revision_V1.Easy;
//https://leetcode.com/problems/majority-element/description/

import java.util.Arrays;

//Arrays
public class MajorityElement {
    public static void main(String[] args){
        int[][] inputs = {{3, 2, 3},
                {2, 2, 1, 1, 1, 2, 2}};

        MajorityElement obj = new MajorityElement();

        for(int[] input:inputs){
            System.out.println("\nInput is : "+Arrays.toString(input));
            System.out.println("Majority element is "+obj.majorityElement(input));
        }
    }

    public int majorityElement(int[] nums){
        int majority = nums[0];
        int count = 1;
        for(int num:nums){
            if(count>0 && majority==num){
                count++;
            }else{
                if(count==0){
                    majority=num;
                }else{
                    count--;
                }
            }
        }

        return majority;
    }
}

/*Sample Output:

Input is : [3, 2, 3]
Majority element is 3

Input is : [2, 2, 1, 1, 1, 2, 2]
Majority element is 2

 */
