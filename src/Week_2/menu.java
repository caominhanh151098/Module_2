package Week_2;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            int number_1 = 0;
            int number_2 = 0;
            switch (choice) {
                case 1:
                    do {
                        System.out.print("Enter edge 1:");
                        number_1 = scanner.nextInt();
                        System.out.print("Enter edge 2:");
                        number_2 = scanner.nextInt();
                    } while (number_1 == 0 || number_2 == 0);
                    for (int i = 0; i < number_1; i++) {
                        for (int j = 0; j < number_2; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    do {
                        System.out.print("Enter edge:");
                        number_1 = scanner.nextInt();
                    } while (number_1 == 0);
                    System.out.println("Bottom-left:");
                    for (int i = 0; i < number_1; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Top-left:");
                    for (int i = 0; i < number_1; i++) {
                        for (int j = number_1 - i; j > 0; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Bottom-right:");
                    for (int i = 0; i < number_1; i++) {
                        int j = 0;
                        for (; j < number_1 - i - 1; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < number_1 - j; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Top-right:");
                    for (int i = 0; i < number_1; i++) {
                        int j = 0;
                        for (; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < number_1 - j; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    do {
                        System.out.print("Enter height:");
                        number_1 = scanner.nextInt();
                    } while (number_1 == 0);
                    for (int i = 1; i <= number_1; ++i) {
                        int k = 0;
                        for (int j = 1; j <= number_1 - i; ++j) {
                            System.out.print("  ");
                        }
                        while (k != 2 * i - 1) {
                            System.out.print("* ");
                            ++k;
                        }
                        System.out.println();
                    }
//                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Error!");

            }
        } while (true);
    }
}
