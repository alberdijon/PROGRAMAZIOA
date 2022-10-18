package methods;

import java.util.Scanner;

public class arrayToString {
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

        in.close();

        System.out.println(ArraytoString(items)); 
    }

    public static String ArraytoString(int[] items){
        String list = "[";

        for(int x = 0; x < items.length; x++){
            if(x == items.length-1){
                list += items[x];
            }else{
                    
                list += items[x] +", ";
            }
        }
            
        list +=  ']';
        return list;
    }
}
