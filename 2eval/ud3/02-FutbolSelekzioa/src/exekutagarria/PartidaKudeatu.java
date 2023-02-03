package exekutagarria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import enumak.Demarkazioa;
import model.Entrenador;
import model.Futbolista;
import model.IntegranteSeleccion;
import model.Masajista;
import model.Partida;

public class PartidaKudeatu {
    private static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList();
    private static Partida[] partidak = new Partida[200];

    /** Programa honek selekzioa eta hasierako partiden datuak kargatu ondoren erabiltzaileari datu
     * gehiago dauzkan galdetuko dio.
     * rJaraian partiden zerrenda bistaratuko da eta amaitzeko partiden inguruko estadistikak bistaratuko ditu.
     */
    public static void main(String[] args) {
       
        selekzioOsoaSortu();
        System.out.println("Selekzio osoa sortu ondoren " + kontatuIntegrante() + " integrante daude selekzioan");
        System.out.println("Lehen " + hasierakoPartidakErregistratu()+ " partidak erregistratu dira.");
        partidaBatenDatuakEskatu();
        partidakBistaratu();
        estatistikak();

    }


  

    /**
     * Selekzio osoaren datuak gorde "selekzioa" deitutako IntegranteSeleccion
     * klaseko ArrayList estatiko baten.
     * 
     */


    public static void selekzioOsoaSortu() {

        selekzioa.add(new Futbolista(1, 0, Demarkazioa.POR, "Aitor", 30, "Fernandez"));
        selekzioa.add(new Futbolista(2, 0, Demarkazioa.DEF, "Unai", 29, "Bustinza"));
        selekzioa.add(new Futbolista(3, 0, Demarkazioa.DEF, "Mikel", 33, "Balenziaga"));
        selekzioa.add(new Futbolista(4, 0, Demarkazioa.MED, "Asier", 31, "Illarramendi"));
        selekzioa.add(new Futbolista(5, 0, Demarkazioa.DEF, "Iñigo", 30, "Martinez"));
        selekzioa.add(new Futbolista(6, 0, Demarkazioa.MED, "Mikel", 32, "San Jose"));
        selekzioa.add(new Futbolista(7, 0, Demarkazioa.DEF, "Gaizka", 24, "Larrazabal"));
        selekzioa.add(new Futbolista(8, 0, Demarkazioa.MED, "Manu", 35, "Garcia"));
        selekzioa.add(new Futbolista(9, 0, Demarkazioa.DEL, "Aritz", 40, "Aduriz"));
        selekzioa.add(new Futbolista(10, 0, Demarkazioa.MED, "Javier", 31, "Eraso"));
        selekzioa.add(new Futbolista(11, 0, Demarkazioa.DEL, "Asier", 23, "Villalibre"));
        selekzioa.add(new Futbolista(12, 0, Demarkazioa.DEF, "Aihen", 24, "Muñoz"));
        selekzioa.add(new Futbolista(13, 0, Demarkazioa.POR, "Iago", 34, "Herrerín"));
        selekzioa.add(new Futbolista(14, 0, Demarkazioa.DEF, "Aritz", 27, "Elustondo"));
        selekzioa.add(new Futbolista(15, 0, Demarkazioa.DEF, "Jesús", 22, "Areso"));
        selekzioa.add(new Futbolista(16, 0, Demarkazioa.DEL, "Iñigo", 24, "Vicente"));
        selekzioa.add(new Futbolista(17, 0, Demarkazioa.DEF, "Daniel", 22, "Vivian"));
        selekzioa.add(new Entrenador("Euskal selekzioa", 1, "Francisco", 40, "Padalino"));  
        selekzioa.add(new Entrenador("Euskal selekzioa", 2, "Joseba", 40, "Núñez"));  
        selekzioa.add(new Entrenador("Euskal selekzioa", 3, "Markel", 40, "Lautadahandi")); 
        selekzioa.add(new Masajista("Fisioterapeuta", 21, 4, "Iñaki", 41, "Sertxiberrieta"));
        selekzioa.add(new IntegranteSeleccion(5,"Ander", "Etxeburu", 21)); 

    }

    public static int kontatuIntegrante(){
        int kantitatea = selekzioa.size();

        return kantitatea;
    }

