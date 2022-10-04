public class CozaLozaWoza {
    public static void main(String[] args) {
        final int LOWERBOUND = 1, UPPERBOUND = 110;
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {

           if ( number % 3 == 0 ) {
              System.out.print("Coza");
           }
           if ( number % 5 == 0 ) {
              System.out.print("Loza");
           }
 
           if ( number % 7 == 0 ) {
            System.out.print("Woza");
           }

           if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0 ){
            System.out.print(number);
           }

           if ( number % 11 == 0 ) {
              System.out.println(); 
           } else {
              System.out.print( " " );
           }
        }
     }
}
