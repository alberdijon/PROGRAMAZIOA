package model;

import java.util.ArrayList;

public class Selekzioa {
    
    private ArrayList<Kidea> kideak;
    private Nongoa nongoa;

    public Selekzioa(Nongoa nongoa, ArrayList<Kidea> kideak){

        this.nongoa = nongoa;
        this.kideak = kideak;

    }

    public String[] getKideenIzenak(){

        String[] izenak = new String[kideak.size()];
        for(int x  = 0; x < kideak.size(); x++){
            izenak[x] = kideak.get(x).getIzena();
        }

        return izenak;

    }

    public void kideakBistaratu(){

        for(int x = 0; x < kideak.size(); x++){
            System.out.println(kideak.get(x));
        }

        System.out.println("-----------");
        int totala = 0;
        for(int x = 0; x < kideak.size(); x++){
            if(kideak.get(x).getClass().equals("Atezaina")){
               // totala += kideak.get(x).getJasotakoGolak();
            }
        }
        System.out.println("kide kopurua: " + kideak.size() + "    Jasotako golak: " + totala);

    }

    public int kideBerria(Kidea k){

        boolean sartuta = false;
        boolean badago = false;
        int idea = 1;

        while(!sartuta){
            for(int x = 0; x < kideak.size(); x++){
                if(idea  == kideak.get(x).getId()){
                    badago = true;
                }
                if((x == kideak.size() - 1) && (badago  == false)){
                    sartuta = true;
                    k.setId(idea);
                }
            }

            idea++;
            badago = false;

        }

        kideak.add(k);

        return k.getId();

    }

    public int kideaEzabatu(int id){

        boolean kendu = false;

        for(int x = 0; x < kideak.size(); x++){
            if(id  == kideak.get(x).getId()){
                kideak.remove(x);
                kendu = true;
            }
        }

        if(kendu  == true){
            return 1;
        }else{
            return 2;
        }

    }

}
