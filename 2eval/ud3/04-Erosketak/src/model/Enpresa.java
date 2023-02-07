package model;
public class Enpresa extends Bezeroak{

    public Enpresa(int kod, String izena, String helbidea, String email) {
        super(kod, izena, helbidea, email);
        //TODO Auto-generated constructor stub
    }
    
    private String email2;

    public Enpresa(int kod, String izena, String helbidea, String email, String email2) {
        super(kod, izena, helbidea, email);
        this.email2 = email2;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    @Override
    public String toString() {
        return "Bezeroak  " + getKod() + "\n Izena  " + getIzena() + "\n Helbidea  " + getHelbidea() + "\n email  " + getEmail() + ", " + email2;
    }

}
