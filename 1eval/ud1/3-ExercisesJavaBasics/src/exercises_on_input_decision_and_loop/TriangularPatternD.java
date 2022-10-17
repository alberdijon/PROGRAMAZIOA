package exercises_on_input_decision_and_loop;

import java.util.Scanner;

public class TriangularPatternD {
    public static void main(String[] args) throws Exception {
    
        int size = 0;
        int x, y;
        
        
        Scanner in = new Scanner(System.in); 

        System.out.print("Enter the size "); 
        size = in.nextInt();                     

        in.close();

        for (x = 1; x <= size; x++){

            
            for (y = 1; y <= size; y++ ){

                if(x + y >= size + 1){

                    System.out.print("# "); 
                }else{

                    System.out.print("  "); 

                }

                
            }

            System.out.println(); 


        }

    }  
}
