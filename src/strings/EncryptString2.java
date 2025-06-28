
//https://www.geeksforgeeks.org/dsa/encrypt-the-string-2/

//https://www.geeksforgeeks.org/problems/encrypt-the-string-21117/1


package strings;

public class EncryptString2 {

    static String encryptString(String S) {
        // code here
        StringBuilder encryptedS = new StringBuilder();
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            int count=0;
            while(i<S.length() && ch==S.charAt(i)){
                count++;
                i++;
            }
            i--;
            String hex=Integer.toHexString(count);
            encryptedS.append(ch);
            encryptedS.append(hex);
        }
        return encryptedS.reverse().toString();

    }

    public static void main(String[] args){
        String s="aaaaaaaaaaa";
        System.out.println("Given String: "+s);
        System.out.println("Encrypted String is: "+encryptString(s));
        s="abc";
        System.out.println("\nGiven String: "+s);
        System.out.println("Encrypted String is: "+encryptString(s));
    }
    //Fails for longer output
}

/*Sample output:
Given String: aaaaaaaaaaa
Encrypted String is: ba

Given String: abc
Encrypted String is: 1c1b1a

 */
