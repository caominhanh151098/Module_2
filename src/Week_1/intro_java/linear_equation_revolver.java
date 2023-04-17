package Week_1.intro_java;

import java.util.Scanner;

public class linear_equation_revolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");

        int a, b, c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        a = scanner.nextInt();
        System.out.println("Enter b:");
        b = scanner.nextInt();
        System.out.println("Enter c:");
        c = scanner.nextInt();

        if (a != 0) {
            double result = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", result);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
