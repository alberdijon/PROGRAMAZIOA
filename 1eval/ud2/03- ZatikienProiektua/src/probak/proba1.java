package probak;

import java.util.Scanner;

import model.Zatikia;

public class proba1 {
    public static void main(String[] args) {

        Zatikia[] zatikak;
        int zenbat;
        int izend;
        int zenb;
        Scanner in = new Scanner(System.in);
        String adpa = "3/4";
        Zatikia zat1;
        zat1 = new Zatikia(adpa);
        System.out.println(zat1);

        System.out.println("zenbat zatiki sartu nahi dituzu");
        zenbat = in.nextInt();

        zatikak = new Zatikia [zenbat];

        for (int x = 0; x < zenbat; x++) {

            System.out.println("izendatzailea");
            zenb = in.nextInt();

            
            System.out.println("izendatzailea");
            izend = in.nextInt();

            zatikak[x] = new Zatikia(zenb, izend);

        }

        Zatikia.zatikiaOrdenatu(zatikak);

        in.close();

    
        
        

    }
}
