package exekutagarriak;
import java.util.ArrayList;
import java.util.Scanner;
import model.Langilea;
import java.util.InputMismatchException;

import model.Langilea;

/** Programa honek langile berri bat txertatuko du zerrendan. 
 * Hauek dira programak jarraituko dituen pausuak:
 * 1.- Langileen zerrenda eskuratu (metodo egokiari deituta)
 * 2.- Langileen zerrenda inprimatu (metodo egokiari deituta)
 * 3.- Langile berria eskuratu (datuakEskatu metodoari deituta)
 * 4.- Langile berriaren emaila ez bada egokia (errepikatuta dagoelako) emaila ajustatu
 * 5.- Langilea zerrendan txertatu
 * 6.- Langileen zerrenda inprimatu (metodo egokiari deituta)
 */
public class LangileBerriaSofistikatua {

    private static ArrayList<Langilea> langileak;
    public static void main(String[] args) {

        int posizioa;
        Scanner in = new Scanner(System.in);

        langileak = Langilea.getLangileenZerrenda();

        Langilea.langileakInprimatu(langileak);

        langileak.add(datuakEskatu());


        posizioa =  langileak.size() - 1;

        for(int x = 0; x < langileak.size(); x++){

            if( langileak.get(posizioa).getEmaila()  == langileak.get(x).getEmaila()){

           

                langileak.get(posizioa).emailaDoitu();

            }

        }

        Langilea.langileakInprimatu(langileak);


        in.close();
        //OSATU EZAZU METODO HAU
    }

    /** Metodo honek langile berri baten datuak eskatzen dizkio erabiltzaileari.
     * Ez badu soldata zenbakitan, behar bezala sartzen, 1200eko soldata asignatuko zaio.
     * 
     * @return Langile berria
     */
    public static Langilea datuakEskatu() {

        Scanner in = new Scanner(System.in);
        String iz, abz, em;
        double sold;
        Langilea berria;

        System.out.println("LANGILE BERRIA");
        System.out.print("Izena \n");
        iz = in.next();
        System.out.print("Abizena \n");
        abz = in.next();
        System.out.print("Emaila \n");
        em = in.next();
       
        try {
            System.out.print("Soldata \n");
            sold = in.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Zenbaki ez egoki bat sartu duzu, beraz, lehenetsia esleituko diogu.");
            sold = 1200.00;

        } 

        berria = new Langilea(iz, abz, em, sold);

        return berria;
    }

}
