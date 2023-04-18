package Week_1.modifier_vs_static.set_student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Anh");
        student.setClasses("C0223G2");

        System.out.println(student.display());
    }
}
