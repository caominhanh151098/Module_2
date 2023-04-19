package Week_2.inheritance.triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Triangle: ");
        System.out.print("Enter side 1: ");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter side 2: ");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter side 3: ");
        double side3 = Double.parseDouble(scanner.nextLine());

        Triangle mTriangle = new Triangle(side1, side2, side3);
        System.out.println(mTriangle);

        System.out.println("Do u want to change color and fill? (y/n)");
        char choice = scanner.nextLine().charAt(0);

        if (choice == 'y') {
            System.out.print("Enter color: ");
            String color = scanner.nextLine();
            System.out.println("And fill? (y/n)");
            choice = scanner.nextLine().charAt(0);
            boolean filled = false;
            if (choice == 'y') {
                filled = true;
            }
            mTriangle.setColor(color);
            mTriangle.setFilled(filled);
        }

        System.out.println(mTriangle);
        System.out.println(mTriangle.display());

    }
}
