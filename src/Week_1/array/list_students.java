package Week_1.array;

import java.util.Scanner;

public class list_students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        do {
            System.out.print("Enter size: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 30) {
                System.out.println("Size should <= 30!");
            }
        } while (size > 30);

        float[] listMark = new float[size];
        for (int i = 0; i < listMark.length; i++) {
            do {
                System.out.printf("Enter a mark for Student[%d]: ", i);
                listMark[i] = Integer.parseInt(scanner.nextLine());
                if (listMark[i] < 0 || listMark[i] > 10) {
                    System.out.println("0 <= Mark <= 10!!");
                }
            } while (listMark[i] < 0 || listMark[i] > 10);
        }
        System.out.print("List of Mark: ");
        int count = 0;
        for (int i = 0; i < listMark.length; i++) {
            System.out.printf("   %.1f", listMark[i]);
            if (listMark[i] >= 5)
                count ++;
        }
        System.out.printf("\n The number of students passing the exam is %d", count);


    }
}
