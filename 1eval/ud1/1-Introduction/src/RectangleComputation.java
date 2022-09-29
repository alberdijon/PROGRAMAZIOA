public class RectangleComputation {
    public static void main(String[] args) throws Exception {

        double width, area, length, perimeter;

        width = 15.68;
        length = 22.58;

        area = width * length;
        perimeter = width * 2 + length * 2 ;

        System.out.printf("The area is: %.2f", area);
        System.out.println();
        System.out.printf("The perimeter is: %.2f", perimeter);

    }
}
