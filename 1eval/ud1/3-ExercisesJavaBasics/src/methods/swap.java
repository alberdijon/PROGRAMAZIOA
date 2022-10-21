package methods;

import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        final int NUM_ITEMS, NUM_ITEMS2;
        int[] items, items2;
        boolean swap = false;

        System.out.print("Enter the length of the first array ");
        NUM_ITEMS = in.nextInt();
        System.out.print("Enter the length of the second array ");
        NUM_ITEMS2 = in.nextInt();

        items = new int[NUM_ITEMS];
        items2 = new int[NUM_ITEMS2];

        System.out.print("Enter the value of all items (separated by space):");

        for (int i = 0; i < items.length; ++i) {

            items[i] = in.nextInt();

        }

        System.out.print("Enter the value of all items for the secon array(separated by space):");

        for (int i = 0; i < items2.length; ++i) {

            items2[i] = in.nextInt();

        }

        in.close();
        System.out.printf("The original arrays are:\n");
        printArray(items);
        printArray(items2);
        if (items.length == items2.length) {
            swap = swap(items, items2);
            if (swap == true) {
                System.out.printf("The arrays swaped correctly and they are:\n");
                printArray(items);
                printArray(items2);
            } else {
                System.out.printf("The arrays not swaped correctly.\n");
            }
        } else {
            System.out.printf("The arrays not swaped correctly.\n");
        }
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

    public static boolean swap(int[] array1, int[] array2) {
        boolean swap = false;
        int item1, item2, temp;
        int array1Copy[], array2Copy[];

        array1Copy = copyof(array1);
        array2Copy = copyof(array2);

        for (int i = 0; i < array1.length; i++) {
            item1 = array1[i];
            item2 = array2[i];

            temp = item1;
            item1 = item2;
            item2 = temp;

            array1[i] = item1;
            array2[i] = item2;
        }

        if (Arrays.equals(array1Copy, array2) && Arrays.equals(array2Copy, array1)) {
            swap = true;
        }

        return swap;
    }
}