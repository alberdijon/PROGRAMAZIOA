import java.util.Scanner;

public class BoxPatternA {
    public static void main(String[] args) throws Exception {
        int row,col, size;   
        
        System.out.printf("Enter a number:");
        Scanner in = new Scanner(System.in); 
        size = in.nextInt();
        in.close(); 
        
        for(row = 0; row < size; row++)
        {
            for(col = 0; col < size; col++)
            {
                if (row == 0 || row == size-1 || col == 0 || col == size-1)
                {
                    System.out.printf("#");
                }
                else{
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
        System.out.printf("\n\n");


    }
}
