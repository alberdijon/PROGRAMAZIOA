package methods;

import java.util.Scanner;

public class GradesStatics {
    public static void main(String[] args) {

        final int students;
        int grades[];

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        students = in.nextInt();

        grades = new int[students];

        if (grades.length > 0) {
      
            for (int i = 0; i < grades.length; ++i) 
            {
                System.out.printf("Enter a number (%d):\n", i+1);
                grades[i] = in.nextInt();
            }
            
        }

        in.close();
    }
}
