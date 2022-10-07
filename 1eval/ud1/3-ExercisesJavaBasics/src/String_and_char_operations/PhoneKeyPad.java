package String_and_char_operations;
import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        String inStr;
        int Strlen;

        Scanner in = new Scanner(System.in);
        System.out.printf("Enter a string:\n");
        inStr = in.next().toLowerCase();
        in.close(); 

        Strlen = inStr.length();

        for (int i = 0; i < Strlen; ++i) 
        {  
            switch (inStr.charAt(i)) 
            {
            case 'a': case 'b': case 'c':  // No break for 'a' and 'b', fall thru 'c'
                System.out.print(2); 
                break;
            case 'd': case 'e': case 'f':
                System.out.print(3); 
                break;
            case 'g': case 'h': case 'i':  // No break for 'a' and 'b', fall thru 'c'
                System.out.print(4); 
                break;
            case 'j': case 'k': case 'l':
                System.out.print(5); 
                break;
            case 'm': case 'n': case 'o':  // No break for 'a' and 'b', fall thru 'c'
                System.out.print(6); 
                break;
            case 'p': case 'q': case 'r': case 's':
                System.out.print(7); 
                break;
            case 't': case 'u': case 'v':  // No break for 'a' and 'b', fall thru 'c'
                System.out.print(8); 
                break;
            case 'w': case 'x': case 'y': case 'z':
                System.out.print(9); 
                break;
            case ' ':
                System.out.print(" "); 
                break;
            default:

            }
        }   
        System.out.println();
    }
}
