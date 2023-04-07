import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double rate = 23000;

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER USD:");
        double usd = scanner.nextDouble();

        double vnd = usd / rate;


        System.out.println("VND: " + vnd);
    }
}