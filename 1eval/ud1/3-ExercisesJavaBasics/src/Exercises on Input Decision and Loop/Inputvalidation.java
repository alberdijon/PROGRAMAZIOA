import java.util.Scanner;

public class Inputvalidation {
    public static void main (String[] args) {

        int inNumber;
        boolean isValid = false;   

        while (isValid == false){

            Scanner in = new Scanner(System.in);  
            System.out.print("Enter a positive integer: "); 
            inNumber = in.nextInt();                     
    
            in.close();
            
            if( (inNumber >= 0 && inNumber <= 10) || (inNumber >= 90 && inNumber <= 100) ){
                System.out.println("You have entered: " + inNumber);
                isValid = true;
            }else{
                System.out.println("Invalid input, try again..." );
            }
        }

    }
}
