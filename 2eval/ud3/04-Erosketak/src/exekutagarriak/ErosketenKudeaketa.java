package exekutagarriak;

import java.util.ArrayList;
import java.util.Scanner;

import model.Bezeroak;
import model.Enpresa;
import model.EpekakoErosketa;
import model.Erosketa;
import model.Pertsona;
import model.Produktuak;

public class ErosketenKudeaketa {
    
    private static ArrayList<Bezeroak> kontaktuak;
    private static ArrayList<Produktuak> produktuKatalogoa;
    private static ArrayList<Erosketa> erosketenZerrenda;


    public static void main(String[] args) {
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
              read();
              break;
            case 3:
              System.out.println("3: Update (Aldatu)");
              update();
              break;
            case 4:
              System.out.println("4: Delete (Ezabatu)");
              delete();
              break;
            case 20:
              System.out.println("20: Irten");
              break;
          }
  

    }

    public static void initialize(){
      kontaktuak = new ArrayList<>();

      kontaktuak.add(new Pertsona(1, "Karlos", "Argiñano", "Hondartza Pasialekua z/g ZARAUTZ", "kargi@zarautz.eus"));

      kontaktuak.add(new Pertsona(2, "Martin", "Berasategi", "Mirakontxa z/g. DONOSTIA", "mbera@donostia.eus"));



      produktuKatalogoa = new ArrayList<>();

      produktuKatalogoa.add(new Produktuak("C01", "Toshiba Satellite Pro", 450));

      produktuKatalogoa.add(new Produktuak("C02", "HP Pavilion", 600));

      produktuKatalogoa.add(new Produktuak("T01", "Samsung Galaxy", 210));

      produktuKatalogoa.add(new Produktuak("T02", "iPhone XX", 1300));



      erosketenZerrenda = new ArrayList<>();



      /*********** EROSKETA *************/

      ArrayList<Produktuak> lehenErosketaProduktuak = new ArrayList<>();

      lehenErosketaProduktuak.add(produktuKatalogoa.get(0));

      lehenErosketaProduktuak.add(produktuKatalogoa.get(1));

      lehenErosketaProduktuak.add(produktuKatalogoa.get(2));

      ArrayList<Integer> lehenErosketaUnitateak = new ArrayList<>();

      lehenErosketaUnitateak.add(4);

      lehenErosketaUnitateak.add(2);

      lehenErosketaUnitateak.add(3);

      erosketenZerrenda.add(new Erosketa("E18-01", "2018-09-25", kontaktuak.get(1), lehenErosketaProduktuak,

      lehenErosketaUnitateak, 3630));



      /*********** EROSKETA *************/

      ArrayList<Produktuak> bigarrenErosketaProduktuak = new ArrayList<>();

      bigarrenErosketaProduktuak.add(produktuKatalogoa.get(0));

      ArrayList<Integer> bigarrenErosketaUnitateak = new ArrayList<>();

      bigarrenErosketaUnitateak.add(15);

      erosketenZerrenda.add(new Erosketa("E18-02", "2018-10-24", kontaktuak.get(0),

      bigarrenErosketaProduktuak, bigarrenErosketaUnitateak, 6750));



      /*********** EROSKETA *************/

      ArrayList<Produktuak> hirugarrenErosketaProduktuak = new ArrayList<>();

      hirugarrenErosketaProduktuak.add(produktuKatalogoa.get(0));

      hirugarrenErosketaProduktuak.add(produktuKatalogoa.get(3));

      ArrayList<Integer> hirugarrenErosketaUnitateak = new ArrayList<>();

      hirugarrenErosketaUnitateak.add(1);

      hirugarrenErosketaUnitateak.add(1);

      erosketenZerrenda.add(new Erosketa("E19-01", "2019-01-09", kontaktuak.get(0),

      hirugarrenErosketaProduktuak, hirugarrenErosketaUnitateak, 660));



      /*********** EROSKETA: 4 *************/

      ArrayList<Produktuak> laugarrenErosketaProduktuak = new ArrayList<>();

      laugarrenErosketaProduktuak.add(produktuKatalogoa.get(0));

      laugarrenErosketaProduktuak.add(produktuKatalogoa.get(1));

      laugarrenErosketaProduktuak.add(produktuKatalogoa.get(3));

      ArrayList<Integer> laugarrenErosketaUnitateak = new ArrayList<>();

      laugarrenErosketaUnitateak.add(3);

      laugarrenErosketaUnitateak.add(1);

      laugarrenErosketaUnitateak.add(1);

      erosketenZerrenda.add(new EpekakoErosketa("E19-02", "2019-02-09",

      kontaktuak.get(1), laugarrenErosketaProduktuak, laugarrenErosketaUnitateak, 3250, 300));



      /*********** EROSKETA: 5 *************/



      erosketenZerrenda.add(new Erosketa("E21-01", "2021-01-17",

      kontaktuak.get(3), null, null, 15000));



      /*********** EROSKETA 6 *************/

      erosketenZerrenda.add(new Erosketa("E22-01", "2022-01-18",

      kontaktuak.get(3), null, null, 6600));



      /*********** EROSKETA 7 *************/

      erosketenZerrenda.add(new EpekakoErosketa("E22-02", "2022-02-20",

      kontaktuak.get(1), null, null, 135000,8000));




      /*********** EROSKETA 8 *************/

      erosketenZerrenda.add(new Erosketa("E22-03", "2022-02-21",

      kontaktuak.get(3), null, null, 7550));



      /*********** EROSKETA 9 *************/

      erosketenZerrenda.add(new EpekakoErosketa("E22-04", "2022-02-27",

      kontaktuak.get(1), null, null, 32500,3000));

      /*********** EROSKETA 10 *************/

      erosketenZerrenda.add(new Erosketa("E23-01", "2023-01-02",

      kontaktuak.get(3), null, null, 2560));



      /*********** EROSKETA 11 *************/

      erosketenZerrenda.add(new Erosketa("E23-02", "2023-02-02",

      kontaktuak.get(1), null, null, 1300));

      /*********** EROSKETA 12 *************/

      erosketenZerrenda.add(new Erosketa("E23-03", "2023-02-02",

      kontaktuak.get(2), null, null, 1050));

      /*********** EROSKETA 13 *************/

      erosketenZerrenda.add(new EpekakoErosketa("E23-04", "2023-02-12",

      kontaktuak.get(3), null, null, 33800,3000));



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

      Scanner in = new Scanner(System.in);
      Bezeroak bez;

      System.out.println("Erosketa berria");
      System.out.println("===========================");
      System.out.print("Sartu erosketa kodea: ");
      String erosKod = in.nextLine();
      System.out.print("Sartu bezero kodea: ");
      int bezKod = in.nextInt();
      System.out.print("Guztira ordaindu beharrekoa: ");
      int guztira = in.nextInt();
      System.out.print("Epekako erosketa da? (B/E)");
      String epekaS = in.next();
      boolean epeka = epekaS.equalsIgnoreCase("B");

      for(int x = 0; x < kontaktuak.size(); x++){

        if(bezKod == kontaktuak.get(x).getKodea()){

          bez = kontaktuak.get(x);

          if(epeka){

            erosketenZerrenda.add(new Erosketa(erosKod, bez, guztira));

          }else{

          erosketenZerrenda.add(new EpekakoErosketa(erosKod, bez, guztira));

          }

        }else{

          System.out.println("Erosketa ez da aurkitu");

        }

      }

    

            
    }

    public static void read(){

       int aukera =  readMenuaErakutsi();

       switch (aukera) {
        case 1:
          System.out.println("1.  Erosketen zerrenda");
          erosketenZerrenda();
          break;
        case 2:
          System.out.println("2.  Fakturazio osoa");
          double guztira = fakturazioOsoa();

          System.out.println(guztira);
          break;
        case 3:
          System.out.println("3.  Bezerorik onena");
          Bezeroak onena = bezerorikOnena();

          System.out.println("Bezerorik onena: " + onena);
          break;
        case 4:
          System.out.println("4.  Helbidea bilatu");
          helbideaBilatu();
          break;
        case 20:
          System.out.println("20: Irten");
          break;
      }


    }

    public static void update(){

      Scanner in = new Scanner(System.in);

      System.out.print("Sartu kodea: ");
      String ko = in.next();
      char[] kod = ko.toCharArray();
      char[] kod2 = ko.toCharArray();
      boolean found = false;
      Bezeroak bez;

      for (int x = 0; x < erosketenZerrenda.size(); x++) {
        if (erosketenZerrenda.get(x).getKodea() == kod) {
          System.out.println("Erosketa aurkitu da.");
          System.out.println(erosketenZerrenda.get(x));

          System.out.print("Sartu erosketa kode berria: ");
          String erosKod = in.nextLine();
          kod2 = erosKod.toCharArray();
          System.out.print("Sartu bezero kode berria: ");
          int bezKod = in.nextInt();
          System.out.print("Guztira ordaindu beharreko berria: ");
          int guztira = in.nextInt();

          erosketenZerrenda.get(x).setKodea(kod2);

          for(int y = 0; y < kontaktuak.size(); y++){

            if(bezKod == kontaktuak.get(y).getKodea()){
    
              bez = kontaktuak.get(y);
              erosketenZerrenda.get(x).setBezeroa(bez);

            }else{
    
              System.out.println("Erosketa ez da aurkitu");
    
            }
    
          }

          erosketenZerrenda.get(x).setGuztira(guztira);

          found = true;
          break;

        }
      }

      if (!found) {
        System.out.println("Erosketa ez da aurkitu.");
      }
        
    }

    public static void delete(){

      Scanner in = new Scanner(System.in);

      System.out.print("Sartu kodea: ");
      String ko = in.next();
      char[] kod = ko.toCharArray();
  
      boolean found = false;
      for (Erosketa erosketa : erosketenZerrenda) {
        if (erosketa.getKodea().equals(kod)) {
          erosketenZerrenda.remove(erosketa);
          System.out.println("Erosketa ezabatu da.");
          break;
        }
      }
    }

    public static int readMenuaErakutsi(){

        Scanner in = new Scanner(System.in);
        
        System.out.println("*****************************************");
        System.out.println("  READ MENUA");
        System.out.println("  ---------------------------------------");
        System.out.println("  1.  Erosketen zerrenda");
        System.out.println("  2.  Fakturazio osoa");
        System.out.println("  3.  Bezerorik onena");
        System.out.println("  4.  Helbidea bilatu");
        System.out.println("  20. Menu nagusira itzuli");
        System.out.println("---------------------------------------");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

      return choice;

    }

  public static void erosketenZerrenda(){

    System.out.println("Erosketen zerrenda:");
    for (int x = 0; x < erosketenZerrenda.size(); x++) {
      System.out.println(erosketenZerrenda.get(x));
    }

  }

  public static int fakturazioOsoa() {
    int fakturazioOsoa = 0;
    for (int i = 0; i < erosketenZerrenda.size(); i++) {
      fakturazioOsoa += erosketenZerrenda.get(i).getGuztira();
    }
    return fakturazioOsoa;
  }

  public static Bezeroak bezerorikOnena(){
    Bezeroak onena = erosketenZerrenda.get(0).getBezeroa();
    Erosketa oberena = erosketenZerrenda.get(0);
    for (int x = 0; x < erosketenZerrenda.size(); x++) {
        if(erosketenZerrenda.get(x) != null){
            if(erosketenZerrenda.get(x).getGuztira() > oberena.getGuztira()){
                oberena = erosketenZerrenda.get(x);
                onena = erosketenZerrenda.get(x).getBezeroa();
            }
        }
    }

    return onena;

}

public static void helbideaBilatu(){
  
  String abizena;

  Scanner in = new Scanner(System.in);
  System.out.print("Esan pertsonaren abizena: ");
  abizena = in.nextLine();

  for (int x = 0; x < erosketenZerrenda.size(); x++) {
      if(erosketenZerrenda.get(x).getBezeroa() instanceof Pertsona){
          if(((Pertsona)erosketenZerrenda.get(x).getBezeroa()).getAbizena().equals(abizena)){
              System.out.println(erosketenZerrenda.get(x).getBezeroa().getIzena() + " -ren helbidea, " + erosketenZerrenda.get(x).getBezeroa().getHelbidea() + " da.");
          }
      }
  }
}

}