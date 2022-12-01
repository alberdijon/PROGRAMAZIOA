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

        int zeFicha;
        int jokalari_zenb;
        int turno = 1;
        int suma;
        int pos_mom;
        int cuenta = 0;
        boolean jan = false;
        boolean irabazi = false;
        boolean [][] dentro = new boolean[4][2];
        boolean[][] fuera = new boolean[4][2];
        boolean[][] vuelta = new boolean[4][2];
        Ficha[][] fichas;
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();

        for (int x = 0; x < 4; x++) {
            fuera[x][0] = false;
            fuera[x][1] = false;
            vuelta[x][0] = false;
            vuelta[x][1] = false;
            dentro[x][0] = false;
            dentro[x][1] = false;
            


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

        fichas = new Ficha[jokalari_zenb][2];

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

            fichas[x][0] = new Ficha(col, 0);
            fichas[x][1] = new Ficha(col, 0);

        }

        while (irabazi == false) {

            System.out.println(colores[turno - 1] + turno + ". jokalariaren aldia");

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

                if ((fuera[turno - 1][0] == false) || ((fuera[turno - 1][1] == false) && ((dado1.getValor() == 5) || (dado2.getValor() == 5) || (dado1.getValor() + dado2.getValor() == 5)))) {
                    if ((dado1.getValor() == 5) || (dado2.getValor() == 5) || (dado1.getValor() + dado2.getValor() == 5)) {

                        if (turno == 1) {

                          if(fuera[turno - 1][0] == false){

                            fichas[turno - 1][0].setPosicion(5);
                            fuera[turno - 1][0] = true;
                            System.out.println(turno + ". jokalariak lehen fitxa atera du.");

                          }else{

                            
                            fichas[turno - 1][1].setPosicion(5);
                            fuera[turno - 1][1] = true;
                            System.out.println(turno + ". jokalariak bi fitxak atera ditu.");


                          }
                        } else if (turno == 2) {

                            if(fuera[turno - 1][0] == false){

                                fichas[turno - 1][0].setPosicion(22);
                                fuera[turno - 1][0] = true;
                                System.out.println(turno + ". jokalariak lehen fitxa atera du.");
    
                              }else{
    
                                
                                fichas[turno - 1][1].setPosicion(22);
                                fuera[turno - 1][1] = true;
                                System.out.println(turno + ". jokalariak bi fitxak atera ditu.");
    
    
                              }

                        } else if (turno == 3) {

                            if(fuera[turno - 1][0] == false){

                                fichas[turno - 1][0].setPosicion(39);
                                fuera[turno - 1][0] = true;
                                System.out.println(turno + ". jokalariak lehen fitxa atera du.");
    
                              }else{
    
                                
                                fichas[turno - 1][1].setPosicion(39);
                                fuera[turno - 1][1] = true;
                                System.out.println(turno + ". jokalariak bi fitxak atera ditu.");
    
    
                              }

                        } else {
                            if(fuera[turno - 1][0] == false){

                                fichas[turno - 1][0].setPosicion(56);
                                fuera[turno - 1][0] = true;
                                System.out.println(turno + ". jokalariak lehen fitxa atera du.");
    
                              }else{
    
                                
                                fichas[turno - 1][1].setPosicion(56);
                                fuera[turno - 1][1] = true;
                                System.out.println(turno + ". jokalariak bi fitxak atera ditu.");
    
    
                              }
                        }

                    } else {
                        System.out.println("Suerte txarra hurrengo txandan suerte obea izango duzu");
                    }
                } else {

                    System.out.println("Lehen fiharen posizioa: " +fichas[turno-1][0].getPosizioa());
                    System.out.println("Bigarren fiharen posizioa: " +fichas[turno-1][1].getPosizioa());

                    if((fuera[turno - 1][0]) && (fuera[turno -1][1] == true) && (dentro[turno - 1][0] != true) && (dentro[turno - 1][1] != true)){
                        do{
                            System.out.println("Ze ficha aurreratu nahi duzu?  (1/2)");
                            zeFicha = in.nextInt();
                        }while((zeFicha != 1) && (zeFicha != 2));
                    }else if(dentro[turno - 1][0] == true){
                        zeFicha = 2;
                    }else if(dentro[turno - 1][1] != true){
                        zeFicha = 1;
                    }else{
                        zeFicha = 1;
                    }

                  
                    
                    suma = dado1.getValor() + dado2.getValor();

                    if(zeFicha == 1){
                        
                        fichas[turno - 1][0].aurreratu(suma);
                        
                    }else{
                        fichas[turno - 1][1].aurreratu(suma);

                    }

                    do {
                        if (turno == 1) {
                           if(zeFicha == 1){


                            if ((fichas[turno - 1][0].getPosizioa() > 68) && (vuelta[turno - 1][0] == false)) {
                                pos_mom = horiak[fichas[turno - 1][0].getPosizioa() - 69].getZenbakia();
                                fichas[turno - 1][0].setPosicion(pos_mom);
                                vuelta[turno - 1][0] = true;
                            } else if ((vuelta[turno - 1][0] == true) && (fichas[turno - 1][0].getPosizioa() >= 75)) {
                            
                              dentro[turno - 1][zeFicha - 1] = true;
                              System.out.println(colores[4] + "Oso ondo zure fitxa bat zartu duzu horain bestea 10 kasilla aurreratuko da :)" + colores[turno - 1]);
                              fichas[turno - 1][zeFicha - 1].aurreratu(20);
                            }
                            
                            for (int x = 0; x < fichas.length; x++) {
                            
                                for(int y = 0; y < 2; y++){
                            
                                    if ((fichas[0][0].getPosizioa() == fichas[x][y].getPosizioa()) && (x != 0)) {
                            
                                        fichas[x][y].setPosicion(0);
                                        fichas[0][0].aurreratu(20);
                                        vuelta[x][y] = false;
                                        fuera[x][y] = false;
                                        System.out.println("Oso ondo jokalari " + fichas[0][0].getKolorea()  + " " + fichas[x][y].getKolorea()  +"ren ficha jan duzu. \n Bera etxera bueltatuko da eta zuk 20 casilla aurreratuko dituzu");
                                        jan = true;
                            
                                        if(fichas[0][0].getPosizioa() >= 75){

                                            dentro[turno - 1][zeFicha - 1] = true;                
                                            System.out.println(colores[4] + "Oso ondo zure fitxa bat zartu duzu horain bestea 10 kasilla aurreratuko da :)" + colores[turno - 1]);
                                            fichas[turno - 1][zeFicha - 1].aurreratu(20);

                                        }
                            
                                    }else{
                            
                                        jan = false;
                            
                                    }
                                }
                            }
                            

                           }else{                                   

                                if ((fichas[turno - 1][1].getPosizioa() > 68) && (vuelta[turno - 1][1] == false)) {
                                    pos_mom = horiak[fichas[turno - 1][1].getPosizioa() - 69].getZenbakia();
                                    fichas[turno - 1][1].setPosicion(pos_mom);
                                    vuelta[turno - 1][1] = true;
                                } else if ((vuelta[turno - 1][1] == true) && (fichas[turno - 1][1].getPosizioa() >= 75)) {

                                    dentro[turno - 1][zeFicha - 1] = true;
                                    System.out.println(colores[4] + "Oso ondo zure fitxa bat zartu duzu horain bestea 10 kasilla aurreratuko da :)" + colores[turno - 1]);
                                    fichas[turno - 1][zeFicha - 1].aurreratu(20);

                                }

                                for (int x = 0; x < fichas.length; x++) {

                                    for(int y = 0; y < 2; y++){

                                        if ((fichas[0][1].getPosizioa() == fichas[x][y].getPosizioa()) && (x != 0)) {

                                            fichas[x][y].setPosicion(0);
                                            fichas[0][1].aurreratu(20);
                                            vuelta[x][y] = false;
                                            fuera[x][y] = false;
                                            System.out.println("Oso ondo jokalari " + fichas[0][1].getKolorea()  + " " + fichas[x][y].getKolorea()  +"ren ficha jan duzu. \n Bera etxera bueltatuko da eta zuk 20 casilla aurreratuko dituzu");
                                            jan = true;

                                            if(fichas[0][1].getPosizioa() >= 75){
                                               
                                                dentro[turno - 1][zeFicha - 1] = true;
                                                System.out.println(colores[4] + "Oso ondo zure fitxa bat zartu duzu horain bestea 10 kasilla aurreratuko da :)" + colores[turno - 1]);
                                                fichas[turno - 1][zeFicha - 1].aurreratu(20);

                                            }

                                        }else{

                                            jan = false;

                                        }
                                    }
                                }

                           }

                        } else if (turno == 2) {

                           if(zeFicha == 1){

                            if ((fichas[turno - 1][0].getPosizioa() > 68) && (vuelta[turno - 1][0] == false)) {
                                fichas[turno - 1][0].setPosicion((fichas[turno - 1][0].getPosizioa() - 68));
                                vuelta[turno - 1][0] = true;
                            } else if ((vuelta[turno - 1][0] == true) && (fichas[turno - 1][0].getPosizioa() >= 83)) {
                                
                                dentro[turno - 1][zeFicha - 1] = true;
                                System.out.println(colores[4] + "Oso ondo zure fitxa bat zartu duzu horain bestea 10 kasilla aurreratuko da :)" + colores[turno - 1]);
                                fichas[turno - 1][zeFicha - 1].aurreratu(20);
                            
                            } else if ((fichas[turno - 1][0].getPosizioa() > 17) && (vuelta[turno - 1][0] == true)) {
                                fichas[turno - 1][0].setPosicion(urdinak[fichas[turno - 1][0].getPosizioa() - 18].getZenbakia());
                            }

                            for (int x = 0; x < fichas.length; x++) {

                                for(int y = 0; y < 2; y++){
                            
                                    if ((fichas[1][0].getPosizioa() == fichas[x][y].getPosizioa()) && (x != 1)) {
                            
                                        fichas[x][y].setPosicion(0);
                                        fichas[1][0].aurreratu(20);
                                        vuelta[x][y] = false;
                                        fuera[x][y] = false;
                                        System.out.println("Oso ondo jokalari " + fichas[1][0].getKolorea()  + " " + fichas[x][y].getKolorea()  +"ren ficha jan duzu. \n Bera etxera bueltatuko da eta zuk 20 casilla aurreratuko dituzu");
                                        jan = true;
                                
                                        if((fichas[1][0].getPosizioa() >= 25) && (vuelta[1][0] == true)){
                                           
                                            dentro[turno - 1][zeFicha - 1] = true;
                                            System.out.println(colores[4] + "Oso ondo zure fitxa bat zartu duzu horain bestea 10 kasilla aurreratuko da :)" + colores[turno - 1]);
                                            fichas[turno - 1][zeFicha - 1].aurreratu(20);

                                        }
                                
                                    } else {
                                
                                        jan = false;
                                    }
                            
                                }
                            
                            }

                           }else{

                            if ((fichas[turno - 1][1].getPosizioa() > 68) && (vuelta[turno - 1][1] == false)) {
                                fichas[turno - 1][1].setPosicion((fichas[turno - 1][1].getPosizioa() - 68));
                                vuelta[turno - 1][1] = true;
                            } else if ((vuelta[turno - 1][1] == true) && (fichas[turno - 1][1].getPosizioa() >= 83)) {
                              
                                dentro[turno - 1][zeFicha - 1] = true;
                                System.out.println(colores[4] + "Oso ondo zure fitxa bat zartu duzu horain bestea 10 kasilla aurreratuko da :)" + colores[turno - 1]);
                                fichas[turno - 1][zeFicha - 1].aurreratu(20);
                            
                            } else if ((fichas[turno - 1][1].getPosizioa() > 17) && (vuelta[turno - 1][1] == true)) {
                                fichas[turno - 1][1].setPosicion(urdinak[fichas[turno - 1][1].getPosizioa() - 18].getZenbakia());
                            }
                            
                            for (int x = 0; x < fichas.length; x++) {
                            
                                for(int y = 0; y < 2; y++){
                            
                                    if ((fichas[1][1].getPosizioa() == fichas[x][y].getPosizioa()) && (x != 1)) {
                            
                                        fichas[x][y].setPosicion(0);
                                        fichas[1][1].aurreratu(20);
                                        vuelta[x][y] = false;
                                        fuera[x][y] = false;
                                        System.out.println("Oso ondo jokalari " + fichas[1][0].getKolorea()  + " " + fichas[x][y].getKolorea()  +"ren ficha jan duzu. \n Bera etxera bueltatuko da eta zuk 20 casilla aurreratuko dituzu");
                                        jan = true;
                                
                                        if((fichas[1][1].getPosizioa() >= 25) && (vuelta[1][1] == true)){
                                            
                                            dentro[turno - 1][zeFicha - 1] = true;
                                            System.out.println(colores[4] + "Oso ondo zure fitxa bat zartu duzu horain bestea 10 kasilla aurreratuko da :)" + colores[turno - 1]);
                                            fichas[turno - 1][zeFicha - 1].aurreratu(20);
                                        
                                        }
                                
                                    } else {
                                
                                        jan = false;
                                    }
                            
                                }
                            
                            }

                           }

                        } else if (turno == 3) {
                             
                           if(zeFicha == 1){

                            if ((fichas[turno - 1][0].getPosizioa() > 68) && (vuelta[turno - 1][0] == false)) {
                                fichas[turno - 1][0].setPosicion((fichas[turno - 1][0].getPosizioa() - 68));
                                vuelta[turno - 1][0] = true;
                            } else if ((vuelta[turno - 1][0] == true) && (fichas[turno - 1][0].getPosizioa() >= 91)) {
                                
                                dentro[turno - 1][zeFicha - 1] = true;
                                System.out.println(colores[4] + "Oso ondo zure fitxa bat zartu duzu horain bestea 10 kasilla aurreratuko da :)" + colores[turno - 1]);
                                fichas[turno - 1][zeFicha - 1].aurreratu(20);

                            
                            } else if ((fichas[turno - 1][0].getPosizioa() > 34) && (vuelta[turno - 1][0] == true)) {
                                fichas[turno - 1][0].setPosicion(gorriak[fichas[turno - 1][0].getPosizioa() - 35].getZenbakia());
                            }

                            for (int x = 0; x < fichas.length; x++) {

                                for(int y = 0; y < 2; y++){
                            
                                    if ((fichas[2][0].getPosizioa() == fichas[x][y].getPosizioa()) && (x != 2)) {
                            
                                        fichas[x][y].setPosicion(0);
                                        fichas[2][0].aurreratu(20);
                                        vuelta[x][y] = false;
                                        fuera[x][y] = false;
                                        System.out.println("Oso ondo jokalari " + fichas[2][0].getKolorea()  + " " + fichas[x][y].getKolorea()  +"ren ficha jan duzu. \n Bera etxera bueltatuko da eta zuk 20 casilla aurreratuko dituzu");
                                        jan = true;
                                
                                        if((fichas[2][0].getPosizioa() >= 42) && (vuelta[2][0] == true)){
                                            
                                            dentro[turno - 1][zeFicha - 1] = true;
                                            System.out.println(colores[4] + "Oso ondo zure fitxa bat zartu duzu horain bestea 10 kasilla aurreratuko da :)" + colores[turno - 1]);
                                            fichas[turno - 1][zeFicha - 1].aurreratu(20);

                                        }
                                
                                    } else {
                                
                                        jan = false;
                                    }
                            
                                }
                            
                            }

                           }else{

                            if ((fichas[turno - 1][1].getPosizioa() > 68) && (vuelta[turno - 1][1] == false)) {
                                fichas[turno - 1][1].setPosicion((fichas[turno - 1][1].getPosizioa() - 68));
                                vuelta[turno - 1][1] = true;
                            } else if ((vuelta[turno - 1][1] == true) && (fichas[turno - 1][1].getPosizioa() >= 91)) {
                                
                                dentro[turno - 1][zeFicha - 1] = true;
                                System.out.println(colores[4] + "Oso ondo zure fitxa bat zartu duzu horain bestea 10 kasilla aurreratuko da :)" + colores[turno - 1]);
                                fichas[turno - 1][zeFicha - 1].aurreratu(20);

                            
                            } else if ((fichas[turno - 1][1].getPosizioa() > 34) && (vuelta[turno - 1][1] == true)) {
                                fichas[turno - 1][1].setPosicion(urdinak[fichas[turno - 1][1].getPosizioa() - 35].getZenbakia());
                            }
                            
                            for (int x = 0; x < fichas.length; x++) {
                            
                                for(int y = 0; y < 2; y++){
                            
                                    if ((fichas[2][1].getPosizioa() == fichas[x][y].getPosizioa()) && (x != 2)) {
                            
                                        fichas[x][y].setPosicion(0);
                                        fichas[2][1].aurreratu(20);
                                        vuelta[x][y] = false;
                                        fuera[x][y] = false;
                                        System.out.println("Oso ondo jokalari " + fichas[2][0].getKolorea()  + " " + fichas[x][y].getKolorea()  +"ren ficha jan duzu. \n Bera etxera bueltatuko da eta zuk 20 casilla aurreratuko dituzu");
                                        jan = true;
                                
                                        if((fichas[2][1].getPosizioa() >= 25) && (vuelta[2][1] == true)){
                                            
                                            dentro[turno - 1][zeFicha - 1] = true;
                                            System.out.println(colores[4] + "Oso ondo zure fitxa bat zartu duzu horain bestea 10 kasilla aurreratuko da :)" + colores[turno - 1]);
                                            fichas[turno - 1][zeFicha - 1].aurreratu(20);

                                        }
                                
                                    } else {
                                
                                        jan = false;
                                    }
                            
                                }
                            
                            }

                           }


                        } else if (turno == 4) {
                            if(zeFicha == 1){

                                if ((fichas[turno - 1][0].getPosizioa() > 68) && (vuelta[turno - 1][0] == false)) {
                                    fichas[turno - 1][0].setPosicion((fichas[turno - 1][0].getPosizioa() - 68));
                                    vuelta[turno - 1][0] = true;
                                } else if ((vuelta[turno - 1][0] == true) && (fichas[turno - 1][0].getPosizioa() >= 100)) {
                                    
                                    dentro[turno - 1][zeFicha - 1] = true;
                                    System.out.println(colores[4] + "Oso ondo zure fitxa bat zartu duzu horain bestea 10 kasilla aurreratuko da :)" + colores[turno - 1]);
                                    fichas[turno - 1][zeFicha - 1].aurreratu(20);

                                
                                } else if ((fichas[turno - 1][0].getPosizioa() >51) && (vuelta[turno - 1][0] == true)) {
                                    fichas[turno - 1][0].setPosicion(berdeak[fichas[turno - 1][0].getPosizioa() - 52].getZenbakia());
                                }
    
                                for (int x = 0; x < fichas.length; x++) {
    
                                    for(int y = 0; y < 2; y++){
                                
                                        if ((fichas[3][0].getPosizioa() == fichas[x][y].getPosizioa()) && (x != 3)) {
                                
                                            fichas[x][y].setPosicion(0);
                                            fichas[3][0].aurreratu(20);
                                            vuelta[x][y] = false;
                                            fuera[x][y] = false;
                                            System.out.println("Oso ondo jokalari " + fichas[3][0].getKolorea()  + " " + fichas[x][y].getKolorea()  +"ren ficha jan duzu. \n Bera etxera bueltatuko da eta zuk 20 casilla aurreratuko dituzu");
                                            jan = true;
                                    
                                            if((fichas[2][0].getPosizioa() >= 59) && (vuelta[3][0] == true)){
                                              
                                                dentro[turno - 1][zeFicha - 1] = true;
                                                System.out.println(colores[4] + "Oso ondo zure fitxa bat zartu duzu horain bestea 10 kasilla aurreratuko da :)" + colores[turno - 1]);
                                                fichas[turno - 1][zeFicha - 1].aurreratu(20);

                                            }
                                    
                                        } else {
                                    
                                            jan = false;
                                        }
                                
                                    }
                                
                                }
    
                               }else{
    
                                if ((fichas[turno - 1][1].getPosizioa() > 68) && (vuelta[turno - 1][1] == false)) {
                                    fichas[turno - 1][1].setPosicion((fichas[turno - 1][1].getPosizioa() - 68));
                                    vuelta[turno - 1][1] = true;
                                } else if ((vuelta[turno - 1][1] == true) && (fichas[turno - 1][1].getPosizioa() >= 100)) {
                                    
                                    dentro[turno - 1][zeFicha - 1] = true;
                                    System.out.println(colores[4] + "Oso ondo zure fitxa bat zartu duzu horain bestea 10 kasilla aurreratuko da :)" + colores[turno - 1]);
                                    fichas[turno - 1][zeFicha - 1].aurreratu(20);
                                
                                } else if ((fichas[turno - 1][1].getPosizioa() > 51) && (vuelta[turno - 1][1] == true)) {
                                    fichas[turno - 1][1].setPosicion(berdeak[fichas[turno - 1][1].getPosizioa() - 52].getZenbakia());
                                }
                                
                                for (int x = 0; x < fichas.length; x++) {
                                
                                    for(int y = 0; y < 2; y++){
                                
                                        if ((fichas[3][1].getPosizioa() == fichas[x][y].getPosizioa()) && (x != 3)) {
                                
                                            fichas[x][y].setPosicion(0);
                                            fichas[3][1].aurreratu(20);
                                            vuelta[x][y] = false;
                                            fuera[x][y] = false;
                                            System.out.println("Oso ondo jokalari " + fichas[3][1].getKolorea()  + " " + fichas[x][y].getKolorea()  +"ren ficha jan duzu. \n Bera etxera bueltatuko da eta zuk 20 casilla aurreratuko dituzu");
                                            jan = true;
                                    
                                            if((fichas[3][1].getPosizioa() >= 25) && (vuelta[3][1] == true)){
                                               
                                                dentro[turno - 1][zeFicha - 1] = true;
                                                System.out.println(colores[4] + "Oso ondo zure fitxa bat zartu duzu horain bestea 10 kasilla aurreratuko da :)" + colores[turno - 1]);
                                                fichas[turno - 1][zeFicha - 1].aurreratu(20);

                                            }
                                    
                                        } else {
                                    
                                            jan = false;
                                        }
                                
                                    }
                                
                                }
    
                               }
    

                        }
                    
                        
        
                    
                    } while (jan == true);

                }

               System.out.println(turno + "jokalaria: \n" + fichas[turno - 1][0].getPosizioa() + ". kasillan dauka lehen ficha. \n" + fichas[turno - 1][1].getPosizioa() + ". kasillan dauka bigarren ficha." + colores[4]);

                Thread.sleep(500);
                System.out.println("\n \n");

                if (dado1.getValor() == dado2.getValor()) {
                    cuenta++;
                    if (cuenta == 3) {
                       do{

                        System.out.println("Hiru aldiz bi dadoen balioak berdinak izan dira. Aukeratu ze ficha bueltatu nahi duzun etxera");
                        zeFicha = in.nextInt();

                       }while((zeFicha!=1) && (zeFicha != 2));

                       cuenta = 0;
                       fichas[turno-1][zeFicha - 1].setPosicion(0);
                       vuelta[turno - 1][zeFicha - 1] = false;
                       fuera[turno - 1][zeFicha - 1] = false;

                        if (turno == jokalari_zenb) {

                            turno = 1;

                        } else {
                            turno++;
                        }
                    } else {

                        System.out.println("Oso ondo bi dadoen balioak berdinak direnez berriro botatzen duzu");
                        

                    }

                } else if (turno == jokalari_zenb) {

                    turno = 1;
                    cuenta = 0;

                } else {

                    turno++;
                    cuenta = 0;

                }

                
                if((dentro[turno - 1][0] == true) && (dentro[turno - 1][1] == true)){

                    irabazi = true;
                        System.out.println("Zorionak irabazi egin duzu");
                        
                        for(int x = 0; x < 3; x++){
                        
                            System.out.println("clap");
                        
                        }
                        
                        Thread.sleep(300);

                }

        }

        in.close();

    }
}