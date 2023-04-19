package Week_1._class.fan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Fan fan_1 = new Fan();
        fan_1.setSpeed(fan_1.FAST);
        fan_1.setRadius(10);
        fan_1.setColor("yellow");
        fan_1.setOn(true);

        Fan fan_2 = new Fan();
        fan_2.setSpeed(fan_2.MEDIUM);
        fan_2.setRadius(5);

        System.out.println(fan_1.toString());
        System.out.println(fan_2.toString());
    }
}
