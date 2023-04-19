package Week_2.inheritance.point;

public class Main {
    public static void main(String[] args) {
//        Point2D mPoint2D = new Point2D();
//        System.out.println(mPoint2D);
//        mPoint2D = new Point2D(4.3f,5.3f);
//        System.out.println(mPoint2D);
//
//        Point3D mPoint3D = new Point3D();
//        System.out.println(mPoint3D);
//        mPoint3D = new Point3D(4.3f,5.3f, 9);
//        System.out.println(mPoint3D);
//        mPoint3D.setXYZ(3.2f,5, 1.24f);
//        System.out.println(mPoint3D);

        Point2D mPoint2D = new Point2D(3,5);
        mPoint2D = new MoveablePoint(mPoint2D.getX(), mPoint2D.getY(),0.2f, 3.2f);
        System.out.println(mPoint2D);
        for (int i = 0; i < 20; i++) {
            ((MoveablePoint) mPoint2D).move();
            System.out.println(mPoint2D);
        }

    }
}
