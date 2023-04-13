package Week_1.Loop;

public class primes_less_than_100 {
    public static void main(String[] args) {
        int N = 2;
        while (N < 100) {
            if (isPrime(N)) {
                System.out.println(N);
                N++;
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
