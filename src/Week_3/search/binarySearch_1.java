package Week_3.search;

import java.util.Scanner;

public class binarySearch_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = Integer.parseInt(scanner.nextLine());

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }
        for (int num : array) {
            System.out.printf("%3d", num);
        }
        arrange(array);
        System.out.println();
        for (int num : array) {
            System.out.printf("%3d", num);
        }
        System.out.print("\nEnter your Number: ");
        int number = Integer.parseInt(scanner.nextLine());
        int found = binarySearch(array, 0, array.length - 1, number);
        if (found != -1) {
            System.out.printf("Found it! at %d", found);
        } else System.out.printf("Can't found!");

    }

    public static void arrange(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (left > right) {
            return -1;
        }
        if (array[middle] == value)
            return middle;
        else if (array[middle] > value)
            return binarySearch(array, left, middle - 1, value);
        else return binarySearch(array, middle + 1, right, value);

    }
}
