package methods;

import java.util.Scanner;

public class isOdd {
    public static void main(String[] args) {
        
          
        int number;

        Scanner in = new Scanner(System.in); 

        System.out.print("Enter the number: "); 
        number = in.nextInt();     

        in.close();

        System.out.println(number + " is an " + isodd(number) + " number " );

    }

    public static String isodd (int number){

        String tipe;

        if (number % 2 == 0){
            tipe = "even";
        }else{
            tipe = "odd";
        }

        return tipe;
    }

}
