package Week_1.array;

import java.util.Scanner;

public class find_max_element {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size:");
        do {
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 100);
            System.out.printf("Enter element %d: ", i + 1);
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.printf("Max is: %d", max);
    }
}
