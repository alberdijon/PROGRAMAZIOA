package methods;

import java.util.Scanner;

public class isOdd {
    public static void main(String[] args) {

        int number;

        Scanner in = new Scanner(System.in);
        do {
            

            System.out.print("Enter the number: ");
            number = in.nextInt();

            

            if (visodd(number) == true) {

                System.out.println(number + " is an odd number ");

            } else {

                System.out.println(number + " is an even number ");

            }

            System.out.println(number + " is an " + isodd(number) + " number ");

        } while (number >= 0);

        in.close();
    }

    public static String isodd(int number) {

        String tipe;

        if (number % 2 == 0) {
            tipe = "even";
        } else {
            tipe = "odd";
        }

        return tipe;
    }

    public static boolean visodd(int number) {

        boolean odd = false;

        if (number % 2 == 0) {
            odd = false;
        } else {
            odd = true;
        }

        return odd;

    }

}
