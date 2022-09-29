public class SumProduct3Numbers {
    public static void main(String[] args) throws Exception {

        int number1 = 98;
        int number2 = 5; 
        int number3 = 77;
        int sum, product, quotient, m_sum; 
        sum = number1 + number2 + number3;
        product = number1 * number2;
  
        System.out.print("The sum and product of " + number1 + ", " + number2 + " and " +  number3 + " are: " + sum + "and" + product); 
  
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
