package Week_1.Class.StopWatch;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100000];
        StopWatch watch = new StopWatch();

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200000 - 100000);
        }
        System.out.printf("%s%n", Arrays.toString(array));
        watch.start();
        selectionSort(array);
        System.out.printf("%s%n", Arrays.toString(array));
        watch.stop();
        System.out.printf("StartTime: %s%n", watch.getterStartTime());
        System.out.printf("StopTime: %s%n", watch.getterEndTime());
        System.out.printf("Runtime: %s%n", watch.getElapsedTime());

    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
