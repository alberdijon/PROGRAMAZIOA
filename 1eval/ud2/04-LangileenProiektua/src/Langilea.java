public class Langilea {
    private int id;
    private String izena;
    private String abizena;
    private double soldata;
    
    public Langilea(int id, String izena, String abizena, double soldata){

        id = id;
        izena = izena;
        abizena = abizena;
        soldata = soldata;

    }

    public int getId() {
        return id;
    }

    public String getIzena() {
        return izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public String getIzenOSoa(String abizena) {
        return izena + abizena;
    }

    public double getSoldata() {
        return soldata;
    }

    public void setSoldata(double soldata) {
        this.soldata = soldata;
    }

    public double getUrtekoSoldata(double soldata) {
        return soldata * 12;
    }

    public double soldataIgo(int portzentaia){

        double berria = soldata + ((soldata * portzentaia)/100);

        setSoldata(berria);

        return soldata;
    }

    @Override
    public String toString() {
        return "Langilea [id=" + id + ", izena=" + izena + ", abizena=" + abizena + ", soldata=" + soldata + "]";
    }

    public Langilea[] nireHamarLagunLangile(){

        Langilea[] lagunak = new Langilea[10];

        return lagunak;

    }    

}
