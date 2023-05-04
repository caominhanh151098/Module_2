package bt.demo_1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {
        System.out.print("Nhập số thập phân: ");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        Stack<Integer> stack = new Stack();

        while (input != 0) {
            stack.push(input % 2);
            input /= 2;
        }

        System.out.println("Kết quả nhị phân: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
