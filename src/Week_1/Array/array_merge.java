package Week_1.Array;

import java.util.Scanner;

public class array_merge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size_1 = 0;
        int size_2 = 0;
        do {
            System.out.print("Enter size Array1: ");
            size_1 = Integer.parseInt(scanner.nextLine());
            if (size_1 > 20) {
                System.out.println("Enter size < 20!");
            }
        } while (size_1 > 20);
        int[] array_1 = new int[size_1];
        for (int i = 0; i < array_1.length; i++) {
//            array_1[i] = (int) (Math.random() * 20 - 10);
            System.out.printf("Enter element %d in Array1: ", i+1);
            array_1[i] = Integer.parseInt(scanner.nextLine());
        }

        do {
            System.out.print("Enter size Array2: ");
            size_2 = Integer.parseInt(scanner.nextLine());
            if (size_2 > 20) {
                System.out.println("Enter size < 20!");
            }
        } while (size_2 > 20);
        int[] array_2 = new int[size_2];
        for (int i = 0; i < array_2.length; i++) {
//            array_2[i] = (int) (Math.random() * 20 - 10);
            System.out.printf("Enter element %d in Array2: ", i+1);
            array_2[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Array1: ");
        for (int num : array_1) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Array2: ");
        for (int num : array_2) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] array_3 = new int[size_1 + size_2];

        for (int i = 0; i < array_3.length; i++) {
            if (i < array_1.length) {
                array_3[i] = array_1[i];
            } else {
                array_3[i] = array_2[i - array_1.length];
            }
        }
        System.out.println();
        System.out.print("Array3: ");
        for (int num : array_3) {
            System.out.print(num + " ");
        }
    }
}
