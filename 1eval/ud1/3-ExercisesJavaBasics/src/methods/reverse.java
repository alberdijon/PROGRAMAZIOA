package methods;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {

        final int NUM_ITEMS;
        int array[];
        
        System.out.printf("Enter the length:\n");
        Scanner in = new Scanner(System.in);
        NUM_ITEMS = in.nextInt();

        array = new int[NUM_ITEMS];
        
        if (array.length > 0) {
      
            for (int i = 0; i < array.length; ++i) 
            {
                System.out.printf("Enter a number (%d):\n", i+1);
                array[i] = in.nextInt();
            }
            
        }
        in.close();
        reverse(array);
        System.out.printf("The reversed array is:\n");
        printArray(array); 
    }
    public static void printArray(int items[]) 
    {
        for(int i=0; i<items.length; i++)
        {
            System.out.printf("%d ", items[i]);
        }
        System.out.println();
    }
    public static void reverse(int[] array)
    {
        int item1, item2, temp;
        for (int fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; ++fIdx, --bIdx) {
            item1 = array[fIdx];
            item2 = array[bIdx];
            
            temp = item1;
            item1 = item2;
            item2 = temp;
            
            array[fIdx] = item1;
            array[bIdx] = item2;
        }
    }
}