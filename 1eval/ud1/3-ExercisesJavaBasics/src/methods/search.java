package methods;

import java.util.Scanner;

public class search {
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

        System.out.println("the index is" + Search(items, numb));

    }

    public static int Search(int[] items, int numb) {

        boolean cont = false;
        int x;

        for ( x = 0; x < items.length; x++) {
            if (items[x] == numb) {

                cont = true;
            }

        }

        if (cont) {

            return items[x];

        } else {

            return -1;

        }

    }

}
