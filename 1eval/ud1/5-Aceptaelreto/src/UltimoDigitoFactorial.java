import java.util.Scanner;

//114 ariketa


public class UltimoDigitoFactorial {
    public static void main(String[] args) {
        
        int cant, fact = 1;
        int [] numeros;

        Scanner in = new Scanner(System.in);

        cant = in.nextInt();

        numeros = new int[cant];
  

        for(int x = 0; x < cant; x++ ){

            numeros[x] = in.nextInt();

        }

        in.close();

        for(int x = 0; x < cant; x++){
            for(int i  = numeros[x]; i > 0; i--){

                fact *= i;

            }
            fact = fact % 10;
            System.out.println(fact);
            fact = 1;
            
        }

    }
}
