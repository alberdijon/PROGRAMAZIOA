package exercises_on_input_decision_and_loop;

import java.util.Scanner;

public class PensionContributionCalculator {
    public static void main(String[] args) {
        // Declare variables
        
        int age;
        double salary, total, employeecon = 0, employercon = 0;

      
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter the age: ");  
        age = in.nextInt();  
        System.out.print("Enter the monthly salary: ");  
        salary = in.nextInt();
        in.close(); 

        if(age<=55)
        {
            employeecon = salary * 0.2;
            employercon = salary * 0.17;
        }
        if(age > 55 && age <= 60)
        {
            employeecon = salary * 0.13;
            employercon = salary * 0.13;
        }
        if(age > 60 && age <= 65)
        {
            employeecon = salary * 0.075;
            employercon = salary * 0.09;
        }
        if(age > 65)
        {
            employeecon = salary * 0.05;
            employercon = salary * 0.075;
        }
        
        total = employeecon + employercon;
       
      // Print results
      System.out.printf("The employee contribution is:%.2f\n",employeecon);
      System.out.printf("The employer contribution is:%.2f\n",employercon);
      System.out.printf("The total contribution is:%.2f\n",total);

    }
}
