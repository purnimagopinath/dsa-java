//https://www.geeksforgeeks.org/find-intersection-of-intervals-given-by-two-lists/
//https://www.geeksforgeeks.org/problems/interval-list-intersections/1

package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfIntervals {
    public static List<List<Integer>> findIntersection(List<List<Integer>> arr1,
                                                List<List<Integer>> arr2) {

        int i = 0, j = 0;
        int n = arr1.size(), m = arr2.size();

        List<List<Integer>> intersection = new ArrayList<>();

        while (i < n && j < m) {
            int start1 = arr1.get(i).get(0);
            int end1 = arr1.get(i).get(1);
            int start2 = arr2.get(j).get(0);
            int end2 = arr2.get(j).get(1);

            int l = Math.max(start1, start2);
            int r = Math.min(end1, end2);

            if (l <= r) {
                intersection.add(Arrays.asList(l, r));
            }

            if (end1 < end2) {
                i++;
            } else {
                j++;
            }
        }

        return intersection;
    }

    public static void main(String[] args) {
        List<List<Integer>> input1 = Arrays.asList(
                Arrays.asList(0, 4),
                Arrays.asList(5, 10),
                Arrays.asList(13, 20),
                Arrays.asList(24, 25)
        );

        List<List<Integer>> input2 = Arrays.asList(
                Arrays.asList(1, 5),
                Arrays.asList(8, 12),
                Arrays.asList(15, 24),
                Arrays.asList(25, 26)
        );


        System.out.println("\nInput arrays: "+ input1+" and: "+input2);
        System.out.println("Intersection is: "+findIntersection(input1, input2) );

        input1 = Arrays.asList(
                Arrays.asList(0, 2),
                Arrays.asList(5, 10),
                Arrays.asList(12, 22),
                Arrays.asList(24, 25)
        );

        input2 = Arrays.asList(
                Arrays.asList(1, 4),
                Arrays.asList(9, 12),
                Arrays.asList(15, 24),
                Arrays.asList(25, 26)
        );
        System.out.println("\nInput arrays: "+ input1+" and: "+input2);
        System.out.println("Intersection is: "+findIntersection(input1, input2) );


    }
}


/*Sample Output:

Input arrays: [[0, 4], [5, 10], [13, 20], [24, 25]] and: [[1, 5], [8, 12], [15, 24], [25, 26]]
Intersection is: [[1, 4], [5, 5], [8, 10], [15, 20], [24, 24], [25, 25]]

Input arrays: [[0, 2], [5, 10], [12, 22], [24, 25]] and: [[1, 4], [9, 12], [15, 24], [25, 26]]
Intersection is: [[1, 2], [9, 10], [12, 12], [15, 22], [24, 24], [25, 25]]


 */