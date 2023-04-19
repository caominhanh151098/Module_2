package Week_2.inheritance.circle;

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        System.out.println(myCircle);
        myCircle = new Circle(3.0, "write");
        System.out.println(myCircle);
        System.out.printf("Area: %f%n", myCircle.getArea());
        System.out.printf("Perimeter: %f%n", myCircle.getPerimeter());

        Cylinder myCylinder = new Cylinder();
        System.out.println(myCylinder);
        myCylinder = new Cylinder(4);
        System.out.println(myCylinder);
        myCylinder = new Cylinder(4, 3, "yellow");
        System.out.println(myCylinder);

        System.out.printf("Surrounding Area: %f%n", myCylinder.getSurroundingArea());
        System.out.printf("All Area: %f%n", myCylinder.getAllArea());
    }
}
