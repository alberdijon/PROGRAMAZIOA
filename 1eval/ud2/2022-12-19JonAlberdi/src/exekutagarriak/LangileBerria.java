package exekutagarriak;
import java.util.ArrayList;
import java.util.Scanner;
import model.Langilea;


/** Programa honek langile berri bat txertatuko du zerrendan. Hauek dira programak jarraituko dituen pausuak:
 * 1.- Langileen zerrenda eskuratu (metodo egokiari deituta)
 * 2.- Langileen zerrenda inprimatu (metodo egokiari deituta)
 * 3.- Erabiltzaileari langile berriaren datuak eskatu eta 
 * 4.- Langilea sortu
 * 5.- Langilea zerrendan txertatu
 * 6.- Langileen zerrenda inprimatu (metodo egokiari deituta)
 */
public class LangileBerria {

    private static ArrayList<Langilea> langileak;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        langileak = Langilea.getLangileenZerrenda();
        String izena, abizena;
        int index;


        Langilea.langileakInprimatu(langileak);

        System.out.println("Langile berriaren izen abizenak idatzi espazioz bananduta:");
        izena = in.next();
        abizena = in.next();
        

        langileak.add(new Langilea(izena, abizena));

        Langilea.langileakInprimatu(langileak);

        in.close();
        
    }    
}
