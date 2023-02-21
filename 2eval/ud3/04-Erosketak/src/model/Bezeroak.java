package model;
abstract public class Bezeroak {
    
    private int kodea;
    private String helbidea;

    public Bezeroak(int kodea, String helbidea) {
        this.kodea = kodea;
        this.helbidea = helbidea;
    }

    public int getKodea(){

        return kodea;

    }

    abstract public String getIzena();

    public String getHelbidea(){

        return helbidea;

    }

    abstract public String getEmaila();
    
}

