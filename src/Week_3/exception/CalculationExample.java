package Week_3.exception;

import java.util.Scanner;

public class CalculationExample {
    public void calc (int x, int y) {
        try {
            System.out.printf("Tổng là: %s%n", x + y);
            System.out.printf("Hiệu là: %s%n", x - y);
            System.out.printf("Tích là: %s%n", x * y);
            System.out.printf("Thương là: %s%n", x / y);
        } catch (Exception e) {
            System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.print("Hãy nhập y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calc(x, y);

    }

}
