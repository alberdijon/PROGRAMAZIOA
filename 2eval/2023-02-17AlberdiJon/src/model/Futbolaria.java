package model;

import java.time.LocalDate;

public class Futbolaria extends Kidea{

    private int dortsala;

    public Futbolaria(int id, String izena, String abizena, String jaiotzeData, int dortsala) {
        super(id, izena, abizena, jaiotzeData);
        //TODO Auto-generated constructor stub
        this.dortsala = dortsala;

    }

    public int getDortsala() {
        return dortsala;
    }

    public void setDortsala(int dorsala) {
        this.dortsala = dorsala;
    }

    @Override
    public void entrenatu() {
        System.out.println("Entrenatzailearen aginduetara entrenatzen nabil.");
        
    }

    @Override
    public String toString(){
        LocalDate gaurDate = LocalDate.now();
        int urteak = gaurDate.getYear() - jaiotzeData.getYear();
        return "Futbolaria => " + id + ", " + izena + " " + abizena + ", " + urteak + " urte , " + dortsala + " dortsala";
    }

    

}
