package exercises_on_input_decision_and_loop;

import java.util.Scanner;

public class CilynderComputation {
    public static void main(String[] args) throws Exception {

        double radius, S_Area, height, B_Area, volume;
        final double PI = 3.14159265;

        Scanner in = new Scanner(System.in); 

        System.out.print("Enter the size "); 
        radius = in.nextInt();           
        
        System.out.print("Enter the size "); 
        height = in.nextInt();    

        in.close();

        B_Area = radius * radius * PI;
        volume = B_Area * height; 
        S_Area = 2 * PI * radius  + 2.0 * B_Area;

        System.out.printf("The area is: %.2f", S_Area);
        System.out.println();
        System.out.printf("The perimeter is: %.2f", B_Area);
        System.out.println();
        System.out.printf("The volume is: %.2f", volume);

    }
}
