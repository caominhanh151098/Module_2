package Week_3.Sort;

import java.util.Scanner;

public class InsertionSort_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        double[] list = new double[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
//            System.out.printf("Enter element at [%d]: ", i);
//            list[i] = scanner.nextInt();
            list[i] = (Math.random() * 20);
        }
        System.out.println("Your input list: ");
        println(list);
        System.out.println("\nSoft: ......");
        insertionSort(list);

        println(list);
    }

    public static void insertionSort(double[] arr) {
        int i = arr.length - 2;
        while (i >= 0) {
            double temp = arr[i];
            int pos = i;
            while (pos < arr.length - 1) {
                if (temp > arr[pos + 1]) {
                    arr[pos] = arr[pos + 1];
                    pos++;
                } else break;
            }
            arr[pos] = temp;
            i--;
        }
    }

    public static void println(double[] arr) {
        for (double num : arr) {
            System.out.printf("%.2f\t", num);
        }
        System.out.println();
    }
}
