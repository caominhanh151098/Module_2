package Week_2;

import java.util.Scanner;

public class max_in_matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Height matrix: ");
        int height = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Width matrix: ");
        int width = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
//                matrix[i][j] = (int) (Math.random() * 40 - 20);
                System.out.printf("Enter element at [%d][%d]: ", i, j);
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }

        int max = matrix[0][0];
        int x = -1;
        int y = -1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    x = i;
                    y = j;
                }
            }
        }

        System.out.printf("Max in Matrix is %5d, at [%d][%d]", max, x, y);
    }
}
