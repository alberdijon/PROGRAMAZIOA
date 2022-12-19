package model;

import java.util.ArrayList;

public class Langilea {

    private String izena;
    private String abizena;
    private String emaila;
    private double soldata;

    /**
     * Konstruktore honek Langilea objetu bat sortuko du jasotako parametroak
     * kontuan izanda.
     */
    public Langilea(String izena, String abizena, String emaila, double soldata) {
        this.izena = izena;
        this.abizena = abizena;
        this.emaila = emaila;
        this.soldata = soldata;
    }

    /**
     * Konstruktore honek automatikoki kalkulatuko du emaila patroi hau jarraituz:
     * abizena.izena@bertsozale.eus
     * email guztiak minuskulaz.
     * Lehenetsitako soldata esleituko zaio gainera langileari; 1200 euroko soldata.
     * 
     * @param izena
     * @param abizena
     */
    public Langilea(String izena, String abizena) {

        this.izena = izena;
        this.abizena = abizena;
        this.soldata = 1200.00;
        this.emaila = abizena + "." + izena + "@bertsozale.eus";
    }

    public String getIzena() {
        return izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public String getEmaila() {
        return emaila;
    }

    public double getSoldata() {
        return soldata;
    }

    public void setEmaila(String emaila) {
        this.emaila = emaila;
    }

    /**
     * Langilearen soldata aldatzeko erabiliko da metodo hau.
     * Atributoa aldatzeaz gain, soltata berria bueltatuko du metodoak.
     * 
     * @param portzentaia Igoeraren portzentaia. Adibidez,
     *                    10 balioak, %10eko igoera adierazten du
     *                    50 balioa pasa beharko genuke soldataren erdia igo nahiko
     *                    bagenu.
     * @return soldataBerria
     */
    public double soldataIgo(int portzentaia) {
        double soldataBerria;

        soldataBerria = soldata + ( soldata * portzentaia / 100);

        this.soldata = soldataBerria;

        return soldataBerria;
    }

    /**
     * Langilearen datuak String formatuan itzultzen ditu;
     * zehazki, klasearen izenaren ostean eta kortxete artean atributo guztien
     * balioak komaz bananduta.
     * 
     */
    @Override
    public String toString() {
        return "Langilea [" + izena + ", " + abizena + ", " + emaila + ", " + soldata + "]";
    }

    /**
     * EZ IKUTU METODO HAU
     * Metodo honi langileen zerrenda bat behar duenak deituko dio. *
     * 
     * @return Hiru langileren datuak dauzkan arraylista bueltatzen du.
     */
    public static ArrayList<Langilea> getLangileenZerrenda() {
        ArrayList<Langilea> langileak = new ArrayList<>();
        langileak.add(new Langilea("Alaia", "Martin"));
        langileak.add(new Langilea("Nerea", "Ibarzabal"));
        langileak.add(new Langilea("Maialen", "Lujanbio", "lujanbio.maialen@bertsozale.eus", 2000));

        return langileak;
    }

    /**
     * Itxura honetako taula bat inprimatuko du:
     *
     * Langileen Zerrenda (LangileKopurua)
     * ==========================================
     * Lehen langilearen datuak
     * Bigarren langilearen datuak
     * Hirugarren langilearen datuak
     * ...
     * 
     * @param Inprimatu nahi den zerrenda
     */
    public static void langileakInprimatu(ArrayList<Langilea> lk) {
        System.out.println("Langileen Zerrenda (" + lk.size() + ")");
        System.out.println("==========================================");
        for(int x = 0; x < lk.size(); x++ ){

            System.out.println(lk.get(x));

        }
    }

    /**
     * Metodo honek uneko objektuaren emaila egokia den, hau da, zerrendan
     * existitzen den egiaztatzen du.
     * 
     * @param lk Egiaztatu beharreko zerrenda
     * @return Zerrendan email helbide hori dagoeneko baldin badaukagu, false
     *         bueltatzen du
     */

    public boolean emailEgokia(ArrayList<Langilea> lk) {

        boolean badago = true;
       
        for(int x = 0; x < lk.size(); x++ ){

           if(this.emaila ==  lk.get(x).getEmaila()){

            badago = false;

           }

        }

        return badago;
       
    }

    /** Langile honen email originalari zenbakitxo bat gehitzen dio @ ikurraren aurretik.
     * Adibidez:
     * perez.juan@uni.eus => perez.juan2@uni.eus     
     * 
     */
    public void emailaDoitu() {
        
        int arroba;
        String doitua;
        String bigarrenZat;

        arroba = this.emaila.indexOf('@');
        
        doitua = this.emaila.substring(0, arroba);
        bigarrenZat = this.emaila.substring(arroba);

        emaila = doitua + "2" + bigarrenZat;


    }


}
