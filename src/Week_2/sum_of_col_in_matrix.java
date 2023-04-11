package Week_2;

import java.util.Scanner;

public class sum_of_col_in_matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int col, row;
        do {
            System.out.print("Enter Col: ");
            col = Integer.parseInt(scanner.nextLine());
            if (col > 20 || col < 1) {
                System.out.println("Error!");
            }
        } while (col > 20 || col < 1);
        do {
            System.out.print("Enter Row: ");
            row = Integer.parseInt(scanner.nextLine());
            if (row > 20 || row < 1) {
                System.out.println("Error!");
            }
        } while (row > 20 || row < 1);
        int[][] matrix = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
//                matrix[i][j] = (int) (Math.random() * 40 - 20);
                System.out.printf("Enter element at [%d][%d]: ", i, j);
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }

        int colume;
        do {
            System.out.print("Enter Colume: ");
            colume = Integer.parseInt(scanner.nextLine());
            if (colume > col) {
                System.out.println("Error!");
            }
        } while (colume > col);
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += matrix[i][colume];
        }

        System.out.printf("Sum colume [%d] is: %d", colume, sum);
    }
}
