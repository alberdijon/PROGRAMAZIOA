public class PrintLeapYears {
    public static void main(String[] args) {

        int firstyear = -999;
        int lastyear = 2010;
        int count  = 0;

        for(int x = firstyear; x <= lastyear; x++){
            if(x % 4 == 0 ){
                System.out.println(x);
                count++;
            }
        }

        System.out.println( "There are: " + count + "leap years");

     }
}
