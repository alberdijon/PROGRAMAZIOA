public class ArithmeticTest {
    public static void main(String[] args) throws Exception {

      int number1 = 98;
      int number2 = 5; 
      int sum, difference, product, quotient, remainder, m_sum; 
      sum = number1 + number2;
      difference = number1 - number2;
      product = number1 * number2;
      quotient = number1 / number2;
      remainder = number1 % number2;

      System.out.print("The sum, difference, product, quotient and remainder of " + number1 + " and " + number2 + " are " +  sum + ", " + difference + "," + product + "," + quotient + ", " + remainder ); 

      m_sum =  number1 * 31  + number2 * 17;

      System.out.println("The sum of 31 times number1 and 17 times number2 is: " + m_sum);

      ++number1; 
      --number2;  
      System.out.println("number1 after increment is " + number1);  
      System.out.println("number2 after decrement is " + number2);
      quotient = number1 / number2; 
      System.out.println("The new quotient of " + number1 + " and " + number2 
            + " is " + quotient);


    }
}
