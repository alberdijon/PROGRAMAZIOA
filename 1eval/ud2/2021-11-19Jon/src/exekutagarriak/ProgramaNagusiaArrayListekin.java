package exekutagarriak;

import java.util.ArrayList;
import model.Liburua;
import java.util.Scanner;

public class ProgramaNagusiaArrayListekin {

    private static ArrayList<Liburua> liburuak;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        liburuak = Liburua.getLiburuSortaArrayListFormatuan();

        int aukera = 0;
        do {
            System.out.println();
            System.out.println("LIBURUTEGIA");
            System.out.println("====================================");
            System.out.println("-1.- Liburua gehitu");
            System.out.println("0.- Liburua ezabatu");
            System.out.println("1.- Liburuen zerrenda sinplea ikusi");
            System.out.println("2.- Liburuen datu guztiak ikusi");
            System.out.println("3.- Liburuen zerrenda prezioaren grafikoarekin");
            System.out.println("4.- Liburu zaharrena bilatu");
            System.out.println("5.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = sc.nextInt(); 
            System.out.println("");
            switch (aukera) {
                case -1:
                    liburuaGehitu();
                    break;
                case 0:
                    liburuaEzabatu();
                    break;
                case 1:
                    liburuakIkusi();
                    break;
                case 2:
                    liburuenDatuGuztiakIkusi();
                    break;
                case 3:
                    liburuenPrezioaIrudikatu();
                    break;
                case 4:
                    zaharrenaBilatu();
                    break;
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzearren.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 5);
    }

    /**
     * Liburuen zerrenda sinplea inprimatzen du kontsolan metodo honek, liburuen
     * toString() metodoaz baliatuz.
     */
    public static void liburuakIkusi() { //ALDATUTAKO METODOA
        int i = 0;
        System.out.println("LIBURUEN ZERRENDA");
        System.out.println("==============================");
        while (i < liburuak.size()) {
            if (liburuak.get(i) != null) {
                System.out.println(liburuak.get(i).toString());
            }
            i++;
        }
    }

    public static void liburuenDatuGuztiakIkusi() { //ALDATUTAKO METODOA
        int orriKop = 0, kont = 0;

        System.out.printf("%-3s %-30s %-20s %4s %4s %-11s %1s %-6s %-15s\n", "Z.", "Izenburua", "Egilea", "O.", "U.", "G.", "H.", "P.", "K.");
        for (int i = 0; i < liburuak.size(); i++) {

            if (liburuak.get(i) != null) {
                System.out.printf("%-3s %-30s %-20s %4s %4s %-11s %1s %-6s %-15s\n", i + 1, liburuak.get(i).getIzenburua(), liburuak.get(i).getEgilea(), liburuak.get(i).getOrriKopurua(), liburuak.get(i).getUrtea(), liburuak.get(i).getGaia(), liburuak.get(i).getHizkuntza(), liburuak.get(i).getPrezioa(), liburuak.get(i).getKodea());
                orriKop = orriKop + liburuak.get(i).getOrriKopurua();
                kont++;
            }
        }
        System.out.println();
        System.out.printf("Liburuen batez besteko orri kopurua: %.2f", (double)orriKop / kont);
        System.out.println();
    }

    public static void liburuenPrezioaIrudikatu() { //ALDATUTAKO METODOA
        
        for (int i = 0; i < liburuak.size(); i++) {

            if (liburuak.get(i) != null) { 
                System.out.printf("%35s: %s\n",liburuak.get(i).getIzenburua(), liburuak.get(i).getPrezioaIzartxotan());    
            }
        }
    }

    public static void zaharrenaBilatu() { //ALDATUTAKO METODOA
        int max = liburuak.get(0).getUrtea(), i, pos = 0;
        
        for ( i = 0; i < liburuak.size(); i++) {
            if (liburuak.get(i) != null) { 
                if(liburuak.get(i).getUrtea() < max){
                    max = liburuak.get(i).getUrtea();
                    pos = i;
                }    
            }
        }
        System.out.printf("Liburu zaharrena %d urtean argitaratu zen: %s", max, liburuak.get(pos).toString());
    }
    
    public static void liburuaGehitu() { 
        Scanner sc = new Scanner(System.in);
        String izenburua, egilea, generoa;
        int urtea, orriKop;
        char hizk;
        double prezioa;
       
        System.out.printf("Sartu liburuaren izenburua:\n");
        izenburua = sc.nextLine();
        
        System.out.printf("Sartu liburuaren egilearen izen abizenak:\n");
        egilea = sc.nextLine();
        
        System.out.printf("Sartu liburuaren generoa:\n");
        generoa = sc.nextLine();
        
        System.out.printf("Sartu liburuaren hizkuntza:\n");
        hizk = sc.nextLine().charAt(0);
        
        System.out.printf("Sartu liburuaren orri kopurua:\n");
        orriKop = sc.nextInt();
        
        System.out.printf("Sartu liburua argitaratu zen urtea:\n");
        urtea = sc.nextInt();
        
        System.out.printf("Sartu liburuaren prezioa:\n");
        prezioa = sc.nextDouble();
         
        liburuak.add(new Liburua(izenburua, egilea, orriKop, urtea, generoa, hizk, prezioa));
    }
    
    public static void liburuaEzabatu() { 
        Scanner sc = new Scanner(System.in);
        int pos;
        
        System.out.printf("Sartu ezabatu nahi duzun liburuaren posizioa:\n");
        pos = sc.nextInt();
        liburuak.remove(pos);
    }
}