package model;

public class Zatikia {
    private int zenbakitzailea;
    private int izendatzailea;

    public Zatikia(){

        izendatzailea = (int)Math.random();
        zenbakitzailea = (int)Math.random();

    }

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

    public static int mkt(int n1, int n2){
        int mkt=1;
        int[] fakt1 = Zatikia.faktorizatu(n1);
        int[] fakt2 = Zatikia.faktorizatu(n2);

        for(int i = 0; i < fakt1.length; i++){
            mkt *= fakt1[i];
        }
        for(int i = 0; i < fakt1.length; i++){
            for(int a = 0; a < fakt2.length; a++){
                if(fakt1[i] == fakt2[a]){
                    fakt2[a] = 1;
                    break;
                }
            }
        }
        for(int i = 0; i < fakt2.length; i++){
            mkt *= fakt2[i];
        }

        return mkt;

    }

    public static int zkh(int n1, int n2){
        int zkh = 2;
        int txikiena;

        if(n1<n2){
            txikiena = n1;
        } else {
            txikiena = n2;
        }

        while(zkh<=txikiena){
            if(n1%zkh==0 && n2%zkh==0){
                break;
            }else{
                zkh++;
            }
        }
        return zkh;
    }

    public Zatikia sinplifikatu(){
        int[] faktGoi = Zatikia.faktorizatu(this.getZenbakitzailea());
        int[] faktBehe = Zatikia.faktorizatu(this.getIzendatzailea());

        for(int i = 0; i < faktGoi.length; i++){
            for(int a = 0; a < faktBehe.length; a++){
                if(faktGoi[i] == faktBehe[a]){
                    faktBehe[a] = 1;
                    faktGoi[i] = 1;
                    break;
                }
            }
        }
        Zatikia emaitza;
        int totala = 1;
        emaitza = new Zatikia(1, 1);

        for (int i = 0; i < faktGoi.length; i++) {
            totala *= faktGoi[i];
        }
        emaitza.setZenbakitzailea(totala);

        totala = 1;

        for (int i = 0; i < faktBehe.length; i++) {
            totala *= faktBehe[i];
        }
        emaitza.setIzendatzailea(totala);

        return emaitza;
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

    public static int[] faktorizatu(int n){
        int cont = 0;
        int temp = n;
        while(temp > 1){
            for(int i = 2; i<=temp; i++){
                if(temp%i == 0){
                    temp /= i;
                    cont++;
                    break;
                }
            }
        }

        int[] emaitza = new int[cont];
        for(int a = 0; n > 1; a++){
            for(int i = 2; i<=n; i++){
                if(n%i == 0){
                    n /= i;
                    emaitza[a] = i;
                    break;
                }
            }
        }

        return emaitza;
    }

}
