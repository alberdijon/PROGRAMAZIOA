package random;

import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {
        
        char bota = 'b';
        int dado1;
        int gehiketa = 0;

        Scanner in = new Scanner(System.in);



      
        while(bota == 'b'){
            System.out.print("Dadoa bota nahi duzu?");
            bota = in.next().charAt(0);

            if( bota == 'b'){
                dado1 = (int)(Math.random()  * 6 + 1);
                if(dado1 == 5){
    
                    System.out.println(dado1 + " => Zorionak. Fitxa bat atera dezakezu etxetik.");
                    gehiketa += dado1;
                }else{
                    gehiketa += dado1;
                    System.out.println(dado1 + " => Txarto bez.");
                }
            }else{
                System.out.println(gehiketa + " kasilla aurreratu dituzu.");
            }
    
        } 

        in.close();

    }
}
