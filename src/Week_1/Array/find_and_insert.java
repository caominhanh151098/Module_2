package Week_1.Array;

import java.util.Scanner;

public class find_and_insert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        System.out.print("Enter size: ");
        do {
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20) {
                System.out.println("Enter size < 20!");
            }
        } while (size > 20);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 10);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Enter number: ");
        int number = Integer.parseInt(scanner.nextLine());
        int index;
        do {
            System.out.print("Enter index: ");
            index = Integer.parseInt(scanner.nextLine());
            if (index > array.length - 1 || index < 0) {
                System.out.println("Wrong index! Can't Insert!");
            }
        } while (index > array.length - 1 || index < 0);
        for (int i = array.length - 1; i >= index; i--) {
            if (i == index) {
                array[i] = number;
            } else
                array[i] = array[i - 1];
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
