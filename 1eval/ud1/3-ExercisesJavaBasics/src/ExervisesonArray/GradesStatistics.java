package ExervisesonArray;

import java.util.Scanner;

public class GradesStatistics {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        final int NUM_ITEMS;
        int[] items; 
        
  
   

        System.out.print("Enter the number of students:"); 
        NUM_ITEMS = in.nextInt();                     



        items = new int[NUM_ITEMS];
  
        if (items.length > 0) {

            
           
           for (int i = 0; i < items.length; ++i) { 
            System.out.print("Enter the grade for student " + i + ":");
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
