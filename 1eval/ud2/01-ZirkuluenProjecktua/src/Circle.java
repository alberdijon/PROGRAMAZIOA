
/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle {    // Save as "Circle.java"
   // Private instance variables
   private double radius;
   private String color;

   // Constructors (overloaded)
   /** Constructs a Circle instance with default radius and color */
   public Circle() {                   // 1st Constructor (default constructor)
      radius = 1.0;
      color = "red";
   }
   /** Constructs a Circle instance with the given radius and default color*/
   public Circle(double r) {           // 2nd Constructor
      radius = r;
      color = "red";
   }
   /** Constructs a Circle instance with the given radius and color */
   public Circle(double r, String c) { // 3rd Constructor
      radius = r;
      color = c;
   }

   // Public methods
   /** Returns the radius */
   public double getRadius() {  // getter for radius
      return radius;
   }

   public void setRadius(Double newRadius){
      radius = newRadius;
   }

   /** Returns the color */
   public String getColor() {   // getter for color
      return color;
   }

   public void setColor(String newColor){
      color = newColor;
   }

   /** Returns the area of this circle */
   public double getArea() {
      return radius * radius * Math.PI;
   }

   public String toString() {
    return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}