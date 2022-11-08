import java.util.Arrays;
import java.util.Scanner;

public class Bikoitza {
    public static void main(String[] args) {

        final int tamaina = 5;
        int[] lehena, bigarrena;

        Scanner in = new Scanner(System.in);

        lehena = new int[tamaina];
        bigarrena = new int[tamaina];

        System.out.print("Sartu itzazu " + tamaina + " zenbaki espazioz bananduta");

        for (int i = 0; i < lehena.length; ++i) {

            lehena[i] = in.nextInt();

        }
        in.close();

        for (int i = 0; i < lehena.length; ++i) {

            bigarrena[i] = lehena[i] * 2;

        }

        System.out.println(Arrays.toString(lehena));
        System.out.println(Arrays.toString(bigarrena));

    }
}
