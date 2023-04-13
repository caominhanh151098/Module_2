package Week_1.Array;

import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 100);
            System.out.printf("Enter element %d: ", i + 1);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        System.out.println("/////////////////");

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
