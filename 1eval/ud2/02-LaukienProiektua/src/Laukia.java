
public class Laukia {
    private int zabalera;
    private int altuera;

    public Laukia() {
        zabalera = 5;
        altuera = 5;
    }

    public Laukia(int zab, int alt) {
        zabalera = zab;
        altuera = alt;
    }

    public int getZabalera() {
        return zabalera;
    }

    public int getAltuera() {
        return altuera;
    }

    public int getAzalera() {
        int azalera = altuera * zabalera;

        return azalera;
    }

    public int getPerimetroa(){
        int perimetroa = altuera*2 + zabalera*2;

        return perimetroa;
    }

    public void setZabalera(int zabaleraBerria){
        zabalera = zabaleraBerria;
    }   
     public void setAltuera(int altueraBerria){
        altuera = altueraBerria;
    }

    public String toString(){
        return "Laukia[" + altuera + "X" + zabalera + "]";
    }

    public String getMota(){

        String mota;

        if( altuera == zabalera){

            mota = "Karratua";

        }else if( altuera > zabalera){
            mota = "Bertikala";

        }else{
            mota = "Horizontala";

        }

        return mota;
    
    }

}
