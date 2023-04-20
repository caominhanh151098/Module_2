package Week_2.interface_abstract.icomparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];

        circles[0] = new ComparableCircle();
        circles[1] = new ComparableCircle(0.5);
        circles[2] = new ComparableCircle(3.6,"Black", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
