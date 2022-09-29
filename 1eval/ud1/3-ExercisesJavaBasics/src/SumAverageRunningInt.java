public class SumAverageRunningInt {
   public static void main (String[] args) {
    
      int sum = 0;          
      double average;
      double contador = 1;      
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 105;

     
      for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
          
         sum += number;
         contador ++;    
      }
      
      average = sum / contador;

      System.out.println("The sum of " + UPPERBOUND + " and " + LOWERBOUND + " is: " + sum);
      System.out.println("The average of " + UPPERBOUND + " and " + LOWERBOUND + " is: " + average);

   }
}