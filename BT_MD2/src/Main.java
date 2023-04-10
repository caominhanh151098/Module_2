import java.sql.Array;

public class Main {
    static int[] intPrimes = {2, 3, 5, 7, 0};

    public static void main(String[] args) {
        int a = 6;
        int b = 10;
        int[] arrays = primary_Factor(10);

        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }

    }


    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] primary_Factor(int number) {

        int i = 0;
        int[] array = new int[5];
        while (number != 1) {
            if (isPrime(number)) {
                array[4] = number;
            }
            if (number % intPrimes[i] == 0) {
                number /= intPrimes[i];
                array[i]++;
            } else {
                i++;
            }
        }
        return array;
    }

    public static int bcnn(int a, int b) {

        return 0;
//        int[] array_1 = new int[b];
//        int[] array_2 = new int[a];
//
//        for (int i = 0; i < b; i++) {
//            array_1[i] = a * (i + 1);
//        }
//        for (int i = 0; i < a; i++) {
//            array_2[i] = b * (i + 1);
//        }
//
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < b; j++) {
//                if (array_2[i] == array_1[j]) {
//                    return array_2[i];
//                }
//            }
//        }
//        return 0;
    }
}