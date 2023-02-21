package model;

import java.time.LocalDate;

public class Entrenatzailea extends Kidea{
    
    private String idFederazioa;

    public Entrenatzailea(int id, String izena, String abizena, String jaiotzeData, String idFederazioa){
        super(id, izena, abizena, jaiotzeData);
        this.idFederazioa = idFederazioa;
    }

    public String getIdFederazioa() {
        return idFederazioa;
    }

    public void setIdFederazioa(String idFederazioa) {
        this.idFederazioa = idFederazioa;
    }

    @Override
    public void entrenatu() {
        System.out.println("Entrenamendua zuzentzen nabil.");
        
    }


    @Override
    public String toString() {
        LocalDate gaurDate = LocalDate.now();
        int urteak = gaurDate.getYear() - jaiotzeData.getYear();
        return "Entrnatzailea => " + id + ", " + izena + " " + abizena + ", " + urteak + " urte, "+ idFederazioa;
    }

    

}
