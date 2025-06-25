//https://www.geeksforgeeks.org/converting-decimal-number-lying-between-1-to-3999-to-roman-numerals/

//https://www.geeksforgeeks.org/problems/convert-to-roman-no/1

package strings;

public class IntegerToRoman {
    static String convertToRoman(int n) {
        // code here
        StringBuilder roman = new StringBuilder();
        int[] romanValues = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] romanKeys = {"I", "IV", "V","IX", "X", "XL","L","XC", "C","CD", "D", "CM", "M"};
        int i=romanValues.length-1;
        while(n>0){
            int quo=n/romanValues[i];
            while(quo>0){
                roman.append(romanKeys[i]);
                quo--;
            }
            n=n%romanValues[i];
            i--;
        }
        return roman.toString();
    }

    public static void main(String[] args){
        int n=5;
        System.out.println("Given String: "+n);
        System.out.println("Roman representation is : "+convertToRoman(n));
        n=3;
        System.out.println("\nGiven String: "+n);
        System.out.println("Roman representation is: "+convertToRoman(n));
        n=1304;
        System.out.println("\nGiven String: "+n);
        System.out.println("Roman representation is : "+convertToRoman(n));

    }
}

/*Sample Output:
Given String: 5
Roman representation is : V

Given String: 3
Roman representation is: III

Given String: 1304
Roman representation is : MCCCIV

 */