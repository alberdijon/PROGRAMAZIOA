package methods;

import java.util.Scanner;

public class GradesHistogram {

    public static int[] grades;

    public static void main(String[] args) {

        readGrades();
        printvert();
    }

    public static void readGrades() {

        int number;
        Scanner in = new Scanner(System.in);

        do {

            System.out.print("Enter the number of students: ");
            number = in.nextInt();

        } while ((number > 100) && (number < 0));

        grades = new int[number];

        for (int x = 1; x <= grades.length; x++) {

            System.out.print("Enter the grade for student " + x + ": ");
            grades[x - 1] = in.nextInt();
        }

        in.close();

    }

    public static void printvert() {

        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, cont7 = 0, cont8 = 0, cont9 = 0,
                cont10 = 0;

        for (int x = 0; x < grades.length; x++) {

            if (grades[x] > 0 && grades[x] < 10) {

                cont1++;

            } else if (grades[x] > 10 && grades[x] < 20) {

                cont2++;

            } else if (grades[x] > 20 && grades[x] < 30) {

                cont3++;

            } else if (grades[x] > 30 && grades[x] < 40) {

                cont4++;

            } else if (grades[x] > 40 && grades[x] < 50) {

                cont5++;

            } else if (grades[x] > 50 && grades[x] < 60) {

                cont6++;

            } else if (grades[x] > 60 && grades[x] < 70) {

                cont7++;

            } else if (grades[x] > 70 && grades[x] < 80) {

                cont8++;

            } else if (grades[x] > 80 && grades[x] < 90) {

                cont9++;

            } else if (grades[x] > 90 && grades[x] < 100) {

                cont10++;

            }

        }

        System.out.print("  0 - 9: ");
        for (int x = 0; x < cont1; x++) {
            System.out.print("*");
        }

        System.out.println();

        System.out.print("10 - 19: ");
        for (int x = 0; x < cont2; x++) {
            System.out.print("*");
        }

        System.out.println();

        System.out.print("20 - 29: ");
        for (int x = 0; x < cont3; x++) {
            System.out.print("*");
        }

        System.out.println();
        System.out.print("30 - 39: ");
        for (int x = 0; x < cont4; x++) {
            System.out.print("*");
        }

        System.out.println();
        System.out.print("40 - 49: ");
        for (int x = 0; x < cont5; x++) {
            System.out.print("*");
        }

        System.out.println();
        System.out.print("50 - 59: ");
        for (int x = 0; x < cont6; x++) {
            System.out.print("*");
        }

        System.out.println();
        System.out.print("60 - 69: ");
        for (int x = 0; x < cont7; x++) {
            System.out.print("*");
        }

        System.out.println();
        System.out.print("70 - 79: ");
        for (int x = 0; x < cont8; x++) {
            System.out.print("*");
        }

        System.out.println();
        System.out.print("80 - 89: ");
        for (int x = 0; x < cont9; x++) {
            System.out.print("*");
        }

        System.out.println();
        System.out.print("90 - 100: ");
        for (int x = 0; x < cont10; x++) {
            System.out.print("*");
        }

        System.out.println();
    }

}
