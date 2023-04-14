package Week_1.Class.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter number b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter number c: ");
        double c = Double.parseDouble(scanner.nextLine());

        QuadraticEquation equation = new QuadraticEquation(a,b,c);

        double delta = equation.getDiscriminant();
        if (delta > 0) {
            System.out.printf("The equation has two roots: %.3f, %.3f", equation.getRoot1(), equation.getRoot2());
        } else if (delta == 0) {
            System.out.printf("The equation has one root: %.3f", equation.getRoot1());
        } else {
            System.out.printf("The equation has no roots");
        }
    }
}
