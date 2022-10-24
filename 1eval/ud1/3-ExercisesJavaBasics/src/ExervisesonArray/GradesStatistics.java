package ExervisesonArray;

import java.util.Scanner;

public class GradesStatistics {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        final int NUM_ITEMS;
        int[] items; 
        double average;
        double min;
        double max;
        double sum = 0;

        System.out.print("Enter the number of students:"); 
        NUM_ITEMS = in.nextInt();                     

        items = new int[NUM_ITEMS];
  
        if (items.length > 0) {
      
           for (int i = 0; i < items.length; ++i) { 
            System.out.print("Enter the grade for student " + (i+1) + ":");
            items[i] = in.nextInt();                     

           }
        }else{
            System.out.println("You are stupid you can't enter a negative length :( ");

        }

        min = items[0];
        max = items[0];
     
        for(int x = 0; x < items.length; x++){

            sum += items[x];
            if (min > items[x]){
                
                min = items[x];
            }           
            if (max < items[x]){
                
                max = items[x];
            }


        }

        average = sum / items.length;

       System.out.println("The average is: " + average);
       System.out.println("The minimun is: " + min);
       System.out.println("The maximun is: " + max);

    
       

        in.close();
    }
}
