//https://www.geeksforgeeks.org/rearrange-array-alternating-positive-negative-items-o1-extra-space/
//https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1
package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeElementsBySign {
    static ArrayList rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int num : arr){
            if (num>=0) {
                pos.add(num);
            }else{
                neg.add(num);
            }
        }

        if(pos.isEmpty() || neg.isEmpty()){
            return arr;
        }

        arr.set(0, (pos.get(0))) ;
        int ind = 1 ;
        int posIndex = 1, negIndex = 0;
        int n = arr.size();
        while (posIndex<pos.size() && negIndex<neg.size() && ind<n) {
            if (ind%2 == 0) {
                arr.set(ind, (pos.get(posIndex))) ;
                posIndex++;
            }else{
                arr.set(ind, (neg.get(negIndex))) ;
                negIndex++;
            }
            ind++;
        }

        while (posIndex<pos.size()) {
            arr.set(ind, (pos.get(posIndex))) ;
            posIndex++;
            ind++;
        }

        while(negIndex<neg.size()) {
            arr.set(ind, (neg.get(negIndex))) ;
            negIndex++;
            ind++;

        }

        return arr;
    }


    public static void main(String[] args) {
        ArrayList<Integer> input1 = new ArrayList(Arrays.asList(9, 4, -2, -1, 5, 0, -5, -3, 2));
        ArrayList<Integer> input2 = new ArrayList(Arrays.asList(-5, -2, 5, 2, 4, 7, 1, 8, 0, -8));
        ArrayList<Integer> input3 = new ArrayList(Arrays.asList(9, 5, -2, -1, 5, 0, -5, -3, 2));
        System.out.println("Input array: "+ input1);
        System.out.println("After rearranging elements by sign: "+rearrange(input1));
        System.out.println("\nInput array: "+input2);
        System.out.println("After rearranging elements by sign: "+rearrange(input2));
        System.out.println("\nInput array: "+(input3));
        System.out.println("After rearranging elements by sign: "+rearrange(input3));

    }
}

/*Sample Output:

Input array: [9, 4, -2, -1, 5, 0, -5, -3, 2]
After rearranging elements by sign: [9, -2, 4, -1, 5, -5, 0, -3, 2]

Input array: [-5, -2, 5, 2, 4, 7, 1, 8, 0, -8]
After rearranging elements by sign: [5, -5, 2, -2, 4, -8, 7, 1, 8, 0]

Input array: [9, 5, -2, -1, 5, 0, -5, -3, 2]
After rearranging elements by sign: [9, -2, 5, -1, 5, -5, 0, -3, 2]

 */