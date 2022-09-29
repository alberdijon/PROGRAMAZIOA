import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) throws Exception {
    
        int size = 0;
        int x, y;
        
        
        Scanner in = new Scanner(System.in); 

        System.out.print("Enter the size "); 
        size = in.nextInt();                     

        in.close();

        for ( int z = 1; z <= size; z++){

            if (z == 1){
                System.out.print(" * |");
            }

            if (z >= 10){
                System.out.print("  " + z);
            }else{
                System.out.print("   " + z);
            }

        }

        System.out.println();

        System.out.print("----");

        for ( int z = 1; z <= size; z++){

            System.out.print("----");
            
        }

        System.out.println();


        for (y = 1; y <= size; y++){

            if (y >= 10){
                System.out.print(" "+ y + " |");
            }else{
                System.out.print("  "+ y + " |");
            }


            
            for ( x = 1; x <= size; x++){

                if( (x * y) >= 10){

                    System.out.print("  " + (x * y)); 

                }else{
                    System.out.print("   " + (x * y));
                }
        
                }
                x = 1;

            System.out.println();

        }   

    }
}
