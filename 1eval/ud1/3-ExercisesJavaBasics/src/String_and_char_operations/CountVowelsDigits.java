package String_and_char_operations;
import java.util.Scanner;

public class CountVowelsDigits {
    
    public static void main(String[] args) {

        String inStr;
        int countv = 0;
        int countd = 0;
        double percentagev = 0;
        double percentaged = 0;
        double length;


        Scanner in = new Scanner(System.in);  
        System.out.print("Enter a String: "); 
        inStr = in.next();    
        in.close();

        length = inStr.length();

        for (int x = 0; x < length; x++){
            if(inStr.charAt(x) == 'a' || inStr.charAt(x) == 'e' ||inStr.charAt(x) == 'i' ||inStr.charAt(x) == 'o' ||inStr.charAt(x) == 'u' ||inStr.charAt(x) == 'A' ||inStr.charAt(x) == 'E' ||inStr.charAt(x) == 'I' ||inStr.charAt(x) == 'O' ||inStr.charAt(x) == 'U' ){
                countv++;

            }else if(inStr.charAt(x) == '1' || inStr.charAt(x) == '2' ||inStr.charAt(x) == '3' ||inStr.charAt(x) == '4' ||inStr.charAt(x) == '5' ||inStr.charAt(x) == '6' ||inStr.charAt(x) == '7' ||inStr.charAt(x) == '8' ||inStr.charAt(x) == '9' ||inStr.charAt(x) == '0'){
                countd ++;
            }
        }

        percentagev = (countv*100)/length;
        percentaged = (countd*100)/length;

        System.out.printf("Number of vowels: " + countv + " %.2f", percentagev);
        System.out.printf("Number of digits: " + countd + " %.2f", percentaged);

     }
}
