package Week_1.modifier_vs_static.static_method;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    Student (int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    static void change() {
        college = "Codegym";
    }

    void display() {
        System.out.printf("%d %s %s%n", rollno, name, college);
    }


}
