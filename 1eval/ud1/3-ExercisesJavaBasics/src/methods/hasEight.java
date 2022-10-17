package methods;

import java.util.Scanner;

public class hasEight {
    public static void main(String[] args) {
        
        int number;
        int sum = 0;

        Scanner in = new Scanner(System.in); 
        do{
            System.out.print("Enter the number: "); 
            number = in.nextInt(); 
            
            if(haseight(number) == true){
                sum += number;
            }


        }while(number != -1);
   

        in.close();

        System.out.println("The magic sum is: " + sum);

    }

    public static boolean haseight(int number){

        boolean eight = false;
        int dig;

        for( int x = 0; x < number; x++){
            dig = number % 10;
            
            if (dig == 8){
                eight = true;
            }

            number /= 10;
        }

        return eight;

    }
}
