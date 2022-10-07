package String_and_char_operations;

import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        String inStr;
        int Strlen;
        char momch;

        Scanner in = new Scanner(System.in);  
        System.out.print("Enter a String: "); 
        inStr = in.next();    
        in.close();

        Strlen = inStr.length();
        inStr = inStr.toUpperCase();

        for (int x =0; x < Strlen; x++){
            momch = inStr.charAt(x);
            if(momch == 65|| momch == 66 || momch==67 ){
                momch += 23;
                System.out.print(momch);
            }else if(momch >= 68 && momch <= 90){
                momch -= 3;
                System.out.print(momch);
            }else {
                System.out.print("-- incorrect caracter--");
            }


        }
        System.out.println();
    }
}
