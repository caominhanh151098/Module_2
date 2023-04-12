package Week_3;

import java.util.Scanner;

public class SelectionSort {
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
        for (double num : list) {
            System.out.printf("%.2f\t", num);
        }
        System.out.println();
        selectionSort(list);
        for (double num : list) {
            System.out.printf("%.2f\t", num);
        }
    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[min] > list[j]) {
                    min = j;
                }
            }
            if (min!= i) {
                double temp = list[i];
                list[i] = list[min];
                list[min] = temp;
            }
        }
    }
}
