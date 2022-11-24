package model;

import java.util.Arrays;

public class Zatikia {
    private int zenbakitzailea;
    private int izendatzailea;

    public Zatikia(int zenb, int izend) {

        izendatzailea = izend;
        zenbakitzailea = zenb;

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
        zenbak = (zat1.getZenbakitzailea() * zat2.getIzendatzailea()) + (zat2.getZenbakitzailea() * zat1.getIzendatzailea());

        batuketa = new Zatikia(zenbak, izend);

        return batuketa;

    }

    public  void batu(Zatikia bezteZatBat) {

        int izend;
        int zenbak;

        izend = this.getIzendatzailea() * bezteZatBat.getIzendatzailea();
        zenbak = this.getZenbakitzailea() * bezteZatBat.getIzendatzailea() + bezteZatBat.getIzendatzailea() * this.getIzendatzailea();

        this.setIzendatzailea(izend);
        this.setZenbakitzailea(zenbak);

    }

    public double hamartarBaliokidea(){
        double baliokidea;

        baliokidea = zenbakitzailea / izendatzailea;

        return baliokidea;

    }
    
    public boolean isBiggerThan(Zatikia besteZatikiBat){

        boolean haundiagoa = false;

        if(this.hamartarBaliokidea() > besteZatikiBat.hamartarBaliokidea()){
            haundiagoa  = true;
        }

        return haundiagoa;

    }

    public int mcd() {
        int u = Math.abs(zenbakitzailea); //valor absoluto del numerador
        int v = Math.abs(izendatzailea); //valor absoluto del denominador
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
        int n = mcd(); //se calcula el mcd de la fracción
        zenbakitzailea /=  n;
        izendatzailea /=  n;
    }

    public Zatikia(String zatIdatzia){

        int barraLen = zatIdatzia.indexOf("/");
        int strLen = zatIdatzia.length();

        String strGoikoa = zatIdatzia.substring(0, barraLen);
        String strBehekoa = zatIdatzia.substring(barraLen + 1, strLen);

        int zenbakitzailea = Integer.parseInt(strGoikoa);
     
        int izendatzailea = Integer.parseInt(strBehekoa);

        //Integer.toString(strGoikoa);
        this.izendatzailea = izendatzailea;
        this.zenbakitzailea = zenbakitzailea;
    }


    public static void zatikiaOrdenatu(Zatikia[] zatikiak){

       /* Zatikia moment = new Zatikia(5,5);

        for(int x = 1; x < zatikiak.length; x++){

            for(int y = x; y >= 1; y--){

                if(zatikiak [x].isBiggerThan(zatikiak[x -1])){

                    moment.setIzendatzailea(zatikiak[x].getIzendatzailea());
                    moment.setZenbakitzailea(zatikiak[x].getZenbakitzailea());

                    if(moment.isBiggerThan(zatikiak[y -1])){

                        zatikiak[y].setIzendatzailea(zatikiak[y-1].getIzendatzailea());
                        zatikiak[y].setZenbakitzailea(zatikiak[y-1].getZenbakitzailea());

                        zatikiak[y-1].setIzendatzailea(moment.getIzendatzailea());
                        zatikiak[y-1].setZenbakitzailea(moment.getZenbakitzailea());

                    }

                }

            }
           

        }

        for(int x = 0; x < zatikiak.length; x++){

            System.out.println(zatikiak[x]);

        }
        */ 

        for(int x = 0; x < zatikiak.length; x++){
            for(int y = x + 1; y < zatikiak.length; y ++ ){

                Zatikia temp;

                if(zatikiak[x].hamartarBaliokidea() >= zatikiak[y].hamartarBaliokidea()){

                    temp = new Zatikia(zatikiak[x].zenbakitzailea, zatikiak[x].izendatzailea);

                    zatikiak[x] = new Zatikia(zatikiak[y].zenbakitzailea, zatikiak[y].izendatzailea);
                    zatikiak[y] = new Zatikia(temp.zenbakitzailea, temp.izendatzailea);

                }

            }
        }

        
        for(int x = 0; x < zatikiak.length; x++){

            System.out.println(zatikiak[x]);

        }

    }

}
