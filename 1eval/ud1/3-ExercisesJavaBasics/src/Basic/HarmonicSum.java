public class HarmonicSum {
    public static void main (String[] args) {
        // Define variables
        final int MAX_DENOMINATOR = 50000;  // Use a more meaningful name instead of n
        double sumL2R = 0.0;         // Sum from left-to-right
        double sumR2L = 0.0;         // Sum from right-to-left
        double absDiff;              // Absolute difference between the two sums
     
        // for-loop for summing from left-to-right
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; ++denominator) {
            // denominator = 1, 2, 3, 4, 5, ..., MAX_DENOMINATOR
            sumL2R += 1.00/denominator;
            // Beware that int/int gives int, e.g., 1/2 gives 0.
        }
        System.out.println("The sum from left-to-right is: " + sumL2R);
  
        // for-loop for summing from right-to-left
        for (int denominator = MAX_DENOMINATOR; denominator > 1; --denominator) {
  
            sumL2R += 1.00/denominator;

        }
        System.out.println("The sum from right-to-left is: " + sumR2L);
  
        // Find the absolute difference and display
        if (sumL2R > sumR2L) {
            absDiff = sumL2R - sumR2L;
        }
        else{
            absDiff = sumR2L - sumL2R;
        } 

        System.out.println("The diference between the two absolutes is: " + absDiff);
    }
}
