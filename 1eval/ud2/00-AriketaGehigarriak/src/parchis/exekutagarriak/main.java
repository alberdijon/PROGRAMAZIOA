package parchis.exekutagarriak;

import java.util.Scanner;

import parchis.model.Casilla;
import parchis.model.Dado;
import parchis.model.Ficha;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.print("\033[H\033[2J");  
        System.out.flush();  

        String red = "\033[31m";
        String green = "\033[32m";
        String yellow = "\033[33m";
        String blue = "\033[34m";
        String reset = "\u001B[0m";

        String[] colores = new String[5];
        colores[0] = yellow;
        colores[1] = blue;
        colores[2] = red;
        colores[3] = green;
        colores[4] = reset;

        Scanner in = new Scanner(System.in);

        int jokalari_zenb;
        int turno = 1;
        int suma;
        int pos_mom;
        int cuenta = 0;
        char bota = 'p';
        boolean jan = false;
        boolean irabazi = false;
        boolean[] fuera = new boolean[4];
        boolean[] vuelta = new boolean[4];
        Ficha[] fichas;
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();

        for (int x = 0; x < 4; x++) {
            fuera[x] = false;
            vuelta[x] = false;

        }

        Casilla[] normalak = new Casilla[68];

        for (int x = 1; x <= 68; x++) {

            normalak[x - 1] = new Casilla("normala", x);

        }

        Casilla[] horiak = new Casilla[7];

        horiak[0] = new Casilla("horia", 69);
        horiak[1] = new Casilla("horia", 70);
        horiak[2] = new Casilla("horia", 71);
        horiak[3] = new Casilla("horia", 72);
        horiak[4] = new Casilla("horia", 73);
        horiak[5] = new Casilla("horia", 74);
        horiak[6] = new Casilla("horia", 75);

        Casilla[] urdinak = new Casilla[7];

        urdinak[0] = new Casilla("urdina", 77);
        urdinak[1] = new Casilla("urdina", 78);
        urdinak[2] = new Casilla("urdina", 79);
        urdinak[3] = new Casilla("urdina", 80);
        urdinak[4] = new Casilla("urdina", 81);
        urdinak[5] = new Casilla("urdina", 82);
        urdinak[6] = new Casilla("urdina", 83);

        Casilla[] gorriak = new Casilla[7];

        gorriak[0] = new Casilla("gorria", 85);
        gorriak[1] = new Casilla("gorria", 86);
        gorriak[2] = new Casilla("gorria", 87);
        gorriak[3] = new Casilla("gorria", 88);
        gorriak[4] = new Casilla("gorria", 89);
        gorriak[5] = new Casilla("gorria", 90);
        gorriak[6] = new Casilla("gorria", 91);

        Casilla[] berdeak = new Casilla[7];

        berdeak[0] = new Casilla("berdea", 93);
        berdeak[1] = new Casilla("berdea", 94);
        berdeak[2] = new Casilla("berdea", 95);
        berdeak[3] = new Casilla("berdea", 96);
        berdeak[4] = new Casilla("berdea", 97);
        berdeak[5] = new Casilla("berdea", 98);
        berdeak[6] = new Casilla("berdea", 99);

        Casilla[] erdikoak = new Casilla[4];

        erdikoak[0] = new Casilla("horia", 76);
        erdikoak[1] = new Casilla("urdina", 84);
        erdikoak[2] = new Casilla("gorria", 92);
        erdikoak[3] = new Casilla("berdea", 100);

        do {

            System.out.println(colores[4] + "Zenbat jokalari?");
            jokalari_zenb = in.nextInt();

        } while ((jokalari_zenb < 2) || (jokalari_zenb > 4));

        fichas = new Ficha[jokalari_zenb];

        for (int x = 0; x < jokalari_zenb; x++) {

            String col;
            if (x == 0) {

                col = "horia";

            } else if (x == 1) {

                col = "urdina";

            } else if (x == 2) {

                col = "gorria";

            } else {

                col = "berdea";

            }

            fichas[x] = new Ficha(col, 0);

        }

        while (irabazi == false) {

            System.out.println(colores[turno - 1] + turno + ". jokalariaren aldia");

            System.out.println(" botatzea nahi duzu edo hurrengo jokalariari txanda eman? (B/P)");
            bota = in.next().charAt(0);

            if ((bota == 'B') || (bota == 'b')) {
                System.out.println("Dadoak botatzen");

                for (int x = 0; x < 5; x++) {
                    int tiempo = 210;
                    System.out.print("clack ");

                    if (x == 0) {
                        Thread.sleep(tiempo);
                    } else if (x == 1) {
                        tiempo -= 60;
                        Thread.sleep(tiempo);
                    } else {
                        tiempo -= 30;
                        Thread.sleep(tiempo);
                    }

                }

                System.out.println();

                dado1.tirar();
                dado2.tirar();

                System.out.println("Lehen dadoaren balioa:" + dado1.getValor());
                System.out.println("Bigarren dadoaren balioa:" + dado2.getValor());

                if (fuera[turno - 1] == false) {
                    if ((dado1.getValor() == 5) || (dado2.getValor() == 5) || (dado1.getValor() + dado2.getValor() == 5)) {

                        if (turno == 1) {

                            fichas[turno - 1].setPosicion(5);
                            fuera[turno - 1] = true;

                        } else if (turno == 2) {

                            fichas[turno - 1].setPosicion(22);
                            fuera[turno - 1] = true;

                        } else if (turno == 3) {

                            fichas[turno - 1].setPosicion(39);
                            fuera[turno - 1] = true;

                        } else {

                            fichas[turno - 1].setPosicion(56);
                            fuera[turno - 1] = true;

                        }

                    } else {
                        System.out.println("Suerte txarra hurrengo txandan suerte obea izango duzu");
                    }
                } else {

                    suma = dado1.getValor() + dado2.getValor();
                    fichas[turno - 1].aurreratu(suma);

                    do {

                        if (turno == 1) {
                            if ((fichas[turno - 1].getPosizioa() > 68) && (vuelta[turno - 1] == false)) {
                                pos_mom = horiak[fichas[turno - 1].getPosizioa() - 69].getZenbakia();
                                fichas[turno - 1].setPosicion(pos_mom);
                                vuelta[turno - 1] = true;
                            } else if ((vuelta[turno - 1] == true) && (fichas[turno - 1].getPosizioa() >= 75)) {
                                irabazi = true;
                                System.out.println("Zorionak irabazi egin duzu");

                                for(int x = 0; x < 3; x++){

                                    System.out.println("clap");

                                }

                                Thread.sleep(300);

                            }

                            for (int x = 0; x < fichas.length; x++) {

                                if ((fichas[0].getPosizioa() == fichas[x].getPosizioa()) && (x != 0)) {

                                    fichas[x].setPosicion(0);
                                    fichas[0].aurreratu(20);
                                    System.out.println("Oso ondo jokalari " + fichas[x].getKolorea() + "ren ficha jan duzu. \n Bera etxera bueltatuko da eta zuk 20 casilla aurreratuko dituzu");
                                    jan = true;

                                    if(fichas[0].getPosizioa() >= 75){
                                        irabazi = true;
                                        System.out.println("Zorionak irabazi egin duzu");
        
                                        for(int y = 0; y < 3; y++){
        
                                            System.out.println("clap");
        
                                        }
        
                                        Thread.sleep(300);
                                    }

                                } else {

                                    jan = false;
                                }

                            }

                        } else if (turno == 2) {
                            if ((fichas[turno - 1].getPosizioa() > 68) && (vuelta[turno - 1] == false)) {
                                fichas[turno - 1].setPosicion((fichas[turno - 1].getPosizioa() - 68));
                                vuelta[turno - 1] = true;
                            } else if ((vuelta[turno - 1] == true) && (fichas[turno - 1].getPosizioa() >= 83)) {
                                irabazi = true;
                                System.out.println("Zorionak irabazi egin duzu");

                                for(int x = 0; x < 3; x++){

                                    System.out.println("clap");

                                }

                                Thread.sleep(300);

                            } else if ((fichas[turno - 1].getPosizioa() > 17) && (vuelta[turno - 1] == true)) {
                                fichas[turno - 1].setPosicion(urdinak[fichas[turno - 1].getPosizioa() - 18].getZenbakia());
                            }

                            for (int x = 0; x < fichas.length; x++) {

                                if ((fichas[1].getPosizioa() == fichas[x].getPosizioa()) && (x != 1)) {

                                    fichas[x].setPosicion(0);
                                    fichas[1].aurreratu(20);
                                    System.out.println("Oso ondo jokalari " + fichas[x].getKolorea() + "ren ficha jan duzu. \n Bera etxera bueltatuko da eta zuk 20 casilla aurreratuko dituzu");
                                    jan = true;

                                    if((fichas[1].getPosizioa() >= 25) && (vuelta[1] == true)){
                                        irabazi = true;
                                        System.out.println("Zorionak irabazi egin duzu");
        
                                        for(int y = 0; y < 3; y++){
        
                                            System.out.println("clap");
        
                                        }
        
                                        Thread.sleep(300);
                                    }

                                } else {

                                    jan = false;
                                }

                            }

                        } else if (turno == 3) {
                            if ((fichas[turno - 1].getPosizioa() > 68) && (vuelta[turno - 1] == false)) {
                                fichas[turno - 1].setPosicion((fichas[turno - 1].getPosizioa() - 68));
                                vuelta[turno - 1] = true;
                            } else if ((vuelta[turno - 1] == true) && (fichas[turno - 1].getPosizioa() >= 91)) {
                                irabazi = true;
                                System.out.println("Zorionak irabazi egin duzu");

                                for(int x = 0; x < 3; x++){

                                    System.out.println("clap");

                                }

                                Thread.sleep(300);

                            } else if ((fichas[turno - 1].getPosizioa() > 34) && (vuelta[turno - 1] == true)) {
                                fichas[turno - 1].setPosicion(gorriak[fichas[turno - 1].getPosizioa() - 35].getZenbakia());
                            }


                            for (int x = 0; x < fichas.length; x++) {

                                if ((fichas[2].getPosizioa() == fichas[x].getPosizioa()) && (x != 2)) {

                                    fichas[x].setPosicion(0);
                                    fichas[2].aurreratu(20);
                                    System.out.println("Oso ondo jokalari " + fichas[x].getKolorea() + "ren ficha jan duzu. \n Bera etxera bueltatuko da eta zuk 20 casilla aurreratuko dituzu");
                                    jan = true;

                                    if((fichas[2].getPosizioa() >= 42) && (vuelta[2] == true)){
                                        irabazi = true;
                                        System.out.println("Zorionak irabazi egin duzu");
        
                                        for(int y = 0; y < 3; y++){
        
                                            System.out.println("clap");
        
                                        }
        
                                        Thread.sleep(300);
                                    }                                    

                                } else {

                                    jan = false;
                                }

                            }

                        } else if (turno == 4) {
                            if ((fichas[turno - 1].getPosizioa() > 68) && (vuelta[turno - 1] == false)) {
                                fichas[turno - 1].setPosicion((fichas[turno - 1].getPosizioa() - 68));
                                vuelta[turno - 1] = true;
                            } else if ((vuelta[turno - 1] == true) && (fichas[turno - 1].getPosizioa() >= 100)) {
                                irabazi = true;
                                System.out.println("Zorionak irabazi egin duzu");

                                for(int x = 0; x < 3; x++){

                                    System.out.println("clap");

                                }

                                Thread.sleep(300);

                            } else if ((fichas[turno - 1].getPosizioa() > 51) && (vuelta[turno - 1] == true)) {
                                fichas[turno - 1].setPosicion(berdeak[fichas[turno - 1].getPosizioa() - 52].getZenbakia());
                            }


                            for (int x = 0; x < fichas.length; x++) {

                                if ((fichas[3].getPosizioa() == fichas[x].getPosizioa()) && (x != 3)) {

                                    fichas[x].setPosicion(0);
                                    fichas[3].aurreratu(20);
                                    System.out.println("Oso ondo jokalari " + fichas[x].getKolorea() + "ren ficha jan duzu. \n Bera etxera bueltatuko da eta zuk 20 casilla aurreratuko dituzu");
                                    jan = true;

                                    if((fichas[3].getPosizioa() >= 59) && (vuelta[3] == true)){
                                        irabazi = true;
                                        System.out.println("Zorionak irabazi egin duzu");
        
                                        for(int y = 0; y < 3; y++){
        
                                            System.out.println("clap");
        
                                        }
        
                                        Thread.sleep(300);
                                    }

                                } else {

                                    jan = false;
                                }

                            }

                        }
                    } while (jan == true);

                }

                System.out.println(turno + ". jokalaria " + fichas[turno - 1].getPosizioa() + ". kasillan dago " + colores[4]);

                Thread.sleep(500);
                System.out.println("\n \n");

                if (dado1.getValor() == dado2.getValor()) {
                    if (cuenta == 3) {
                        fichas[turno - 1].setPosicion(0);
                        cuenta = 0;
                        System.out.println("Suerte txarra hiru aldiz atera duzu bi dado berdin etxera bueltatuko da");
                        if (turno == jokalari_zenb) {

                            turno = 1;

                        } else {
                            turno++;
                        }
                    } else {

                        System.out.println("Oso ondo bi dadoen balioak berdinak direnez berriro botatzen duzu");
                        cuenta++;

                    }

                } else if (turno == jokalari_zenb) {

                    turno = 1;
                    cuenta = 0;

                } else {

                    turno++;
                    cuenta = 0;

                }

            } else {

                if (turno == jokalari_zenb) {

                    turno = 1;

                } else {

                    turno++;

                }

            }

        }

        in.close();

    }
}