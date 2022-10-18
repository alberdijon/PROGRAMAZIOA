package exercises_on_input_decision_and_loop;

import java.util.Scanner;

public class SalexTaxCalculator {
    public static void main(String[] args) {
        final int SENTINEL = -1;
        final double TAX = 0.07;
        double price, salesTax, actualPrice, totalPrice = 0.0, totalActualPrice = 0.0, totalSalesTax = 0.0;
        
        Scanner in = new Scanner(System.in);  
        do
        {
            System.out.print("Enter the tax-inclusive price in dollars (or -1 to end):");  
            price = in.nextInt();
            if (price != SENTINEL)
            {
                
                actualPrice = price / (1+TAX);
                salesTax = price - actualPrice;
                System.out.printf("Actual price is: %.2f and the Sales tax is: %.2f.\n", actualPrice, salesTax);
                
                totalPrice = totalPrice + price;
                totalActualPrice = totalActualPrice + actualPrice;
                totalSalesTax = totalSalesTax + salesTax;
            }    
        }while(price!= SENTINEL);
        in.close(); 
        System.out.printf("Total price is: %.2f.\n", totalPrice);
        System.out.printf("Total actual price is: %.2f.\n", totalActualPrice);
        System.out.printf("Total sales tax is: %.2f.\n", totalSalesTax);
    }
}
