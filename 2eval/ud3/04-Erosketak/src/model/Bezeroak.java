package model;
public class Bezeroak {
    
    private int kod;
    private String izena;
    private String helbidea;
    private String email;
    
    public Bezeroak(int kod, String izena, String helbidea, String email) {
        this.kod = kod;
        this.izena = izena;
        this.helbidea = helbidea;
        this.email = email;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public String getHelbidea() {
        return helbidea;
    }

    public void setHelbidea(String helbidea) {
        this.helbidea = helbidea;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Bezeroak  " + kod + "\n Izena  " + izena + "\n Helbidea  " + helbidea + "\n email  " + email;
    }

    

}
