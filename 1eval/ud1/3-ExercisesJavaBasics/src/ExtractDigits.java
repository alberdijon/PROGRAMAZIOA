public class ExtractDigits {
    public static void main (String[] args) {
        
        int number = 12345;
        int rest;

        System.out.print('"');

        while (number > 0){

            rest = number % 10;
            number /= 10;
            System.out.print(rest+ " ");


        }

        System.out.print('"');

    }
}
