package Week_2.inheritance.shape;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return getColor();
    }

    public void setColor(String color) {
        setColor(color);
    }

    public boolean isFilled() {
        return isFilled();
    }

    public void setFilled(boolean filled) {
        setFilled(filled);
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius= " + this.radius + ", which is a subclass of " + super.toString();
    }

    @Override
    public String Draw() {
        return "Draw Circle with radius= " + this.radius + ", which is a subclass of " + super.toString();
    }
}
