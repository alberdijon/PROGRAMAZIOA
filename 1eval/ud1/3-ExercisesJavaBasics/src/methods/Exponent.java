package methods;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        
        int exp;
        int base; 

        Scanner in = new Scanner(System.in); 

        System.out.print("Enter the base "); 
        base = in.nextInt();   
        
        System.out.print("Enter the exponent "); 
        exp = in.nextInt();    

        in.close();
        
        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
    
    }

    public static int exponent(int base, int exp) {

        int product = 1;

        for (int x = 1; x <= exp; x++){

            product *= base;

        }

        return product;
    }
}
