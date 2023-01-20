package geometriaazterketa;

import java.text.DecimalFormat;
import java.util.Scanner;

import model.MyCircle;
import model.MyPoint;
import model.MyRectangle;
import model.MyTriangle;

public class GeometriaAzterketa {
    private static int nota;

    public static boolean galdera1(){

        int x = (int)(Math.random()*(10));
        int y = (int)(Math.random()*(10));
        int x2 = (int)(Math.random()*(10));
        int y2 = (int)(Math.random()*(10));
        boolean ondo;
        MyPoint lehenengoa = new MyPoint(x,y);
        MyPoint bigarrena = new MyPoint(x2,y2);
        double distantziaER = lehenengoa.distance(bigarrena);
        int erantzuna;
        Scanner in = new Scanner(System.in);

        System.out.println("Topatu bigarren puntuaren 'Y'-a  " );
        System.out.println("Lehen puntua: " + lehenengoa);
        System.out.println("Bigarren puntuko X-a" + x2);
        System.out.println("Bien arteko distantzia: " + distantziaER);
        System.out.println("Sartu bigarren puntuko y-a");
        erantzuna = in.nextInt();

        in.close();

        if(erantzuna == y2)
            ondo = true;
    
        else
            ondo = false;
        
        return ondo;
    }

    public static boolean galdera2(){

        int x = (int)(Math.random()*(10));
        int y = (int)(Math.random()*(10));
        int x2 = (int)(Math.random()*(10));
        int y2 = (int)(Math.random()*(10));
        boolean ondo;
        MyPoint lehenengoa = new MyPoint(x,y);
        MyPoint bigarrena = new MyPoint(x2,y2);
        double distantziaER = lehenengoa.distance(bigarrena);
        double erantzuna;
        Scanner in = new Scanner(System.in);

        System.out.println("Topatu bi puntuen distantzia  " );
        System.out.println("Lehen puntua: " + lehenengoa);
        System.out.println("Bigarren puntua" + bigarrena);
        System.out.println("Sartu bi puntuen harteko distantzia");
        erantzuna = in.nextDouble();
        DecimalFormat formato1 = new DecimalFormat("#.00");
        formato1.format(distantziaER);
        formato1.format(erantzuna);


        in.close();

        if(erantzuna == distantziaER)
            ondo = true;

        else
            ondo = false;
    
        return ondo;

    }

    public static boolean galdera3(){

        int x = (int)(Math.random()*(10));
        int y = (int)(Math.random()*(10));
        int radio = (int)(Math.random()*(10));
        MyCircle circulo = new MyCircle(x, y, radio);
        boolean ondo;
        double erantzuna;
        double area = circulo.getArea();
        Scanner in = new Scanner(System.in);

        System.out.println("Topatu zirkuluaren area " );
        System.out.println("Zirkulua: " + circulo);
        System.out.println("Sartu zirkuluaren area:");
        erantzuna = in.nextDouble();

        DecimalFormat formato1 = new DecimalFormat("#.00");
        formato1.format(area);
        formato1.format(erantzuna);

        in.close();

        if(erantzuna == area)
            ondo = true;

        else
            ondo = false;
    
        return ondo;

    }

    public static boolean galdera4(){

        int x = (int)(Math.random()*(10));
        int y = (int)(Math.random()*(10));
        int radio = (int)(Math.random()*(10));
        MyCircle circulo = new MyCircle(x, y, radio);
        boolean ondo;
        double erantzuna;
        double perimetroa = circulo.getCircunference();
        Scanner in = new Scanner(System.in);

        System.out.println("Topatu bi zirkuluaren perimetroa " );
        System.out.println("Zirkulua: " + circulo);
        System.out.println("Sartu zirkuluaren perimetroa:");
        erantzuna = in.nextDouble();

        DecimalFormat formato1 = new DecimalFormat("#.00");
        formato1.format(perimetroa);
        formato1.format(erantzuna);

        in.close();

        if(erantzuna == perimetroa)
            ondo = true;

        else
            ondo = false;
    
        return ondo;

    }

