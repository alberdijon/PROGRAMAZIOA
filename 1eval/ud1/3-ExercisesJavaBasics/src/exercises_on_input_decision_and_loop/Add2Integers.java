package exercises_on_input_decision_and_loop;
import java.util.Scanner;

public class Add2Integers {
    public static void main (String[] args) {

        int number1;
        int number2;
        int sum;

        Scanner in = new Scanner(System.in);  
        System.out.print("Enter first integer: "); 
        number1 = in.nextInt();                     

        System.out.print("Enter second integer: "); 
        number2 = in.nextInt();   

        in.close();

        sum = number1 + number2;

        System.out.println("The sum is: " + sum);

    }
}
