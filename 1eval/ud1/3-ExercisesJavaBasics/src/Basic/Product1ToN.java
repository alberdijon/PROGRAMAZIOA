public class Product1ToN { 
    public static void main (String[] args) {
        int product = 1;
        final int lowerbound = 1;
        final int uperbound = 10;

        for(int x = lowerbound ; x <= uperbound; x++ ){
            
            product *= x;

        }

        System.out.println("The product of integers "+ lowerbound + " and " + uperbound + " is " + product + ".");

   }
}
