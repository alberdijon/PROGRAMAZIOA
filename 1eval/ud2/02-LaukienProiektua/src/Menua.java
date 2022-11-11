import java.util.Scanner;

public class Menua {
    private static int LAUKI_KOP = 10;
    private static int sortutakoak = 0;
    private static Laukia[] laukiak;
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int aukera = 0;

        while (aukera != 5) {


            System.out.println("LAUKIAK");
            System.out.println("=========================================");
            System.out.println("1.- Lauki berria sortu");
            System.out.println("2.- Laukien taula ikusi");
            System.out.println("3.- Lauki bat marraztu");
            System.out.println("4.- Lauki handiena bilatu");
            System.out.println("5.- Irten");
            System.out.println("Aukeratu zenbaki bat:");
            aukera = in.nextInt();

            switch (aukera) {

                case 1:

                    sortu();
                    break;

                case 2:

                    inprimatu();
                    break;

                case 3:

                    marraztu();
                    break;


                case 4:

                    handiena();
                    break;


                case 5:

                System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                break;

            }

        }

        in.close();

    }

    public static void sortu() {
        laukiak = new Laukia[LAUKI_KOP];
        int zab, alt;


        if (sortutakoak <= 10) {
            System.out.println("LAUKI BERRIA SORTZEN");

            System.out.print("Sartu zabalera: ");
            zab = in.nextInt();
            System.out.println();
            System.out.println("Sartu altuera");
            alt = in.nextInt();
            System.out.println();

            laukiak[sortutakoak] = new Laukia(zab, alt);
            sortutakoak++;

        } else {
            System.out.println("Ezin dituzu lauki gehiago sortu.");
        }
        

    }

    public static void inprimatu() {


        System.out.printf("Laukia\tZabalera\tAltuera\tAzalera\tPermietroa\t\tMota\n");
        System.out.printf("=================================================================================\n");

        for (int x = 0; x < sortutakoak; x++) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%s\n", (x + 1), laukiak[x].getZabalera(), laukiak[x].getAltuera(), laukiak[x].getAzalera(), laukiak[x].getPerimetroa(), laukiak[x].getMota());
        }


    }

    public static void marraztu() {

        String bethuts;
        int pos;

        System.out.println("Zenbatgarren laukia nahi duzu marraztu? ");
        pos = (in.nextInt() - 1);

        System.out.println("Beteta ala hutsik (B/H)?");
        bethuts = in.next();

        if (bethuts.equals("B") || bethuts.equals("b")) {
           
            laukiak[pos].marraztuBeteta(laukiak[pos]);

        } else {
            laukiak[pos].marraztuBeteta(laukiak[pos]);

        }


    }

    public static void handiena(){

        Laukia handiena = new Laukia();

        handiena = Laukia.getTheBiggest(laukiak);

        System.out.println( "Laukirik handiena hay da: " + handiena.toString());

    }

    


}
