package Week_1.Class.QuadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getterA () {
        return this.a;
    }

    public double getterB() {
        return this.b;
    }

    public double getterC() {
        return this.c;
    }

    public double getDiscriminant() {
        return b * b - (4 * a * c);
    }

    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            return (-b + Math.sqrt(this.getDiscriminant())) / (2 * a);
        }
        return 0;
    }

    public double getRoot2() {
        if (getDiscriminant() >= 0) {
        return (-b - Math.sqrt(this.getDiscriminant())) / (2 * a);
        }
        return 0;
    }
}
