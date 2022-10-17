package exercises_on_input_decision_and_loop;

import java.util.Scanner;

public class NumberPatternD {
    public static void main(String[] args) throws Exception {
    
        int size = 0;
        int x, y;
        
        
        Scanner in = new Scanner(System.in); 

        System.out.print("Enter the size "); 
        size = in.nextInt();                     

        in.close();

        for (y = size; y >= 1; y--){

            for(x= y; x >= 1; x-- ){

                System.out.print(x + " ");

            }

            x = 1; 
            System.out.println();

        }

    }
}
