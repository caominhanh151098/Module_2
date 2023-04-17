package Week_1.loop;

import java.util.Scanner;

public class greate_common_factor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so a:");
        int a = scanner.nextInt();
        System.out.print("Nhap so b:");
        int b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("Khong co UCLN");
        }

        while (a != b) {
            if (a > b) {
                a -= b;
            }
            else b -= a;
        }

        System.out.printf("UCLN la: %d", a);
    }
}
