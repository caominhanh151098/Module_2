package bt;

public class Static {

    public static int number = 1;

    public static void main(String[] args) {
        isOdd(number);

        System.out.println("number " + number + " Odd is " + isOdd(number));
    }

    public static boolean isOdd(int number) {
        if (number % 2 != 0) {
            return true;
        }
        return false;
    }
}