    public static boolean galdera5(){

        int x = (int)(Math.random()*(10));
        int y = (int)(Math.random()*(10));
        int xp = (int)(Math.random()*(10));
        int yp = (int)(Math.random()*(10));
        int radio = (int)(Math.random()*(10));
        MyCircle circulo = new MyCircle(x, y, radio);
        MyPoint p1 = new MyPoint(xp, yp);
        boolean ondo;
        char BE;
        boolean erantzuna;
        boolean barruan = circulo.isInside(p1);
        Scanner in = new Scanner(System.in);

        System.out.println("Esan puntua zirkuluaren barruan dagoen edo ez" );
        System.out.println("Zirkulua: " + circulo);
        System.out.println("Puntua" + p1);
        System.out.println("Sartu puntua zirkuluaren barruan dagoen edo ez (B/E):");
        BE = in.next().charAt(0);

        if(BE == 'B'){

            erantzuna = true;

        }else{

            erantzuna = false;

        }

        in.close();

        if(erantzuna == barruan)
            ondo = true;

        else
            ondo = false;
    
        return ondo;


    }

    public static boolean galdera6(){

        int x = (int)(Math.random()*(10));
        int y = (int)(Math.random()*(10));
        int x2 = (int)(Math.random()*(10));
        int y2 = (int)(Math.random()*(10));
        int x3 = (int)(Math.random()*(10));
        int y3 = (int)(Math.random()*(10));
        MyTriangle t1 = new MyTriangle(x, x2, x3, y, y2, y3);
        boolean ondo;
        double perimetroa = t1.getPerimeter();
        double erantzuna;

        Scanner in = new Scanner(System.in);

        System.out.println("Esan triangeluaren perimetroa" );
        System.out.println("Triangelua" + t1);
        System.out.println("Sartu triangeluaren perimetroa:");
        erantzuna = in.nextDouble();

        DecimalFormat formato1 = new DecimalFormat("#.00");
        formato1.format(perimetroa);
        formato1.format(erantzuna);

        in.close();

        if(erantzuna == perimetroa)
            ondo = true;

        else
            ondo = false;
    
        return ondo;


    }

    public static boolean galdera7(){

        int x = (int)(Math.random()*(10));
        int y = (int)(Math.random()*(10));
        int x2 = (int)(Math.random()*(10));
        int y2 = (int)(Math.random()*(10));
        int x3 = (int)(Math.random()*(10));
        int y3 = (int)(Math.random()*(10));
        MyTriangle t1 = new MyTriangle(x, x2, x3, y, y2, y3);
        boolean ondo;
        String mota = t1.getType();
        String erantzuna;

        Scanner in = new Scanner(System.in);

        System.out.println("Esan triangeluaren mota" );
        System.out.println("Triangelua" + t1);
        System.out.println("Sartu triangeluaren mota:  (Aldekidea/Isoszelea/Eskalenoa)");
        erantzuna = in.next();


        in.close();

        if(erantzuna.equalsIgnoreCase(mota))
            ondo = true;

        else
            ondo = false;
    
        return ondo;


    }

    public static boolean galdera8(){

        int x = (int)(Math.random()*(10));
        int y = (int)(Math.random()*(10));
        int x2 = (int)(Math.random()*(10));
        int y2 = (int)(Math.random()*(10));
        MyPoint p1 = new MyPoint(x,y);
        MyPoint p2 = new MyPoint(x2,y2);
        MyRectangle r1 = new MyRectangle(p1, p2);
        boolean ondo;
        double azalera = r1.getAzalera();
        double erantzuna;

        Scanner in = new Scanner(System.in);

        System.out.println("Esan karratuaren azalera" );
        System.out.println("Karratua" + r1);
        System.out.println("Sartu karratuaren azalera:");
        erantzuna = in.nextDouble();

        DecimalFormat formato1 = new DecimalFormat("#.00");
        formato1.format(azalera);
        formato1.format(erantzuna);


        in.close();

        if(azalera == erantzuna)
            ondo = true;

        else
            ondo = false;
    
        return ondo;


    }

