
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "blue");

        Circle c2 = new Circle(2.0);

        Circle c3 = new Circle();

        Circle c4 = new Circle(5.0, "blue");

        System.out.printf("Zirkulua\tErradioa\tKolorea\t\tAzalera\n");
        System.out.printf("================================================================\n");
        System.out.printf("c1\t\t%.2f\t\t%s\t\t%.2f\n", c1.getRadius(), c1.getColor(), c1.getArea());
        System.out.printf("c2\t\t%.2f\t\t%s\t\t%.2f\n", c2.getRadius(), c2.getColor(), c2.getArea());
        System.out.printf("c3\t\t%.2f\t\t%s\t\t%.2f\n", c3.getRadius(), c3.getColor(), c3.getArea());
        System.out.printf("c4\t\t%.2f\t\t%s\t\t%.2f\n", c4.getRadius(), c4.getColor(), c4.getArea());
        
        System.out.println();

        c1.setRadius(4.5);
        c1.setColor("black");
        System.out.println(c1);
        System.out.printf("\n");

        c1.setRadius(2.0);
        c1.setColor("blue");
        for (int i = 0; i < 10; i++) {
            System.out.println(c1);
            c1.setRadius(c1.getRadius()+ 1);
            if (i == 5) {
                c1.setColor("magenta");
            }
        }

    }
}