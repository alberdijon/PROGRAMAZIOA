import java.util.Scanner;

public class LaukiAskoSortu {
    public static void main(String[] args) {

        Laukia[] laukiak;
        int zenbat, zab, alt;

        Scanner in = new Scanner(System.in);

        System.out.print("Zenbat lauki sortu nahi dituzu");
        zenbat = in.nextInt();

        System.out.println();

        laukiak = new Laukia[zenbat];

        for (int x = 0; x < laukiak.length; x++) {

            System.out.println((x + 1) + ". LAUKIAREN DATUAK:");

            System.out.print("Zabalera: ");
            zab = in.nextInt();
            System.out.println();
            System.out.println("Altuera");
            alt = in.nextInt();
            System.out.println();

            laukiak[x] = new Laukia(zab, alt);

        }

        System.out.printf("Laukia\tZabalera\tAltuera\tAzalera\tPermietroa\t\tMota\n");
        System.out.printf("================================================================\n");

        for (int x = 0; x < laukiak.length; x++) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%s\n", (x + 1), laukiak[x].getZabalera(),
                    laukiak[x].getAltuera(), laukiak[x].getAzalera(), laukiak[x].getPerimetroa(), laukiak[x].getMota());
        }

        in.close();

    }
}
