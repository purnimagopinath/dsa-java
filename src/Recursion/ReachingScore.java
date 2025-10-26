package Recursion;

public class ReachingScore {

    public static void main(String[] args){
        int input = 20;
        int[] arr = {3, 5, 10};

        System.out.println("\nGiven n "+ input);
        System.out.println("No of ways : "+solve(input, arr, 0, 0 ));

        input = 9;
        System.out.println("\nGiven n "+ input);
        System.out.println("No of ways : "+solve(input, arr, 0, 0 ));

        input  = 2;
        System.out.println("\nGiven n "+ input);
        System.out.println("No of ways : "+solve(input, arr, 0, 0 ));

        input = 5;
        System.out.println("\nGiven n "+ input);
        System.out.println("No of ways : "+solve(input, arr, 0, 0 ));

        input = 18;
        System.out.println("\nGiven n "+ input);
        System.out.println("No of ways : "+solve(input, arr, 0, 0 ));

        input = 17;
        System.out.println("\nGiven n "+ input);
        System.out.println("No of ways : "+solve(input, arr, 0, 0 ));

        input = 7;
        System.out.println("\nGiven n "+ input);
        System.out.println("No of ways : "+solve(input, arr, 0, 0 ));
    }

    static int solve(int score, int[] arr, int current, int idx){

        if(current==score){
            return 1;
        }
        if(idx>=arr.length) return 0;
        if(current>score) return 0;


        return (solve(score, arr, arr[idx]+current, idx)+
                solve(score, arr, current, idx+1));


    }
}

/*Sample Output:
Given n 20
No of ways : 4

Given n 9
No of ways : 1

Given n 2
No of ways : 0

Given n 5
No of ways : 1

Given n 18
No of ways : 3

Given n 17
No of ways : 1

Given n 7
No of ways : 0

 */