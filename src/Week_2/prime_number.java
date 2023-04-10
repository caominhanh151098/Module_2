package Week_2;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter quantity: ");
        int number = scanner.nextInt();
        int count = 0;
        int N = 2;
        while (count < number) {
            if (isPrime(N)) {
                System.out.println(N);
                N++;
                count ++;
            }
            else {
                N++;
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }
}