    /**
     * Wikipediako orrian agertzen diren lehen partiden datuak txertatu partiden
     * arrayean.
     */
    public static int hasierakoPartidakErregistratu() {

        ArrayList<Futbolista> txartelak = new ArrayList();
        int kantitatea = 0;

        txartelak = txartelakJarri();
        partidak[0] = new Partida(LocalDate.of(1990,03,21), "Errumania", txartelak );
        txartelak = txartelakJarri();
        partidak[1] = new Partida(LocalDate.of(1993,12,22), "Errumania", txartelak );
        txartelak = txartelakJarri();
        partidak[2] = new Partida(LocalDate.of(1994,12,23), "Errumania", txartelak );
        txartelak = txartelakJarri();
        partidak[3] = new Partida(LocalDate.of(1995,12,22), "Errumania", txartelak );
        txartelak = txartelakJarri();
        partidak[4] = new Partida(LocalDate.of(1996,12,26), "Errumania", txartelak );

        for (int x = 0; x < partidak.length; x++) {
            
           if(partidak[x] != null){
            kantitatea++;
           }

        }

      return kantitatea;
    }
  
    /**
     * Partida berri baten datuak erabiltzaileari eskatu eta partida objektua bueltatu.
     */
    public static Partida partidaBatenDatuakEskatu() {

        String herrialdea;
        int[] txartelakj;
        ArrayList <Futbolista> txartelak = new ArrayList<Futbolista>();
        char be = 'b';
        boolean sartuta = false;


        Scanner in = new Scanner(System.in);
        do{

            System.out.println("Partida baten datuak sartu nahi dituzu? (B/E)");
            be = in.next().charAt(0);
            if(be == 'b'){

                System.out.println("Noiz jokatu zen (uuuu-hh-ee)");
                LocalDate data = LocalDate.parse(in.next()); 
                System.out.println("Noren kontra?");
                herrialdea = in.next();
                System.out.println("Selekzioko jokalariren batek jaso al zuen txartelik? (Sartu dorsalak, komaz banatuta edo sakatu ENTER)");
    
                String []dorsalak = in.next().split(",");
    
                txartelakj = new  int[dorsalak.length];

                for(int x = 0; x < dorsalak.length; x++){

                    txartelakj[x] = Integer.parseInt(dorsalak[x]);

                }

                for(int x = 0; x < txartelakj.length; x++){
                    for(int y = 0; y < selekzioa.size(); y++){

                        if(txartelakj[x] == selekzioa.get(y).getId()){

                            txartelak.add((Futbolista) selekzioa.get(y));

                        }

                    }
                }

                for (int x = 0; x < partidak.length; x++) {
                    
                    if ((partidak[x] == null) || sartuta == false) {
                        
                        partidak[x] = new Partida(data, herrialdea, txartelak);

                    }

                }

            }
           

        }while(be == 'b');


        
        in.close();


        return null;
    }

    /** Partiden zerrenda bistaratu. */
    public static void partidakBistaratu() {
      
        System.out.println("PARTIDEN ZERRENDA");
        System.out.println("====================");

        for (int x = 0; x < partidak.length; x++) {
            if(partidak[x] != null){
                System.out.println(partidak[x]);
            }
        }

    }
  
  /**
   *  Metodo honek hainbat estatistika kalkulatu eta kontsolatik inprimatuko ditu.
   *  Adibidez: 
   * 
   *   - Jokatutako partida kopurua
   *   - Zein izan den partidarik gogorrena txartel kopuruari dagokionez 
   *   - Txartel kopurua jokalariko
   *   - Txartel gehien lortu duen jokalariaren izena
   *   - Zenbat partida jolastu den urteko
   *   - Duela zenbat urte jolastu zen lehen partida
   *   - Partiden zein portzentai jokatu den abenduan
   *   - ...
   */
    public static void estatistikak() {


        int partidaKop = 0;
        int gogorrena = 0;

        for (int x = 0; x < partidak.length; x++) {
            if(partidak[x] != null){
                partidaKop++;
                if (partidak[gogorrena].getTxartelak().size() < partidak[x].getTxartelak().size()) {
                    
                    gogorrena = x;

                }
            }
        }

        System.out.println("\n\n\nJokatutako partida kopurua: " + partidaKop);
        System.out.println("\n\nTxartel gehien eduki dituen partida: \n" + partidak[gogorrena]);


    }

    public static ArrayList<Futbolista> txartelakJarri() {

        ArrayList<Futbolista> txartelak = new ArrayList<>();
        ArrayList<Futbolista> futbolistak = new ArrayList<>();

        for (int i = 0; i < selekzioa.size(); i++) {
            if (selekzioa.get(i).getClass() == Futbolista.class) {
                futbolistak.add((Futbolista) selekzioa.get(i));
            }
        }

        int rand2 = (int) (Math.random() * futbolistak.size());
        for (int j = 0; j < rand2; j++) {
            int rand = (int) (Math.random() * futbolistak.size());
            txartelak.add(futbolistak.get(rand));
        }

        return txartelak;
    }
  
}