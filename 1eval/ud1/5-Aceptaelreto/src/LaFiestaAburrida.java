import java.util.Scanner;

public class LaFiestaAburrida {
    public static void main(String[] args) {
        
        int cant = 0;
        String [] nombres;

        Scanner in = new Scanner(System.in);

        cant = in.nextInt();

        nombres = new String[cant];
  
        for(int x = 0; x < cant; x++ ){

            System.out.print("Soy");
            nombres[x] = in.next();

        }

        in.close();

        for(int x = 0; x < cant; x++){

            System.out.println("Hola, " + nombres[x] + '.');

        }

    }
}
