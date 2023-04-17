package Week_1.array;

import java.util.Scanner;

public class find_element_in_array {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        int find = -1;
        for (int i = 0; i < students.length; i ++) {

            if (students[i].equals(name)) {
                find = i;
            }
        }
        System.out.printf(find != -1 ? ("Position of the students in the list" + name + "is: " + find) : "Not found!");
    }
}
