import java.util.Scanner;

//116 ariketa

public class HolaMundo {
    public static void main(String[] args) {

        int times;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of times you want to print ");
        times = in.nextInt();
        in.close();

        for (int x = 0; x < times; x++) {

            System.out.println("Hola mundo");

        }

    }
}
