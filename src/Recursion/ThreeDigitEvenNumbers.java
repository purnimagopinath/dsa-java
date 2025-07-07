//https://leetcode.com/problems/unique-3-digit-even-numbers/description/?envType=problem-list-v2&envId=recursion

//Easy

package Recursion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThreeDigitEvenNumbers {
    private Set<Integer> uniqueNumbers = new HashSet<>();

    public int totalNumbers(int[] digits) {
        backtrack(digits, new boolean[digits.length], 0, 0);
        return uniqueNumbers.size();
    }

     void backtrack(int[] digits, boolean[] used, int currentNum, int digitCount) {
        if (digitCount == 3) {
            if (currentNum >= 100 && currentNum % 2 == 0) {
                uniqueNumbers.add(currentNum);
            }
            return;
        }

        for (int i = 0; i < digits.length; i++) {
            if (used[i] || (digitCount == 0 && digits[i] == 0)) {
                continue;
            }

            used[i] = true;
            backtrack(digits, used, currentNum * 10 + digits[i], digitCount + 1);

            used[i] = false;
        }
    }

    public static void main(String[] args){
        ThreeDigitEvenNumbers obj = new ThreeDigitEvenNumbers();

        int[] input1 = {1,2,3,4} ;
        System.out.println("\nGiven Array : "+ Arrays.toString(input1));
        System.out.println("3 Digit unique even numbers count : "+obj.totalNumbers(input1));
        ThreeDigitEvenNumbers obj1 = new ThreeDigitEvenNumbers();
        int[] input2 = {0,2,2} ;
        System.out.println("\nGiven Array : "+ Arrays.toString(input2));
        System.out.println("3 Digit unique even numbers count : "+obj1.totalNumbers(input2));
        int[] input3 = {6,6,6} ;
        ThreeDigitEvenNumbers obj2 = new ThreeDigitEvenNumbers();
        System.out.println("\nGiven Array : "+ Arrays.toString(input3));
        System.out.println("3 Digit unique even numbers count : "+obj2.totalNumbers(input3));
        int[] input4 = {1,3,5} ;
        ThreeDigitEvenNumbers obj3 = new ThreeDigitEvenNumbers();
        System.out.println("\nGiven Array : "+ Arrays.toString(input4));
        System.out.println("3 Digit unique even numbers count : "+obj3.totalNumbers(input4));
    }
}

/*Sample Output:

Given Array : [1, 2, 3, 4]
3 Digit unique even numbers count : 12

Given Array : [0, 2, 2]
3 Digit unique even numbers count : 2

Given Array : [6, 6, 6]
3 Digit unique even numbers count : 1

Given Array : [1, 3, 5]
3 Digit unique even numbers count : 0

 */
