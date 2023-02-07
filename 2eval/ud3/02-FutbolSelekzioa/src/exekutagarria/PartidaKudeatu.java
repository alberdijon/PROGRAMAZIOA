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
        selekzioa.add(new Entrenador("Euskal selekzioa", 18, "Francisco", 40, "Padalino"));  
        selekzioa.add(new Entrenador("Euskal selekzioa", 19, "Joseba", 40, "Núñez"));  
        selekzioa.add(new Entrenador("Euskal selekzioa", 20, "Markel", 40, "Lautadahandi")); 
        selekzioa.add(new Masajista("Fisioterapeuta", 21, 21, "Iñaki", 41, "Sertxiberrieta"));
        selekzioa.add(new IntegranteSeleccion(22,"Ander", "Etxeburu", 21)); 

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
        partidak[0] = new Partida(LocalDate.of(1990,03,21), "Rumanía", txartelak );
        txartelak = txartelakJarri();
        partidak[1] = new Partida(LocalDate.of(1993,12,22), "Bolivia", txartelak );
        txartelak = txartelakJarri();
        partidak[2] = new Partida(LocalDate.of(1994,12,23), "Rusia", txartelak );
        txartelak = txartelakJarri();
        partidak[3] = new Partida(LocalDate.of(1995,12,22), "Paraguay", txartelak );
        txartelak = txartelakJarri();
        partidak[4] = new Partida(LocalDate.of(1996,12,26), "Estibua", txartelak );

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
                    
                    if ((partidak[x] == null) && (sartuta == false)) {
                        
                        partidak[x] = new Partida(data, herrialdea, txartelak);
                        sartuta = true;

                    }

                }

                sartuta = false;

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
                System.out.println(partidak[x] + "\n\n");
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

        //-------------------------------------------------------
        
        ArrayList<Integer[ ] > txartelak = new ArrayList<Integer[ ] >();
        Integer [] txart = new Integer[2];
        ArrayList<Futbolista> futbolista = new ArrayList<Futbolista>();
        int kant = 0;
        int index;
        boolean sartuta = false;

        //---------------------------------------------------------

        for (int x = 0; x < partidak.length; x++) {
            if(partidak[x] != null){
                partidaKop++;
                if (partidak[gogorrena].getTxartelak().size() < partidak[x].getTxartelak().size()) {
                    
                    gogorrena = x;

                }
            }
        }

        // ---------------------------------------------------------

        for (int x = 0; x < partidak.length; x++) {
            if(partidak[x] != null){
                if(partidak[x].getTxartelak() != null){
                    futbolista = partidak[x].getTxartelak();
                    for (int y = 0; y < futbolista.size(); y++) {
                        if((x == 0) && (y == 0)){
                            kant = 1;
                            txart[0] = futbolista.get(y).getId();
                            txart[1] = kant;
                            txartelak.add(txart);
                        }else{
                            for (int z = 0; z < txartelak.size(); z++) {
                                txart = txartelak.get(z);
                                if((txart[0] == futbolista.get(y).getId()) && (sartuta == false)){
                                    index = futbolista.indexOf(futbolista.get(y));
                                    kant = txart[1];
                                    kant++;
                                    txart[1] = kant;
                                    txartelak.set(index, txart);
                                    sartuta = true;
                                }else if(sartuta == false){
                                    txartelak.add(txart);
                                    sartuta = true;
                                }
                            }
                            sartuta = false;
                        }
                    }
                }
            }
            
        }

        int haundiena = 0;
        Integer[] moment = new Integer[2];

        txart = txartelak.get(0);

        for(int x = 0; x < selekzioa.size(); x++){
            for(int y = 1; y < txartelak.size(); y++){
                moment = txartelak.get(y);
                if(moment[1] == txart[1]){
                    haundiena = moment[0];
                    txart = moment;
                }
            }
        }

        moment = txart;

        for(int x = 0; x < selekzioa.size(); x++){
            for(int y = 0; y < txartelak.size(); y++){
               txart = txartelak.get(y);
               if(selekzioa.get(x).getId() == txart[0]){
                    System.out.println(selekzioa.get(x).getNombre() + " " + selekzioa.get(x).getApellidos() + " jokalariak " + txart[1] + " txartel jaso ditu");
                    
                }
            }
        }


       for(int x = 0; x < selekzioa.size(); x++){
            if(selekzioa.get(x).getId() == moment[0]){

                System.out.println("Txartel gehien jaso dituen joalaria: " + selekzioa.get(x).getNombre() + " " + selekzioa.get(x).getApellidos() + " izan da: " + moment[1] + " txartelekin.");

            }
       }


        //------------------------------------------------------------


        System.out.println("\n\n\nJokatutako partida kopurua: " + partidaKop);
        System.out.println("\n\nTxartel gehien eduki dituen partida: \n" + partidak[gogorrena]);

       //----------------------------------------------------------------

       System.out.println("Urte bakoitzean jokatutako partida kopurua: ");
        for (int x = 0; x < partidak.length; x++) {
            if(partidak[x] != null){
                int zenbat = 0;
                boolean errepikatu = false;
                for (int y = 0; y < partidak.length; y++) {
                    if(partidak[y] != null){
                        if(y < x){
                            if(partidak[x].getData().getYear() == partidak[y].getData().getYear()){
                                errepikatu = true;
                                break;
                            }
                        }
                    }
                    if(errepikatu){
                        break;
                    }
                }
                if(!errepikatu){
                    for (int j = 0; j < partidak.length; j++) {
                        if(partidak[j] != null){
                            if(partidak[x].getData().getYear() == partidak[j].getData().getYear()){
                                zenbat++;
                            }
                        }
                    }
                    System.out.println(partidak[x].getData().getYear() + ": " + zenbat);
                }
                
            }
        }
        System.out.println("");
       



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