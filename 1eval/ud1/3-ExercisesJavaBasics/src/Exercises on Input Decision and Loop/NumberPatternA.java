import java.util.Scanner;

public class NumberPatternA {
    public static void main(String[] args) {
    
        int size = 0;
        int x, y;
        
        
        Scanner in = new Scanner(System.in); 

        System.out.print("Enter the size "); 
        size = in.nextInt();                     

        in.close();

        for (y = 1; y <= size; y++){

            for(x= 1; x <= y; x++ ){

                System.out.print( x + " ");

            }

            x = 1; 
            System.out.println();

        }

    }
}
