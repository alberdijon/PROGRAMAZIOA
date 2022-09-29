public class ThreeFiveSevenSum {
    public static void main(String[] args) {

        int upperbound = 1000;
        int lowerbound = 1;
        int sum = 0;

        for (int count = lowerbound; count <= upperbound; count++){

            if ((count % 3 == 0 || count % 5 == 0 || count %7 == 0) && count != 15 && count != 21 && count != 35 && count != 105){
                sum += count; 
            }

        }

        System.out.println("the sum is: " + sum);

     }
}
