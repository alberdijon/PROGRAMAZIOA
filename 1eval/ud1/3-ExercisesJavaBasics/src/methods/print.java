package methods;

import java.util.Scanner;

public class print {
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
        } else {
            System.out.println("Enter a positive length ");

        }

        Print (items);
        
        in.close();
    }

    public static void Print (int[] items){

        System.out.print("[");
        for(int x = 0; x < items.length; x++){
            if (x == items.length - 1){

                System.out.print(items[x]);
                
            }else{
                System.out.print(items[x] + ", ");

            }
        }
        System.out.print("]");

    }
}
