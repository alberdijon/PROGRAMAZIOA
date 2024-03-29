package model;

public class MyCircle {
    private MyPoint center;
    private int radius;


    public MyCircle(){

        center = new MyPoint(0,0);
        radius = 1;

    }

    public MyCircle(int x, int y, int radius){
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public double distance(MyCircle another){
        double distance;

        distance = this.center.distance(another.center);

        return distance;
    }

    public boolean isInside(MyPoint puntua){

        boolean inside;

        double distance =this.center.distance(puntua);

        if(distance <= radius){

            inside = true;

        }else{

            inside = false;

        }

        return inside;

    }

    public double getArea(){

        double area = radius * radius * 3.1416;

        return area;

    }

    public MyPoint getCenter() {
        return center;
    }

    public int getCenterX(){

        return center.getX();

    }

    public int[] getCenterXY(){

        int[] erdia = new int[2];

        erdia[0] = center.getX();
        erdia[2] = center.getY();

        return erdia;

    }

    public double getCircunference(){

        double circunference = 2 * 3.1416 * radius;
        return circunference;

    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public void setCenterX(MyPoint center) {
        this.center.setX(center.getX()); 
    } 
    
    public void setCenterXY(MyPoint center) {
        this.center = center;
    }  
    
    public void setCenterY(MyPoint center) {
        this.center.setY(center.getY()); 
    }    

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MyCircle [center=" + center + ", radius=" + radius + "]";
    }

}
