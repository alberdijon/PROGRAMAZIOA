import java.util.Scanner;

public class IncomeTaxCalculatorWithSentinel {
    public static void main (String[] args){

        final double TAX_RATE_UNDER_20K = 0.0;
        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;

        int taxableIncome = 0;
        double rest = 0.0;
        double taxPayable = 0.0;

        while(taxableIncome != -1){
            Scanner in = new Scanner(System.in);  
            System.out.println("Enter the taxable income (or -1 to end): $"); 
            taxableIncome = in.nextInt();                     

            in.close();


            if (taxableIncome > 60000){
                rest = taxableIncome - 60000;
                taxPayable += rest * TAX_RATE_ABOVE_60K;
                taxableIncome -= rest;

            }

            if (taxableIncome > 40000){
                rest = taxableIncome - 40000;
                taxPayable += rest * TAX_RATE_ABOVE_40K;
                taxableIncome -= rest;

            }

            if (taxableIncome > 20000){
                rest = taxableIncome - 20000;
                taxPayable += rest * TAX_RATE_ABOVE_20K;
                taxableIncome -= rest;

            }

            if (taxableIncome <= 20000){
                rest = taxableIncome;
                taxPayable += rest * TAX_RATE_UNDER_20K;
                taxableIncome -= rest;
            }

            System.out.printf("The income tax payable is: %.2f", taxPayable);

        }  
    }
}
