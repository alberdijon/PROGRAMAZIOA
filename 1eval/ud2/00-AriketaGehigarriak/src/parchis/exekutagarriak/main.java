package parchis.exekutagarriak;

import java.util.Scanner;

import parchis.model.casilla;
import parchis.model.dado;
import parchis.model.ficha;

public class main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int jokalari_zenb;
        ficha [] fichas;
        dado dado1 = new dado();
        dado dado2 = new dado();
        int turno = 1;
        boolean irabazi = false;

        casilla[] normalak = new casilla[56];

        for (int x = 0; x < normalak.length; x++) {
            if ((x == 5) || (x == 12) || (x == 17) || (x == 22) || (x == 29) || (x == 34) || (x == 39) || (x == 46)
                    || (x == 51) || (x == 56) || (x == 63)) {

                normalak[x] = new casilla("normala", (x + 1));

            } else {
                normalak[x] = new casilla("normala", x);

            }

        }

        casilla[] grisak = new casilla[8];

        grisak[0] = new casilla("grisa", 12);
        grisak[1] = new casilla("grisa", 17);
        grisak[2] = new casilla("grisa", 29);
        grisak[3] = new casilla("grisa", 34);
        grisak[4] = new casilla("grisa", 46);
        grisak[5] = new casilla("grisa", 51);
        grisak[6] = new casilla("grisa", 63);
        grisak[7] = new casilla("grisa", 68);

        casilla[] etxeak = new casilla[4];

        etxeak[0] = new casilla("horia", 5);
        etxeak[1] = new casilla("urdina", 22);
        etxeak[2] = new casilla("gorria", 39);
        etxeak[3] = new casilla("berdea", 56);

        casilla[] horiak = new casilla[4];

        horiak[0] = new casilla("horia", 69);
        horiak[1] = new casilla("horia", 70);
        horiak[2] = new casilla("horia", 71);
        horiak[3] = new casilla("horia", 72);
        horiak[4] = new casilla("horia", 73);
        horiak[5] = new casilla("horia", 74);
        horiak[6] = new casilla("horia", 75);

        casilla[] urdinak = new casilla[4];

        urdinak[0] = new casilla("urdina", 77);
        urdinak[1] = new casilla("urdina", 78);
        urdinak[2] = new casilla("urdina", 79);
        urdinak[3] = new casilla("urdina", 80);
        urdinak[4] = new casilla("urdina", 81);
        urdinak[5] = new casilla("urdina", 82);
        urdinak[6] = new casilla("urdina", 83);

        casilla[] gorriak = new casilla[4];

        gorriak[0] = new casilla("gorria", 85);
        gorriak[1] = new casilla("gorria", 86);
        gorriak[2] = new casilla("gorria", 87);
        gorriak[3] = new casilla("gorria", 88);
        gorriak[4] = new casilla("gorria", 89);
        gorriak[5] = new casilla("gorria", 90);
        gorriak[6] = new casilla("gorria", 91);

        casilla[] berdeak = new casilla[4];

        berdeak[0] = new casilla("berdea", 93);
        berdeak[1] = new casilla("berdea", 94);
        berdeak[2] = new casilla("berdea", 95);
        berdeak[3] = new casilla("berdea", 96);
        berdeak[4] = new casilla("berdea", 97);
        berdeak[5] = new casilla("berdea", 98);
        berdeak[6] = new casilla("berdea", 99);

        casilla[] erdikoak = new casilla[4];

        erdikoak[0] = new casilla("horia", 76);
        erdikoak[1] = new casilla("urdina", 84);
        erdikoak[2] = new casilla("gorria", 92);
        erdikoak[3] = new casilla("berdea", 100);

        do{

            System.out.println("Zenbat jokalari?");
            jokalari_zenb = in.nextInt();

        }while((jokalari_zenb >= 2) || (jokalari_zenb <= 4));

        fichas = new ficha [jokalari_zenb];

        for(int x = 0; x < jokalari_zenb; x++){

            String col;
            if( x == 0){

                col = "horia";

            }else if( x == 1){

                col = "urdina";

            }else if( x == 2){

                col = "gorria";

            }else{

                col = "berdea";

            }

            fichas[x] = new ficha(col, 0);

        }

        while(irabazi == false){

            System.out.println(turno + ". jokalariaren aldia");

        }

        in.close();

    }
}
