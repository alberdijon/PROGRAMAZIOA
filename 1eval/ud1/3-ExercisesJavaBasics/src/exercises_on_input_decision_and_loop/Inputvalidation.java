package exercises_on_input_decision_and_loop;

import java.util.Scanner;

public class Inputvalidation {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);  
        int inNumber;

       // while (isValid == false){


            System.out.print("Enter a positive integer: "); 
            inNumber = in.nextInt();                     
    
           
            
            if( (inNumber >= 0 && inNumber <= 10) || (inNumber >= 90 && inNumber <= 100) ){
                System.out.println("You have entered: " + inNumber);
                //isValid = true;
            }else{
                while(inNumber< 0 || (inNumber >10 && inNumber < 90) || inNumber > 100){
                    System.out.println("Invalid input, try again..." );
                    inNumber = in.nextInt();     
                }
                //isValid = true;
                System.out.println("You have entered: " + inNumber);
            }
       // }

            in.close();

    }
}
