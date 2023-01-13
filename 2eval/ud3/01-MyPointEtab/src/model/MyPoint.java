package model;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(){

        x = 0 ;
        y = 0;

    }

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(){
        double dx, dy, d;

        dx = Math.pow(this.x - 0, 2);
        dy = Math.pow(this.y - 0, 2);

        d = Math.sqrt(dx + dy);

        return d;
    }

    public double distance(MyPoint another){
        double dx, dy, d;

        dx = Math.pow(another.x - this.x, 2);
        dy = Math.pow(another.y - this.y, 2);

        d = Math.sqrt(dx + dy);

        return d;
    }

    public double distance(int x, int y){
        double dx, dy, d;

        dx = Math.pow(x - 0, 2);
        dy = Math.pow(y - 0, 2);

        d = Math.sqrt(dx + dy);

        return d;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] XY = {x, y};
        return XY;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint (" + x + "," + y + ")";
    }
}
