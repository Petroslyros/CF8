package gr.aueb.cf.ch15;

public class Main {
    public static void main(String[] args) {

        Point[] points = new Point[]{new Point(1),
                new Point2D(2,6), new Point3D(0 ,4 ,1)};

        for(Point point : points){
            if(point instanceof Point3D){
                System.out.println("Point 3D" + point);
            } else if (point instanceof Point2D){
                System.out.println("Point 2D: " + point);
            } else {
                System.out.println("Point : " + point);
            }
        }

        Point p1 = new Point(4);
        Point2D p2 = new Point2D(5,8);
        Point3D p3 = new Point3D();

        p1.movePlusOne();
        p2.movePlusOne();
        p3.movePlusOne();

        doMovePlus1(p3);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }

    public static void doMovePlus1(Point point){
        point.movePlusOne();
    }
}
