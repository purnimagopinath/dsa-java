//https://www.geeksforgeeks.org/dsa/roman-number-to-integer/

//https://www.geeksforgeeks.org/problems/roman-number-to-integer3201/1

package strings;

import java.util.HashMap;

public class RomanToInteger {

    public static int romanToDecimal(String s) {
        // code here
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = romanMap.get(s.charAt(i));

            if (i + 1 < s.length()) {
                int next = romanMap.get(s.charAt(i + 1));
                if (current < next) {
                    sum += next - current;
                    i++;
                } else {
                    sum += current;
                }
            } else {
                sum += current;
            }
        }

        return sum;
    }

    public static void main(String[] args){
        String s="IX";
        System.out.println("Given String: "+s);
        System.out.println("Numeric value is : "+romanToDecimal(s));
        s="XL";
        System.out.println("\nGiven String: "+s);
        System.out.println("Numeric value is: "+romanToDecimal(s));
        s="MCMIV";
        System.out.println("\nGiven String: "+s);
        System.out.println("Numeric value is is : "+romanToDecimal(s));

    }
}
/*Sample Output:

Given String: IX
Numeric value is : 9

Given String: XL
Numeric value is: 40

Given String: MCMIV
Numeric value is is : 1904
 */