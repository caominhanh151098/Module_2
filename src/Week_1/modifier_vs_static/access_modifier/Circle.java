package Week_1.modifier_vs_static.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        if (radius <= 0)
            System.out.println("Error!");
        else this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String display() {
        return "Radius: "+ getRadius() + "; Area: " +  getArea();
    }
}
