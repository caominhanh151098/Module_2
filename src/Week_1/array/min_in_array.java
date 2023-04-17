package Week_1.array;

import java.util.Scanner;

public class min_in_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter size:");
            size = Integer.parseInt(scanner.nextLine());
            if (size < 1 || size > 20) {
                System.out.println("Error!");
            }
        } while (size < 1 || size > 20);

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 100 - 50);
            System.out.printf("Enter element at [%d]: ", i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        minInArray(array);
    }

    public static void minInArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.printf("Min in Array is: %d", min);
    }
}
