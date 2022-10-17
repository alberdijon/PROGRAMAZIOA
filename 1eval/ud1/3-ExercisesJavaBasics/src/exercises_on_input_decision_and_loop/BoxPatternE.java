package exercises_on_input_decision_and_loop;

import java.util.Scanner;

public class BoxPatternE {
    public static void main(String[] args) {
        int row,col, size;   
        
        System.out.printf("Enter a number:");
        Scanner in = new Scanner(System.in); 
        size = in.nextInt();
        in.close(); 
        size = size - 1;
        
        for(row = 0; row <= size ; row++){

            for(col = 0; col <= size; col++){

                if (row == 0 || row == size || row == (size ) - col || row == col || col == 0 || col == size ){

                    System.out.printf("#");
                }
                else{
                    
                    System.out.printf(" ");
                }
            }

            System.out.printf("\n");
        }
        
        System.out.printf("\n\n");
    }
}