    public static boolean galdera9(){

        int x = (int)(Math.random()*(10));
        int y = (int)(Math.random()*(10));
        int x2 = (int)(Math.random()*(10));
        int y2 = (int)(Math.random()*(10));
        MyPoint p1 = new MyPoint(x,y);
        MyPoint p2 = new MyPoint(x2,y2);
        MyRectangle r1 = new MyRectangle(p1, p2);
        boolean ondo;
        double azalera = r1.getAzalera();
        double erantzuna;

        Scanner in = new Scanner(System.in);

        System.out.println("Esan karratuaren azalera" );
        System.out.println("Karratua" + r1);
        System.out.println("Sartu karratuaren azalera:");
        erantzuna = in.nextDouble();

        DecimalFormat formato1 = new DecimalFormat("#.00");
        formato1.format(azalera);
        formato1.format(erantzuna);

        in.close();

        if(azalera == erantzuna)
            ondo = true;

        else
            ondo = false;
    
        return ondo;


    }

    public static boolean galdera10(){

        int x = (int)(Math.random()*(10));
        int y = (int)(Math.random()*(10));
        int x2 = (int)(Math.random()*(10));
        int y2 = (int)(Math.random()*(10));
        MyPoint p1 = new MyPoint(x,y);
        MyPoint p2 = new MyPoint(x2,y2);
        MyRectangle r1 = new MyRectangle(p1, p2);
        boolean ondo;
        double perimetroa = r1.getPerimetroa();
        double erantzuna;

        Scanner in = new Scanner(System.in);

        System.out.println("Esan karratuaren perimetroa" );
        System.out.println("Karratua" + r1);
        System.out.println("Sartu karratuaren perimetroa:");
        erantzuna = in.nextDouble();

        DecimalFormat formato1 = new DecimalFormat("#.00");
        formato1.format(perimetroa);
        formato1.format(erantzuna);

        in.close();

        if(perimetroa == erantzuna)
            ondo = true;

        else
            ondo = false;
    
        return ondo;


    }

    public static boolean galdera11(){

        int x = (int)(Math.random()*(10));
        int y = (int)(Math.random()*(10));
        int radio = (int)(Math.random()*(10));
        int x2 = (int)(Math.random()*(10));
        int y2 = (int)(Math.random()*(10));
        int radio2 = (int)(Math.random()*(10));
        MyCircle c1 = new MyCircle(x, y, radio);
        MyCircle c2 = new MyCircle(x2, y2, radio2);
        boolean ondo;
        double erantzuna;
        double distantzia = c1.distance(c2);
        Scanner in = new Scanner(System.in);

        System.out.println("Topatu bi zirkuluaren harteko distantzia " );
        System.out.println("Lehen zirkulua: " + c1);
        System.out.println("Bigarren zirkulua: " + c2);
        System.out.println("Sartu bi zirkuluaren harteko distantzia:");
        erantzuna = in.nextDouble();

        DecimalFormat formato1 = new DecimalFormat("#.00");
        formato1.format(distantzia);
        formato1.format(erantzuna);

        in.close();

        if(erantzuna == distantzia)
            ondo = true;

        else
            ondo = false;
    
        return ondo;

    }

    public static boolean galdera12(){

        int x = (int)(Math.random()*(10));
        int y = (int)(Math.random()*(10));
        int radio = (int)(Math.random()*(10));
        int xt = (int)(Math.random()*(10));
        int yt = (int)(Math.random()*(10));
        int xt2 = (int)(Math.random()*(10));
        int yt2 = (int)(Math.random()*(10));
        int xt3 = (int)(Math.random()*(10));
        int yt3 = (int)(Math.random()*(10));
        MyTriangle t1 = new MyTriangle(xt, xt2, xt3, yt, yt2, yt3);
        MyCircle c1 = new MyCircle(x, y, radio);
        boolean ondo;
        Boolean erantzuna;
        char BE;
        boolean barruan;
        int xp = c1.getCenterX();
        int yp = c1.getCenterXY()[1];
        MyPoint p1 = new MyPoint(xp, yp);
        Scanner in = new Scanner(System.in);

        System.out.println("Esan triangelua zirkuluaren barruan dagoen edo ez " );
        System.out.println("Zirkulua: " + c1);
        System.out.println("Triangelua: " + t1);
        System.out.println("Sartu triangelua zirkuluaren barruan dagoen edo ez:  (B/E)");        in.close();
        BE = in.next().charAt(0);

        in.close();

        if ((c1.getRadius() >= p1.distance(t1.getV1()))||(c1.getRadius() >= p1.distance(t1.getV2()))||(c1.getRadius() >= p1.distance(t1.getV3()))) {
            
            barruan = true;

        } else {

            barruan = false;
            
        }

        if (BE == 'B') {
            erantzuna = true;
        } else {
            erantzuna = false;
        }

        if(erantzuna == barruan)
            ondo = true;

        else
            ondo = false;
    
        return ondo;

    }

