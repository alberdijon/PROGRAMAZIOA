package random;

import java.util.Scanner;


public class Prog1 {
    public static void main(String[] args) {

        System.out.printf("%6s %10s %10s %10s \n", "Math.random()", "Bitarra", "Txampona", "dadoa");
        System.out.println("================");

        for(int x = 0; x < 20; x++){
            double ausazkoa = Math.random();

            System.out.printf("%2d) %.20f", x, ausazkoa);
            if(ausazkoa >= 0.5){
                System.out.printf("%10d %12s", 1, "Gurutzea");
            }else{
                System.out.printf("%10d %12s", 0, "Aurpegia");
            }

            System.out.printf("%10d\n", (int)(ausazkoa * 6 + 1));

        }
    }
}
