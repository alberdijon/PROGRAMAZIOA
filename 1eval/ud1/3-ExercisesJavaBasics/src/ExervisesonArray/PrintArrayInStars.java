package ExervisesonArray;

import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        final int NUM_ITEMS;
        int[] items; 
        
  
   

        System.out.print("Enter the length of the arrays "); 
        NUM_ITEMS = in.nextInt();                     



        items = new int[NUM_ITEMS];
  
        if (items.length > 0) {

            System.out.print("Enter the value of all items (separated by space):");
           
           for (int i = 0; i < items.length; ++i) { 

            items[i] = in.nextInt();                     

           }
        }else{
            System.out.println("You are stupid you can't enter a negative length :( ");

        }
  
        
        for (int i = 0; i < items.length; ++i) {

              System.out.print(i +1);
              for(int x = 0; x < items[i]; x++){
              System.out.print("*");
              }
              System.out.print("(" + items[i] + ")");
              System.out.println();

              
        }



            
        in.close();
    }

}
