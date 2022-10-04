import java.util.Scanner;

public class HillPatternC {
    public static void main(String[] args) {
        int row, col, size;

        System.out.printf("Enter a number:");
        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        in.close();

        for (row = 0; row <= size; row++) {
            for (col = 2 * (size - row); col >= 0; col--) {
                System.out.printf(" ");
            }
            for (col = 0; col < (row * 2) - 1; col++) {
                System.out.printf("# ");
            }
            System.out.printf("\n");
            
        }

        for(int x = 0; x < (size*2); x++ ){
            System.out.print("# ");

        }
        System.out.println();
        for(row = size; row >= 0; row--){
            for(col = 2*(size - row); col >= 0; col--){
                System.out.printf(" ");
            } 
            for(col = 0; col < (row * 2)-1; col++){
                System.out.printf("# ");
            } 
            System.out.printf("\n");
        }
    }
}
