package model;

import java.time.LocalDate;

abstract public class Kidea {
    protected int id;
    protected String izena;
    protected String abizena;
    protected LocalDate jaiotzeData;

    public Kidea(int id, String izena, String abizena, String jaiotzeData){

        this.id = id;
        this.izena = izena;
        this.abizena = abizena;
        boolean egina = false;
        do {
            try {
                this.jaiotzeData = LocalDate.parse(jaiotzeData);                
                egina = true;
            }catch (Exception ex) {
                System.out.println(getAbizena() + "kidearen data ezin da parseatu.");
                this.jaiotzeData = LocalDate.parse("1900-01-01"); 
                egina = true;
            }

        } while (!egina);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public void setAbizena(String abizena) {
        this.abizena = abizena;
    }

    public LocalDate getJaiotzeData() {
        return jaiotzeData;
    }

    public void setJaiotzeData(LocalDate jaiotzeData) {
        this.jaiotzeData = jaiotzeData;
    }

    abstract public void entrenatu();

    @Override
    public String toString() {
        return "Kidea [" + id + ", " + izena + " " + abizena + ", " + jaiotzeData + "]";
    }

    

}
