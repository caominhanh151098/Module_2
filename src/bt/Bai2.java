package bt;

public class Bai2 {
    static int[] intPrimes = {2, 3, 5, 7, 0};

    public static void main(String[] args) {
        int a = 24;
        int b = 16;
        int c = 6;

        int result = ucln(a, b);
        System.out.printf("Ước chung lớn nhất của 2 số %d và %d là: %d", a, b, result);
        System.out.println();
        int result_1 = bcnn(a,b);
        System.out.printf("Bội chung nhỏ nhất của 2 số %d và %d là: %d", a, b, result_1);
        System.out.println();
        int result_2 = ucln(c,result);
        System.out.printf("Ước chung lớn nhất của 3 số %d, %d và %d là: %d", a, b, c, result_2);
        System.out.println();
        int result_3 = bcnn(c,result_1);
        System.out.printf("Bội chung lớn nhất của 3 số %d, %d và %d là: %d", a, b, c, result_3);
        System.out.println();
    }

    public static int bcnn(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Khong co BCNN");
        }
        int result = a*b / ucln(a,b);

        return result;
    }

    public static int ucln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("Khong co UCLN");
        }

        while (a != b) {
            if (a > b) {
                a -= b;
            } else b -= a;
        }
        return a;
    }
}

