//https://www.geeksforgeeks.org/find-a-seat-with-distance-between-nearest-occupied-seats-maximised/


package arrays;

public class FarthestOneInBinary {
    static int solve(String seats){
        // 1 filled seat, 0 empty seat
        int n = seats.length();
        int maxDist = 0;
        int prev = -1;

        for (int i = 0; i < n; i++) {
            if (seats.charAt(i) == '1') {
                if (prev == -1) {
                    maxDist = i;
                } else {
                    maxDist = Math.max(maxDist, (i - prev) / 2);
                }
                prev = i;
            }
        }

        // Check the distance from the last occupied seat to the end
        if (prev != -1) {
            maxDist = Math.max(maxDist, n - prev - 1);
        }

        return maxDist;


    }
    public static void main(String[] args){
        String s="1000101";
        System.out.println("Given String is: "+s);
        System.out.println("Maximum distance to an empty seat from occupied seat is: "+solve(s));
        s = "1000";
        System.out.println("\nGiven String is: "+s);
        System.out.println("Maximum distance to an empty seat from occupied seat is: "+solve(s));

    }
}
/*Sample Output:

Given String is: 1000101
Maximum distance to an empty seat from occupied seat is: 2

Given String is: 1000
Maximum distance to an empty seat from occupied seat is: 3
 */