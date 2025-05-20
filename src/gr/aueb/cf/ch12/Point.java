package gr.aueb.cf.ch12;

public class Point {
    private int x;
    private int y;
    private static int noOfPoints = 0;

    public Point(){
        noOfPoints++;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        noOfPoints++;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static int getNoOfPoints() {
        return noOfPoints;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void setNoOfPoints(int noOfPoints) {
        Point.noOfPoints = noOfPoints;
    }
}
