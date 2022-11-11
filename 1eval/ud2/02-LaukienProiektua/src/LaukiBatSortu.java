import java.util.Scanner;

public class LaukiBatSortu {
    public static void main(String[] args) {

        Laukia l1 = new Laukia();
        int zabber;
        int altber;

        Scanner in = new Scanner(System.in);

        System.out.println("Sartu laukiaren zabalera:");
        zabber = in.nextInt();

        System.out.println("Sartu laukiaren altuera:");
        altber = in.nextInt();

        in.close();

        l1.setAltuera(altber);
        l1.setZabalera(zabber);

        System.out.println("Lauki " + l1.getMota() + " sotu duzu: => " + l1.toString());

        System.out.println("Hona marrazkia beteta:");

        for (int y = 0; y < l1.getAltuera(); y++) {
            for (int x = 0; x < l1.getZabalera(); x++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Hona marrazkia hutsik:");

        for (int y = 1; y <= l1.getZabalera(); y++) {
            for (int x = 1; x <= l1.getAltuera(); x++) {
                if ((x == 1) || (y == 1) || (x == l1.getAltuera()) || (y == l1.getZabalera())) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
