package Week_3.exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer[] array = ArrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = Integer.parseInt(scanner.nextLine());

        try {
            System.out.printf("Phần tử đứng thứ %d là %d%n", x, array[x]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Nhập ko nằm trong ARRAY CMNR!");
        }
    }
}
