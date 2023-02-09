package model;

import java.util.Arrays;

public class Enpresa extends Bezeroak{

    private int kodea;
    private String izenJuridikoa;
    private String izenKomertziala;
    private String helbidea;
    private String[] kontaktoenEmailak;

    @Override
    public String getIzena() {
        return izenKomertziala;
    }

    @Override
    public String getEmaila() {
        return kontaktoenEmailak[0] + kontaktoenEmailak[1];
    }

    public int getKodea() {
        return kodea;
    }

    public String getHelbidea() {
        return helbidea;
    }

    @Override
    public String toString() {
        return "Enpresa [kodea=" + kodea + ", izena=" + getIzena() +  "helbidea=" + helbidea + ", kontaktoenEmailak=" + Arrays.toString(kontaktoenEmailak) + "]";
    }

    

}
