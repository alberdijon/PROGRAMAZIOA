package exercises_on_input_decision_and_loop;

import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args) throws Exception {

        double radius, S_Area, volume;
        final double PI = 3.14159265;

        Scanner in = new Scanner(System.in); 

        System.out.print("Enter the size "); 
        radius = in.nextInt();             

        in.close();

        volume = 4 /3 * Math.PI * radius * radius * radius;
        S_Area = 4 * PI * radius * radius;

        System.out.printf("The area is: %.2f", S_Area);
        System.out.println();
        System.out.printf("The volume is: %.2f", volume);

    }
}
