package exercises_on_input_decision_and_loop;

import java.util.Scanner;

public class HillPatternD {
 public static void main(String[] args) {
        int row, col, size;

        System.out.printf("Enter a number:");
        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        in.close();

        for (row = 1; row <= size; row++) {
            for (col = row; col <= size; col++) {
                System.out.print("# ");
            }
            for (col= 1; col <= (2 * row - 2); col++) {
                System.out.print("  ");
            }
            for (col = row; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.print("\n");
        }

        for (row = 1; row <= size; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print("# ");
            }
            for (col = (2 * row - 2); col < (2 * size - 2);col++) {
                System.out.print("  ");
            }
            for (col = 1; col <= row; col++) {
                System.out.print("# ");
            }
            System.out.print("\n");
        }
    }
}
