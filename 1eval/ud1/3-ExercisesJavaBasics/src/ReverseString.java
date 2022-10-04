import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        String inStr;
        int inStrLen;
        char last;

        Scanner in = new Scanner(System.in);  
        System.out.print("Enter a String: "); 
        inStr = in.next();    
        inStrLen = inStr.length();                 

        for(int x =inStrLen; x >= 0; x--)

        in.close();

     }
}
