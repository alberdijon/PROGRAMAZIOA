package exekutagarriak;

import java.util.ArrayList;
import java.util.Scanner;

import model.Bezeroak;
import model.Erosketa;
import model.Produktuak;

public class ErosketenKudeaketa {
    
    private ArrayList<Bezeroak> kontaktuak;
    private ArrayList<Produktuak> produktuKatalogoa;
    private ArrayList<Erosketa> erosketenZerrenda;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aukeraN;

        initialize();
        aukeraN = menunagusiaErakutsi();

        switch (aukeraN) {
            case 1:
              System.out.println("1: Create (Datuak gehitu)");
              create();
              break;
            case 2:
              System.out.println("2: Read (Ikusi)");
              break;
            case 3:
              System.out.println("3: Update (Aldatu)");
              break;
            case 4:
              System.out.println("4: Delete (Ezabatu)");
              break;
            case 20:
              System.out.println("20: Irten");
              break;
          }
  

          in.close();
    }

    public static void initialize(){

    }

    public static int menunagusiaErakutsi(){

        Scanner in = new Scanner(System.in);
        
        System.out.println("*****************************************");
        System.out.println("  EROSKETEN KUDEAKETA");
        System.out.println("  ---------------------------------------");
        System.out.println("  1.  Create (Datuak gehitu)");
        System.out.println("  2.  Read (Ikusi)");
        System.out.println("  3.  Update (Aldatu)");
        System.out.println("  4.  Delete (Ezabatu)");
        System.out.println("  20. Irten");
        System.out.println("  ---------------------------------------");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();   
        
        return choice;

    }

    public static void create(){

    }

    public static void read(){

       int aukera =  readMenuaErakutsi();

    }

    public static void update(){
        
    }

    public static void delete(){
        
    }

    public static int readMenuaErakutsi(){

        Scanner in = new Scanner(System.in);
        
        System.out.println("*********************************************");
        System.out.println("*  READ MENUA");
        System.out.println("*  ---------------------------------------");
        System.out.println("*  1.  Erosketen zerrenda");
        System.out.println("*  2.  Fakturazio osoa");
        System.out.println("*  3.  Bezerorik onena");
        System.out.println("*  4.  Helbidea bilatu");
        System.out.println("*  5.  Epekako erosketen txostena");
        System.out.println("*  20. Menu nagusira itzuli");
        System.out.println("*  ---------------------------------------");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();


    }

    
}
