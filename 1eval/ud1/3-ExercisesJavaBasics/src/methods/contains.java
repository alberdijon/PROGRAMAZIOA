package methods;

import java.util.Scanner;

public class contains {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int NUM_ITEMS;
        int[] items;
        int numb;

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

        System.out.print("Enter the value:");
        numb = in.nextInt();

        in.close();


        if(Contains (items, numb) == true){

            System.out.println("The array contains the number" + numb);

        }else{

            System.out.println("The array does not contain the number" + numb);

        }
        
        
        
    }

    public static boolean Contains (int[] items, int numb){

       boolean cont = false;

       for(int x = 0; x < items.length; x++){
        if(items[x] == numb){
            cont = true;
        }

       }

       return cont;


    }
}
