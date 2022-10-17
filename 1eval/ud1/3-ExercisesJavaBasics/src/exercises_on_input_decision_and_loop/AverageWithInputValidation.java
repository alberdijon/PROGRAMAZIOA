package exercises_on_input_decision_and_loop;

import java.util.Scanner;

public class AverageWithInputValidation  {
    public static void main(String[] args) throws Exception {
    
        int mark1 = -1, mark2 = -1, mark3 = -1;
        double average;

        
        Scanner in = new Scanner(System.in); 

        while( mark1 < 0 || mark1 > 100){
 
            System.out.print("Enter the mark (0 - 100)"); 
            mark1 = in.nextInt();                     



            if( mark1 < 0 || mark1 > 100){
                System.out.println("Invalid input, try again...");
            }

        }

        
        while( mark2 < 0 || mark2 > 100){

            System.out.print("Enter the mark (0 - 100)"); 
            mark2 = in.nextInt();                     


            if( mark2 < 0 || mark2 > 100){
                System.out.println("Invalid input, try again...");
            }

        }

        
        while( mark3 < 0 || mark3 > 100){


            System.out.print("Enter the mark (0 - 100)"); 
            mark3 = in.nextInt();                     



            if( mark3 < 0 || mark3 > 100){
                System.out.println("Invalid input, try again...");
            }

        }

        in.close();

        average = (mark1 + mark2 + mark3)/3.0;

        System.out.printf("The average is: %.2f", average );

    }
}
