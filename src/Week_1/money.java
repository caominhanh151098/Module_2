package Week_1;

import java.util.Scanner;

public class money {
    public static void main(String[] args) {

        int rate = 23000;

        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER USD:");
        double usd = scanner.nextDouble();
        double vnd = usd * rate;


        System.out.printf("VND: %f vnd", vnd);
    }
}

