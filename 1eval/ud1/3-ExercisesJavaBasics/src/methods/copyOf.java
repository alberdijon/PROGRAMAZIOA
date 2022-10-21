package methods;

import java.util.Scanner;

public class copyOf {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        final int NUM_ITEMS;
        int[] items, itemscopy;



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

        in.close();
        itemscopy = copyof(items);
        printArray(itemscopy);
    }

    public static int[] copyof(int[] array) {
        
        int arrayCopy[];
    
        arrayCopy = new int[array.length];
        for (int j = 0; j < array.length; j++) {
            arrayCopy[j] = array[j];
        }
        return arrayCopy;
    }

    public static void printArray(int items[]) {
        System.out.printf("The array you have entered is: \n");
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%d ", items[i]);
        }
        System.out.println();
    }
}
