package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args){
        int n=1;
        System.out.println("\nNumber of discs :"+n);
        toh(n, 'A', 'C', 'B');
        n=2;
        System.out.println("\nNumber of discs :"+n);
        toh(n, 'A', 'C', 'B');
        n=3;
        System.out.println("\nNumber of discs :"+n);
        toh(n, 'A', 'C', 'B');
        n=4;
        System.out.println("\nNumber of discs :"+n);
        toh(n, 'A', 'C', 'B');

    }

    public static void toh(int n, char from, char to, char temp){
        if(n==0) return;
        toh(n-1, from, temp, to);
        System.out.println("Move disc "+n+" from "+from+" to "+to);
        toh(n-1, temp, to, from);

    }
}

/*SAMPLE OUTPUT:
Number of discs :1
Move disc 1 from A to C

Number of discs :2
Move disc 1 from A to B
Move disc 2 from A to C
Move disc 1 from B to C

Number of discs :3
Move disc 1 from A to C
Move disc 2 from A to B
Move disc 1 from C to B
Move disc 3 from A to C
Move disc 1 from B to A
Move disc 2 from B to C
Move disc 1 from A to C

Number of discs :4
Move disc 1 from A to B
Move disc 2 from A to C
Move disc 1 from B to C
Move disc 3 from A to B
Move disc 1 from C to A
Move disc 2 from C to B
Move disc 1 from A to B
Move disc 4 from A to C
Move disc 1 from B to C
Move disc 2 from B to A
Move disc 1 from C to A
Move disc 3 from B to C
Move disc 1 from A to B
Move disc 2 from A to C
Move disc 1 from B to C


 */