    public static void main(String[] args) {
        int galdzemb;
        int[] preguntas = new int [10];
        boolean zuzena = false;
        System.out.println("Geometria azterketa");
        System.out.println("===================");
        System.out.println("Gogoratu erantzunak 2 hamartarrekin bakarrik ipintzen eta PI caractera erabili behar izatekotan, 3.1416 balioa erabili  \n\n\n");


        for(int x = 0; x < 10; x++){


            galdzemb = (int)(Math.random()*(12 + 1));


            switch (galdzemb){

                case 1:

                    for(int y = 0; y < 10; y++){
                        if(galdzemb == preguntas[y]){
                            break;
                        }
                    }

                    preguntas[x] = galdzemb;

                    System.out.println(x+1 + ". galdera:");
                    zuzena = galdera1();
                    break;

                case 2:

                    for(int y = 0; y < 10; y++){
                        if(galdzemb == preguntas[y]){
                            break;
                        }
                    }

                    preguntas[x] = galdzemb;

                    System.out.println(x+1 + ". galdera:");
                    zuzena = galdera2();
                    break;
                
                case 3:

                    for(int y = 0; y < 10; y++){
                        if(galdzemb == preguntas[y]){
                            break;
                        }
                    }

                    preguntas[x] = galdzemb;

                    System.out.println(x+1 + ". galdera:");
                    zuzena = galdera3();
                    break;

                case 4:

                    for(int y = 0; y < 10; y++){
                        if(galdzemb == preguntas[y]){
                            break;
                        }
                    }

                    preguntas[x] = galdzemb;

                    System.out.println(x+1 + ". galdera:");
                    zuzena = galdera4();
                    break;

                case 5:

                    for(int y = 0; y < 10; y++){
                        if(galdzemb == preguntas[y]){
                            break;
                        }
                    }

                    preguntas[x] = galdzemb;

                    System.out.println(x+1 + ". galdera:");
                    zuzena = galdera5();
                    break;

                case 6:

                    for(int y = 0; y < 10; y++){
                        if(galdzemb == preguntas[y]){
                            break;
                        }
                    }

                    preguntas[x] = galdzemb;

                    System.out.println(x+1 + ". galdera:");
                    zuzena = galdera6();
                    break;
                
                case 7:

                    for(int y = 0; y < 10; y++){
                        if(galdzemb == preguntas[y]){
                            break;
                        }
                    }

                    preguntas[x] = galdzemb;

                    System.out.println(x+1 + ". galdera:");
                    zuzena = galdera7();
                    break;

                case 8:

                    for(int y = 0; y < 10; y++){
                        if(galdzemb == preguntas[y]){
                            break;
                        }
                    }

                    preguntas[x] = galdzemb;

                    System.out.println(x+1 + ". galdera:");
                    zuzena = galdera8();
                    break;
                case 9:

                    for(int y = 0; y < 10; y++){
                        if(galdzemb == preguntas[y]){
                            break;
                        }
                    }

                    preguntas[x] = galdzemb;

                    System.out.println(x+1 + ". galdera:");
                    zuzena = galdera9();
                    break;

                case 10:

                    for(int y = 0; y < 10; y++){
                        if(galdzemb == preguntas[y]){
                            break;
                        }
                    }

                    preguntas[x] = galdzemb;

                    System.out.println(x+1 + ". galdera:");
                    zuzena = galdera10();
                    break;
                
                case 11:

                    for(int y = 0; y < 10; y++){
                        if(galdzemb == preguntas[y]){
                            break;
                        }
                    }

                    preguntas[x] = galdzemb;

                    System.out.println(x+1 + ". galdera:");
                    zuzena = galdera11();
                    break;

                case 12:

                    for(int y = 0; y < 10; y++){
                        if(galdzemb == preguntas[y]){
                            break;
                        }
                    }

                    preguntas[x] = galdzemb;

                    System.out.println(x+1 + ". galdera:");
                    zuzena = galdera12();
                    break;
            }

            if(zuzena == true){

                nota++;

            }

        }
    }
}
