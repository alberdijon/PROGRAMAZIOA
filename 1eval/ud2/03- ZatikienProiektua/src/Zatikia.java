public class Zatikia {
    private int zenbakitzailea;
    private int izendatzailea;

    public Zatikia(int zenb, int izend){

        izendatzailea = izend;
        zenbakitzailea = zenb;

    }

    public int getZenbakitzailea() {
        return zenbakitzailea;

    }public int getIzendatzailea() {
        return izendatzailea;
    }

    public void setZenbakitzailea(int ZenbakitzaileaBerria) {
        zenbakitzailea = ZenbakitzaileaBerria;
    }

    public void setIzendatzailea(int IzendatzaileaBerria) {
        izendatzailea = IzendatzaileaBerria;
    }

    public String toString(){
        return "Zatikia[" + zenbakitzailea + "/" + izendatzailea + "]";
    }

    public Zatikia biderkatu( Zatikia zat1, Zatikia zat2){

        int zenb, izend;

        zenb =  zat1.zenbakitzailea * zat2.zenbakitzailea;
        izend =  zat1.izendatzailea * zat2.izendatzailea;

        Zatikia zat3 = new Zatikia(zenb, izend);

        return zat3;

    }

    public static Zatikia batu(Zatikia zat1, Zatikia zat2) {

        Zatikia batuketa;

        

    }

}
