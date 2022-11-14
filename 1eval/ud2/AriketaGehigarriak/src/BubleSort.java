import java.util.Scanner;

public class BubleSort {

    public static void main(String[] args) {

        final int NUM_ITEMS = 10;
        int[] num;

        Scanner in = new Scanner(System.in);
        num = new int[NUM_ITEMS];

        if (num.length > 0) {

            for (int i = 0; i < num.length; ++i) {
                System.out.printf("Enter a number (%d):\n", i + 1);
                num[i] = in.nextInt();
            }
        }
        in.close();
        BubleSort(num);
        printArray(num);  
        System.out.println();
    }

    public static void BubleSort(int[] num) {
        int j, i, temp;
        for (j = 0; j < 10; j++) {
            for (i = 0; i < 10 - 1; i++) {
                if (num[i] > num[i + 1]) {
                    temp = num[i + 1];
                    num[i + 1] = num[i];
                    num[i] = temp;
                }
            }
        }
    }
    public static void printArray(int items[]) 
    {
        System.out.printf("The array you have entered is: \n");
        for(int i=0; i<items.length; i++)
        {
            System.out.printf("%d ", items[i]);
        }
        System.out.println();
    }
}