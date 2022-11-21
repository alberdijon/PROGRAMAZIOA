package random;

import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        
        String[] izenak;
        int luzeera;
        int irabazlea;

        Scanner in = new Scanner(System.in);

        System.out.println("Zenbat izen satu nahi dituzu");
        luzeera = in.nextInt();

        izenak = new String[luzeera];

        System.out.println("Sartu izenak espazioekin banatuta");
        for(int x = 0; x < luzeera; x++){
            izenak[x] = in.next();
        }
        in.close();

        irabazlea = (int)(Math.random() * luzeera);

        System.out.println("irabazlea: " + izenak[irabazlea] + " da.");

        

    }
}
