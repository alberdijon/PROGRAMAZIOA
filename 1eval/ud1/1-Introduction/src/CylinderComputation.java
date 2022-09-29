public class CylinderComputation {
    public static void main(String[] args) throws Exception {

        double radius, S_Area, height, B_Area, volume;
        final double PI = 3.14159265;

        radius = 15.68;
        height = 22.58;

        B_Area = radius * radius * PI;
        volume = B_Area * height; 
        S_Area = 2 * PI * radius * height;

        System.out.printf("The area is: %.2f", S_Area);
        System.out.println();
        System.out.printf("The perimeter is: %.2f", B_Area);
        System.out.println();
        System.out.printf("The volume is: %.2f", volume);

    }
}
