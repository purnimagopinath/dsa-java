package Recursion;

public class StringToInteger {
    public static void main(String[] args){
        String str = "1235";
        System.out.println("Input : "+str);
        System.out.println("Output : "+stoi(str, str.length()-1));
        str = "0145";
        System.out.println("Input : "+str);
        System.out.println("Output : "+stoi(str, str.length()-1));
    }

    public static int stoi(String str, int i){
        if(str.isEmpty()||i<0) return 0;
        int digit = str.charAt(i)-'0';
        return digit+10*(stoi(str, i-1));
    }
}

/*Sample Output:
Input : 1235
Output : 1235
Input : 0145
Output : 145

 */
