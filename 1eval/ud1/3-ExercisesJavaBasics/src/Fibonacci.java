public class Fibonacci {
    public static void main (String[] args) {

        int actual = 1;
        int last = 0;
        int printN = 0;
        double total = 0;
        double average;

        System.out.println("The first 20 Fibonacci numbers are:");

        System.out.print(actual + " ");

        for( int count = 1 ; count < 20; count++){

            printN = last + actual;
            last = actual;
            actual = printN;

            total += actual;

            System.out.print(printN + " ");
        }

        System.out.println();

        average = total / 20;

        System.out.printf("The average is: %.2f", average);


    }
}
