package methods;

import java.util.Scanner;

public class equals {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        final int NUM_ITEMS;
        final int NUM_ITEMS2;
        int[] items;
        int[] items2;


        System.out.print("Enter the length of the first array ");
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


        System.out.print("Enter the length of the first array ");
        NUM_ITEMS2 = in.nextInt();

        items2 = new int[NUM_ITEMS2];

        if (items.length > 0) {

            System.out.print("Enter the value of all items (separated by space):");

            for (int i = 0; i < items2.length; ++i) {

                items2[i] = in.nextInt();

            }
        } else {
            System.out.println("Enter a positive length ");

        }



        in.close();

        if(Equals(items, items2)){
            System.out.println("The strings are equals");
        }else{
            System.out.println("The strings are diferent");
        }



    }

    public static boolean Equals(int[] items, int[] items2) {

        boolean eq = false;
        

        if(items.length != items2.length){

            return eq;


        }else{
            for (int x = 0; x < items.length; x++) {
                if (items[x] == items2[x]) {
                    if(x == items.length -1 ){
                        eq = true;
                    }  
                }
    
            }
            return eq;
        }
    }

}
