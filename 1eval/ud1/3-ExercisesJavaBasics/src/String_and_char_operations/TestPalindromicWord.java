package String_and_char_operations;

import java.util.Scanner;

public class TestPalindromicWord {
    public static void main(String[] args) {
        String str;
        char[] array;
        boolean result = false;
        
        System.out.printf("Enter a string:\n");
        Scanner in = new Scanner(System.in); 
        str = in.nextLine();
        in.close(); 

        array = str.toCharArray(); 
        result = isPalindrome(array);
        
        if(result)
        {
            System.out.printf("It is palindrome.");
        }
        else
        {
            System.out.printf("It is not palindrome.");
        }
        System.out.println();
    }
    public static boolean isPalindrome(char[] Word){
        int i = 0;
        int j = Word.length - 1;
        
        while (j > i) {
            if (Word[i] != Word[j]) {
                return false;
            }
            ++i;
            --j;
    }
    return true;
}
}
