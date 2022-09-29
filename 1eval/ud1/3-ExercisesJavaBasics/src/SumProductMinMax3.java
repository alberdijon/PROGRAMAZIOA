import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main (String[] args) {

        int number1, number2, number3;
        int sum, product, max, min;


        Scanner in = new Scanner(System.in);  
        System.out.print("Enter first integer: "); 
        number1 = in.nextInt();                     

        System.out.print("Enter second integer: "); 
        number2 = in.nextInt();  
        
        System.out.print("Enter third integer: "); 
        number3 = in.nextInt();  

        in.close();

        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;

        min = number1;

        if (min > number2){

            min = number2;

        }

        if (min > number3){

            min = number3;

        }

        max = number1;

        if (max < number2){

            max = number2;

        }

        
        if (max < number3){

            max = number3;

        }

        System.out.println("The sum is: " + sum);
        System.out.println("The product  is: " + product);
        System.out.println("The max  is: " + max);
        System.out.println("The min is: " + min);


    }
}
