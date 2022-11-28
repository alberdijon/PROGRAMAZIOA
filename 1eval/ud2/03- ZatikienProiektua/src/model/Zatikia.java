package model;

public class Zatikia {
    private int zenbakitzailea;
    private int izendatzailea;

    public Zatikia(int zenb, int izend) {

        izendatzailea = izend;
        zenbakitzailea = zenb;

    }

    public Zatikia(String zatIdatzia) {

        int barraLen = zatIdatzia.indexOf("/");
        int strLen = zatIdatzia.length();

        String strGoikoa = zatIdatzia.substring(0, barraLen);
        String strBehekoa = zatIdatzia.substring(barraLen + 1, strLen);

        int zenbakitzailea = Integer.parseInt(strGoikoa);

        int izendatzailea = Integer.parseInt(strBehekoa);

        // Integer.toString(strGoikoa);
        this.izendatzailea = izendatzailea;
        this.zenbakitzailea = zenbakitzailea;
    }


    public int getZenbakitzailea() {
        return zenbakitzailea;

    }

    public int getIzendatzailea() {
        return izendatzailea;
    }

    public void setZenbakitzailea(int ZenbakitzaileaBerria) {
        zenbakitzailea = ZenbakitzaileaBerria;
    }

    public void setIzendatzailea(int IzendatzaileaBerria) {
        izendatzailea = IzendatzaileaBerria;
    }

    public String toString() {
        return "Zatikia[" + zenbakitzailea + "/" + izendatzailea + "]";
    }

    public static Zatikia biderkatu(Zatikia zat1, Zatikia zat2) {

        int zenb, izend;

        zenb = zat1.zenbakitzailea * zat2.zenbakitzailea;
        izend = zat1.izendatzailea * zat2.izendatzailea;

        Zatikia zat3 = new Zatikia(zenb, izend);

        return zat3;

    }

    public static Zatikia batu(Zatikia zat1, Zatikia zat2) {

        Zatikia batuketa;
        int zenbak;
        int izend;

        izend = zat1.getIzendatzailea() * zat2.getIzendatzailea();
        zenbak = (zat1.getZenbakitzailea() * zat2.getIzendatzailea())
                + (zat2.getZenbakitzailea() * zat1.getIzendatzailea());

        batuketa = new Zatikia(zenbak, izend);

        return batuketa;

    }

    public void batu(Zatikia bezteZatBat) {

        int izend;
        int zenbak;

        izend = this.getIzendatzailea() * bezteZatBat.getIzendatzailea();
        zenbak = this.getZenbakitzailea() * bezteZatBat.getIzendatzailea()
                + bezteZatBat.getIzendatzailea() * this.getIzendatzailea();

        this.setIzendatzailea(izend);
        this.setZenbakitzailea(zenbak);

    }

    public double hamartarBaliokidea() {
        double baliokidea;

        baliokidea = zenbakitzailea / izendatzailea;

        return baliokidea;

    }

    public boolean isBiggerThan(Zatikia besteZatikiBat) {

        boolean haundiagoa = false;

        if (this.hamartarBaliokidea() > besteZatikiBat.hamartarBaliokidea()) {
            haundiagoa = true;
        }

        return haundiagoa;

    }

    public int mcd() {
        int u = Math.abs(zenbakitzailea); // valor absoluto del numerador
        int v = Math.abs(izendatzailea); // valor absoluto del denominador
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    public void sinplifikatu() {
        int n = mcd(); // se calcula el mcd de la fracción
        zenbakitzailea /= n;
        izendatzailea /= n;
    }

   
    public static void zatikiaOrdenatu(Zatikia[] zatikiak) {

        for (int x = 0; x < zatikiak.length; x++) {
            for (int y = x + 1; y < zatikiak.length; y++) {

                Zatikia temp;

                if (zatikiak[x].hamartarBaliokidea() >= zatikiak[y].hamartarBaliokidea()) {

                    temp = new Zatikia(zatikiak[x].zenbakitzailea, zatikiak[x].izendatzailea);

                    zatikiak[x] = new Zatikia(zatikiak[y].zenbakitzailea, zatikiak[y].izendatzailea);
                    zatikiak[y] = new Zatikia(temp.zenbakitzailea, temp.izendatzailea);

                }

            }
        }

        for (int x = 0; x < zatikiak.length; x++) {

            System.out.println(zatikiak[x]);

        }

    }

    public boolean isBaliokidea(Zatikia besteZatikiBat) {

        boolean baliokidea = false;

        if (this.hamartarBaliokidea() == besteZatikiBat.hamartarBaliokidea()) {

            baliokidea = true;

        }

        return baliokidea;

    }

}
