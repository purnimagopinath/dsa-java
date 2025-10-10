package Recursion;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args){
        String str = "geeksforgeek";
        System.out.println("\nInput :"+str);
        System.out.println("Output : "+removeDuplicates(str));
        str = "abccbccba";
        System.out.println("\nInput :"+str);
        System.out.println("Output : "+removeDuplicates(str));
        str = "abcd";
        System.out.println("\nInput :"+str);
        System.out.println("Output : "+removeDuplicates(str));
    }

    public static String removeDuplicates(String s){
        String result = removeOnce(s);
        while(!result.equals(s)){
            s=result;
            result = removeOnce(s);
        }
        return result;
    }

    public static String removeOnce(String s){
        if(s==null || s.length()<=1) return s;
        StringBuilder str = new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                char dup = s.charAt(i);
                while(i<s.length() && s.charAt(i)==dup){
                    i++;
                }
            }else {
                str.append(s.charAt(i));
                i++;
            }

        }
        return str.toString();
    }
}


/*Sample Output:

Input :geeksforgeek
Output : gksforgk

Input :abccbccba
Output :

Input :abcd
Output : abcd
 */