package Week_1.Array;

import java.util.Scanner;

public class find_and_delete {
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

        System.out.print("Enter number:");
        int number = Integer.parseInt(scanner.nextLine());
        boolean checkFound = false;
        int i = 0;
        while (i < array.length) {
            if (array[i] == number) {
                checkFound = true;
                int j = i;
                while (j < array.length - 1) {
                    array[j] = array[j + 1];
                    j++;
                }
                array[array.length - 1] = 0;
            } else i++;
        }
        if (checkFound == false) {
            System.out.println("Can't found!");
        } else
            for (int num : array) {
                System.out.print(num + " ");
            }

    }
}
