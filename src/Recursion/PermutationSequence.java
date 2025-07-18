//https://leetcode.com/problems/permutation-sequence/description/?envType=problem-list-v2&envId=recursion
//60
//Hard

package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
    public static String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        int[] fact = new int[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i;
            nums.add(i);
        }

        StringBuilder ans = new StringBuilder();

        for (int i=n; i>=1; i--) {
            int block = fact[i-1];
            int index = (k-1)/block;
            ans.append(nums.get(index));
            nums.remove(index);
            k = k- index*block;
        }

        return ans.toString();
    }

    public static void main(String[] args){
        int n=3, k=3;
        System.out.println("\nGiven n : "+n+" Given k : "+k);
        System.out.println("Permutation "+k+" for "+n+" numbers is : "+getPermutation(n,k));

        n=4;
        k=9;
        System.out.println("\nGiven n : "+n+" Given k : "+k);
        System.out.println("Permutation "+k+" for "+n+" numbers is : "+getPermutation(n,k));

        n=3;
        k=1;
        System.out.println("\nGiven n : "+n+" Given k : "+k);
        System.out.println("Permutation "+k+" for "+n+" numbers is : "+getPermutation(n,k));

        n=4;
        k=17;
        System.out.println("\nGiven n : "+n+" Given k : "+k);
        System.out.println("Permutation "+k+" for "+n+" numbers is : "+getPermutation(n,k));

        n=4;
        k=12;
        System.out.println("\nGiven n : "+n+" Given k : "+k);
        System.out.println("Permutation "+k+" for "+n+" numbers is : "+getPermutation(n,k));

    }
//Sit with this again
}



/*Sample Output:

Given n : 3 Given k : 3
Permutation 3 for 3 numbers is : 213

Given n : 4 Given k : 9
Permutation 9 for 4 numbers is : 2314

Given n : 3 Given k : 1
Permutation 1 for 3 numbers is : 123

Given n : 4 Given k : 17
Permutation 17 for 4 numbers is : 3412

Given n : 4 Given k : 12
Permutation 12 for 4 numbers is : 2431


 */