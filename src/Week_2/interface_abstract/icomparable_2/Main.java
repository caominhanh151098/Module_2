package Week_2.interface_abstract.icomparable_2;

import Week_2.inheritance.shape.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];

        circles[0] = new Circle();
        circles[1] = new Circle(0.3);
        circles[2] = new Circle(1.5,"black",false);

        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        System.out.println();

        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
