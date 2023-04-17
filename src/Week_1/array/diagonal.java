package Week_1.array;

import java.util.Scanner;

public class diagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter size: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20 || size < 1) {
                System.out.println("Error!");
            }
        } while (size > 20 || size < 1);

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
//                matrix[i][j] = (int) (Math.random() * 40 - 20);
                System.out.printf("Enter element at [%d][%d]: ", i, j);
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }

        int sum_1 = 0;
        int sum_2 = 0;
        for (int i = 0; i < size; i++) {
            sum_1 += matrix[i][i];
            sum_2 += matrix[i][size - i - 1];
        }

        System.out.printf("Diagonal 1 sum: %d\n", sum_1);
        System.out.printf("Diagonal 2 sum: %d\n", sum_2);
    }
}
