package String_and_char_operations;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        String inStr;
        int inStrLen;
        char last;

        Scanner in = new Scanner(System.in);  
        System.out.print("Enter a String: "); 
        inStr = in.next();    
        in.close();

        inStrLen = inStr.length();  

        System.out.print("The reverse of the String: " +inStr + " is ");

        for(int x =inStrLen; x >= 0; x--){
            last = inStr.charAt(x - 1);
            System.out.print(last);
        }
        System.out.println();



     }
}