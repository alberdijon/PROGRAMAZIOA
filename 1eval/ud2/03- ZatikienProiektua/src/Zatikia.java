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

}
