package Week_1.Class.Rectangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Width: ");
        int width = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Height: ");
        int height = Integer.parseInt(scanner.nextLine());

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}