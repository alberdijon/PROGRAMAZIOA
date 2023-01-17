package model;

public class MyRectangle {
    
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight){

        this.topLeft = topLeft;
        this.bottomRight = bottomRight;

    }

    public double getAzalera(){

        double azalera;

        MyPoint topRight = new MyPoint(bottomRight.getX(), topLeft.getY());

        azalera = topLeft.distance(topRight) * bottomRight.distance(topRight);

        return azalera;

    }

    public double getPerimetroa(){

        double perimetroa;

        MyPoint topRight = new MyPoint(bottomRight.getX(), topLeft.getY());

        perimetroa = (topLeft.distance(topRight) * 2) + (bottomRight.distance(topRight) * 2);

        return perimetroa;

    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "MyRectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }

}
