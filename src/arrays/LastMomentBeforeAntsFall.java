//https://www.geeksforgeeks.org/last-moment-before-all-ants-fall-out-of-a-plank/
//https://www.geeksforgeeks.org/problems/last-moment-before-all-ants-fall-out-of-a-plank/1

package arrays;

import java.util.Arrays;

public class LastMomentBeforeAntsFall {
    public static int getLastMoment(int n, int[] left, int[] right) {
        // code here
        int maxStepsToRight = 0;
        for(int r:right){
            maxStepsToRight = Math.max(maxStepsToRight, n-r);
        }
        int maxStepsToLeft = 0;
        for(int l:left){
            if(l<=0) continue;
            maxStepsToLeft = Math.max(maxStepsToLeft, l);
        }
        return (Math.max(maxStepsToLeft,maxStepsToRight));
    }

    public static void main(String[] args) {
        int[] left1 = {2};
        int[] right1 = {0,1,3};
        int n = 4;
        System.out.println("Left: "+ Arrays.toString(left1)+" Right: "+ Arrays.toString(right1));
        System.out.println("last ant(s) fall out of the plank of length : "+n+" is: "+getLastMoment(n,left1,right1));

        int[] left2 = {};
        int[] right2 = {0,1,2, 3, 4};
        System.out.println("\nLeft: "+ Arrays.toString(left2)+" Right: "+ Arrays.toString(right2));
        System.out.println("last ant(s) fall out of the plank : "+n+" is: "+getLastMoment(n,left2,right2));
        n=3;
        int[] left3 = {0};
        int[] right3 = {3};
        System.out.println("\nLeft: "+ Arrays.toString(left3)+" Right: "+ Arrays.toString(right3));
        System.out.println("last ant(s) fall out of the plank : "+n+" is: "+getLastMoment(n,left3,right3));
    }

}

/*Sample Output:

Left: [2] Right: [0, 1, 3]
last ant(s) fall out of the plank of length : 4 is: 4

Left: [] Right: [0, 1, 2, 3, 4]
last ant(s) fall out of the plank : 4 is: 4

Left: [0] Right: [3]
last ant(s) fall out of the plank : 3 is: 0

 */