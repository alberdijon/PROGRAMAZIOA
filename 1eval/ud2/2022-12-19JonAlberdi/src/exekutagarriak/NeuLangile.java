package exekutagarriak;
import model.Langilea;
import java.util.ArrayList;

/** Programa honek zure izen abizenak daramatzan erabiltzailea sortuko du, lehenetsitako email eta soldatarekin.
 * Langilearen datuak kontsolatik bistaratu ondoren.
 * Soldata igo eta berriz inprimatuko du langilearen informazioa.
 */


public class NeuLangile {

    private static ArrayList<Langilea> langileak;

    public static void main(String[] args) throws Exception {

        langileak = Langilea.getLangileenZerrenda();
        
        langileak.add(new Langilea("Jon", "Alberdi"));
    
        System.out.println("Nire langile datuak igoera aurretik:");
        System.out.println(langileak.get(3));

        langileak.get(3).soldataIgo(50);

        System.out.println("Nire langile datuak igoera ostean");
        System.out.println(langileak.get(3));

    }
}
