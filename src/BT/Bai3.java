package BT;

public class Bai3 {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 10);
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        System.out.println("///////////////////////");

        /*for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }*/
        int sum = 0;
        long multi = 1;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] % 2 != 0) {
                sum += array[i];
                multi *= array[i];
                count++;
            }
        }
        double avg = sum / count;
        System.out.printf("SUM: %d\n", sum);
        System.out.printf("MULTI: %d\n", multi);
        System.out.printf("AVG: %f\n", avg);

    }
}
