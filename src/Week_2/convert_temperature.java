package Week_2;

import java.util.Scanner;

public class convert_temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            double f, c;
            switch (choice) {
                case 1:
                    System.out.print("Enter Fahrenheit: ");
                    f = scanner.nextDouble();
                    celsiuc(f);
                    break;
                case 2:
                    System.out.print("Enter Celsius: ");
                    c = scanner.nextDouble();
                    fahrenheit(c);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Wrong choice!");
            }

        } while (true);

    }

    public static void celsiuc(double f) {
        double c = (5.0 / 9) * (f - 32);
        System.out.printf("Celsiuc: %.3f\n", c);
    }

    public static void fahrenheit(double c) {
        double f = (9.0 / 5) * c + 32;
        System.out.printf("Fahrenheit: %.3f\n", f);
    }

}
