package String_and_char_operations;

import java.util.Scanner;

public class ExchangeChipher {
    public static void main(String[] args) {
        String inStr;
        int Strlen;
        char momch;
        int numb;

        Scanner in = new Scanner(System.in);  
        System.out.print("Enter a String: "); 
        inStr = in.next();    
        in.close();

        Strlen = inStr.length();
        inStr = inStr.toUpperCase();

        for (int x =0; x < Strlen; x++){
            momch = inStr.charAt(x);
            
            numb = momch - 65;

            momch =(char)( 90 - numb);

            System.out.print(momch);

        }
        System.out.println();
    }
}
