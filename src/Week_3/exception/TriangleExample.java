package Week_3.exception;

import java.util.Scanner;

public class TriangleExample {
    public static void checkTriangle(int edge1, int edge2, int edge3) throws IllegalAccessException {
        if (edge1 < 0 || edge2 < 0 || edge3 < 0) {
            throw new IllegalAccessException("Error! Có cạnh âm");
        }

        if (edge1 > edge2 + edge3 || edge2 > edge1 + edge3 || edge3 > edge1 + edge2) {
            throw new IllegalAccessException("Error! Không tạo được tam giác");
        }
    }


    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.print("Nhập cạnh 1: ");
        int edge1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập cạnh 2: ");
        int edge2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập cạnh 3: ");
        int edge3 = Integer.parseInt(scanner.nextLine());

        try {
            checkTriangle(edge1, edge2, edge3);
            System.out.printf("Tam giác có 3 cạnh đẹp!");
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
