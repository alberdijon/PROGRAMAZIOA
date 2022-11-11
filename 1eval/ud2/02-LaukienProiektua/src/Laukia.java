
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

    public int getPerimetroa() {
        int perimetroa = altuera * 2 + zabalera * 2;

        return perimetroa;
    }

    public void setZabalera(int zabaleraBerria) {
        zabalera = zabaleraBerria;
    }

    public void setAltuera(int altueraBerria) {
        altuera = altueraBerria;
    }

    public String toString() {
        return "Laukia[" + altuera + "X" + zabalera + "]";
    }

    public String getMota() {

        String mota;

        if (altuera == zabalera) {

            mota = "Karratua";

        } else if (altuera > zabalera) {
            mota = "Bertikala";

        } else {
            mota = "Horizontala";

        }

        return mota;

    }

    public static void marraztuBeteta(Laukia l1) {

        for (int y = 0; y < l1.getAltuera(); y++) {
            for (int x = 0; x < l1.getZabalera(); x++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void marraztuHutsik(Laukia l1) {

        for (int y = 1; y <= l1.getZabalera(); y++) {
            for (int x = 1; x <= l1.getAltuera(); x++) {
                if ((x == 1) || (y == 1) || (x == l1.getAltuera()) || (y == l1.getZabalera())) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public  boolean isBiggerThan(Laukia l1) {

        boolean handiago = false;

        if (this.getAzalera() > l1.getAzalera()) {
            handiago = true;
        }

        return handiago;

    }

    public static Laukia getTheBiggest(Laukia[] laukiak) {
        
        Laukia max = laukiak[0];

        for (int i = 1; i < laukiak.length && laukiak[i] != null; i++) {
            if (laukiak[i].isBiggerThan(max)) {
                max = laukiak[i];
            }
        }

        return max;
    }

}
