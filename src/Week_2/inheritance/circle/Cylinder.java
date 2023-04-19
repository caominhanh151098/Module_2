package Week_2.inheritance.circle;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    public double getSurroundingArea() {
        return super.getPerimeter() * height;
    }

    public double getAllArea() {
        return getSurroundingArea() + 2 * super.getArea();
    }

    @Override
    public String toString() {
        return "A Cylinder with radius = " + super.getRadius()
                + ", color = " + super.getColor()
                + " and height = " + this.height;
    }
}
