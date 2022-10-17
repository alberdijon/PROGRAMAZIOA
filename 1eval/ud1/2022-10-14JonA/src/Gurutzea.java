import java.util.Scanner;

public class Gurutzea {
    public static void main(String[] args) {
       
        int tamaina;

        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Zein neurritako gurutzea marraztu nahi duzu (zenbaki bakoitia zartu)?");
            tamaina = in.nextInt();
        } while (tamaina < 0 || tamaina % 2 == 0);

        in.close();

        for (int row = 1; row <= tamaina; row++) {

            for (int col = 1; col <= tamaina; col++) {
                if((row - 1 == tamaina - row) || (col -1 == tamaina - col)) 
                System.out.print("0 ");

            else 
               System.out.print("* ");

            }
            System.out.println();
        
        }
    }
}
