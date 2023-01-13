package executagarriak;

import java.util.ArrayList;
import java.util.Arrays;

import model.MyPoint;

public class TestMyPoint {
    public static void main(String[] args) {

        System.out.println("a) Hiru puntu sortu:");
        
        MyPoint p0 = new MyPoint(0,0);
        MyPoint p1 = new MyPoint(2,1);
        MyPoint p2 = new MyPoint(4,0);

        System.out.println("p0 => " + p0);
        System.out.println("p1 => " + p1);
        System.out.println("p2 => " + p2);

        System.out.println();
        System.out.println();

        System.out.println("b) Distantziak koordenatu-jatorriarekiko:");

        double dp0 = p0.distance();
        double dp1 = p1.distance();
        double dp2 = p2.distance();

        System.out.println(p0 + "  =>" + dp0);
        System.out.println(p1 + "  =>" + dp1);
        System.out.println(p2 + "  =>" + dp2);

        System.out.println();
        System.out.println();

        System.out.println("c) Distantziak euren artean:");

        double dp0p1 = p0.distance(p1);
        double dp0p2 = p0.distance(p2);
        double dp1p2 = p1.distance(p2);

        System.out.println("p0tik p1ra  => " + dp0p1);
        System.out.println("p0tik p2ra  => " + dp0p2);
        System.out.println("p1tik p2ra  => " + dp1p2);

        System.out.println();
        System.out.println();

        System.out.println("d) Sortu 10 puntuko array bat. Eta automatikoki bete:");
        MyPoint puntuenArraya[] = new MyPoint[10];

        for (int x = 0; x < 10; x++) {
              MyPoint pBakoitza = new MyPoint(x + 1, x + 1);
              puntuenArraya[x] = pBakoitza;
        }
        
        System.out.println(Arrays.toString(puntuenArraya));

        System.out.println();
        System.out.println();

        System.out.println("e) Sortu 100 puntuko arrayLista:");
        ArrayList<MyPoint> puntuenArrayLista = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
              MyPoint pBakoitza = new MyPoint(i, i);
              puntuenArrayLista.add (pBakoitza);
        }
        
        System.out.println(puntuenArrayLista);

        System.out.println();
        System.out.println();

        System.out.println("f) Sortu ausazko 5 puntuko sorta (0-9 tartean).");
            MyPoint puntuenArrayTxiki[] = new MyPoint[5];
            for(int i = 0; i < 5; i++){
                  MyPoint pBakoitza = new MyPoint((int) (Math.random() * (10)), (int) (Math.random() * (9)));
                  puntuenArrayTxiki[i] = pBakoitza;
            }
            
            System.out.println(Arrays.toString(puntuenArrayTxiki));

    }
}
