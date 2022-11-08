package methods;

import java.util.Scanner;

public class GradesStatistics {

    public static int[] grades;

    public static void main(String[] args) {

        readGrades();
        System.out.print("The grades are: ");
        print(grades);
        System.out.printf("The average is %.2f",  average(grades));
        System.out.println();
        System.out.printf("The median is %.2f",  median(grades));
        System.out.println();
        System.out.println("The minimum is " + min(grades));
        System.out.println("The maximum is " + max(grades));
        System.out.printf("The standard deviation is %.2f", stdDev(grades, average(grades)));

    }

    public static void readGrades() {

        int number;
        Scanner in = new Scanner(System.in);

        do {

            System.out.print("Enter the number of students: ");
            number = in.nextInt();

        } while ((number > 100) && (number < 0));

        grades = new int[number];

        for (int x = 1; x <= grades.length; x++) {

            System.out.print("Enter the grade for student " + x + ": ");
            grades[x-1] = in.nextInt();
        }

        in.close();

    }

    public static void print(int[] grades) {

        System.out.print("[");
        for (int x = 0; x < grades.length; x++) {

            if (x == grades.length - 1) {

                System.out.print(grades[x]);

            } else {
                System.out.print(grades[x] + ", ");
            }

        }
        System.out.println("]");

    }

    public static double average(int[] grades){

        double average = 0;

        for(int x = 0; x < grades.length; x++){

            average += grades[x]; 

        }

        average /= grades.length; 

        return average;

    }

    public static double median(int[] grades){

        double average = 0;

        for(int x = 0; x < grades.length; x++){

            average += grades[x]; 

        }

        average /= 2;
        
            return average;


    }

    public static int max(int[] grades){
        
        int max = grades[0];

        for(int x = 1; x < grades.length; x++){

            if(max < grades[x] ){

                max = grades[x];

            }

        }

        return max;

    }

    public static int min(int[] grades){
        
        int min = grades[0];

        for(int x = 1; x < grades.length; x++){

            if(min > grades[x] ){

                min = grades[x];

            }

        }

        return min;

    }
    
    public static double stdDev(int[] grades, double average){

        double sumatoria = 0;        
        double stdDev = 0;

        for(int x  = 0; x < grades.length; x++){

            sumatoria += Math.pow(grades[x], 2);

        }

        sumatoria = sumatoria / grades.length;

        stdDev = Math.sqrt(sumatoria - Math.pow(average, 2));

        return stdDev;

    }

}
