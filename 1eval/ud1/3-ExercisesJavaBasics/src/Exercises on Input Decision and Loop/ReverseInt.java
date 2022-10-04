import java.util.Scanner;

public class ReverseInt {
    public static void main (String[] args) {

        int inNumber;  
        int inDigit;
        int finalnumber = 0; 

        Scanner in = new Scanner(System.in);  
        System.out.print("Enter a positive integer: "); 
        inNumber = in.nextInt();                     

        in.close();

        while(inNumber >0){

            inDigit = inNumber % 10;
            finalnumber += inDigit;
            if (inNumber >10 ){
                finalnumber *= 10;
            }
            
            inNumber /= 10;

        }

        System.out.println("The reverse is: " + finalnumber);

    }
}
