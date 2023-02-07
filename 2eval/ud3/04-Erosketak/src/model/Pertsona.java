package model;
public class Pertsona extends Bezeroak{

    public Pertsona(int kod, String izena, String helbidea, String email) {
        super(kod, izena, helbidea, email);
        //TODO Auto-generated constructor stub
    }

    private String abizena;

    public Pertsona(int kod, String izena, String helbidea, String email, String abizena) {
        super(kod, izena, helbidea, email);
        this.abizena = abizena;
    }

    public String getAbizena() {
        return abizena;
    }

    public void setAbizena(String abizena) {
        this.abizena = abizena;
    }

        @Override
    public String toString() {
        return "Bezeroak  " + getKod() + "\n Izena  " + getIzena() + "\t\t" + abizena+ "\n Helbidea  " + getHelbidea() + "\n email  " + getEmail();
    }

    
}
