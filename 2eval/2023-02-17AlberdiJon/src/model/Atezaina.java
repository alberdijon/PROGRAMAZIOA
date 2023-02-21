package model;

import java.time.LocalDate;

public class Atezaina extends Futbolaria{

    private int geratutakoBaloiak;
    private int jasotakoGolak;

    public Atezaina(int id, String Izena, String abizena, String jaiotzeData, int dortsala, int geratutakoBaloiak, int jasotakoGolak){
        super(id, Izena, abizena, jaiotzeData, dortsala);

        this.geratutakoBaloiak = geratutakoBaloiak;
        this.jasotakoGolak = jasotakoGolak;

    }

    public int getGeratutakoBaloiak() {
        return geratutakoBaloiak;
    }

    public int getJasotakoGolak() {
        return jasotakoGolak;
    }

    public void baloiaGeratu(){
        geratutakoBaloiak++;
    }
    
    public void golaJaso(){
        jasotakoGolak++;
    }

    @Override
    public String toString() {
        LocalDate gaurDate = LocalDate.now();
        int urteak = gaurDate.getYear() - jaiotzeData.getYear();
        return "Atezaina  => " + id + ", " + izena + " " + abizena + ", " + urteak + " urte, " + getDortsala() + " dortsala, " + geratutakoBaloiak + " geratutakoak, " + jasotakoGolak + " jasoak";
    }
    
}
