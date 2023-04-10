package Week_2;

import java.util.Scanner;

public class interest_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so tien: ");
        double money = scanner.nextDouble();
        System.out.print("Nhap so thang gui: ");
        int month = scanner.nextInt();
        System.out.print("Nhap lai xuat moi thang: ");
        double interestRate = scanner.nextDouble();

        double totalInterest = 0;

        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }

        System.out.printf("So tien nhan duoc la: %f", totalInterest);
    }
}
