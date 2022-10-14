import java.util.Scanner;

public class Segida {
    public static void main(String[] args) {
        int luzeera;
        int taldeak;

        Scanner in = new Scanner(System.in); 
        do{
            System.out.print("Zein da inprimatu nahi duzun azken zenbakia? "); 
            luzeera = in.nextInt();      
        } while(luzeera < 0);

        do{
            System.out.print("Zenbat zenbakiko multzoak nahi dituzu? "); 
            taldeak = in.nextInt();  
        }while(taldeak < 0);
 

        in.close();

        for(int i = 1; i <= luzeera; i++){
            System.out.println(i);
            if(i % taldeak == 0 ) {
                System.out.println("====");
            }
        }
    }
}


