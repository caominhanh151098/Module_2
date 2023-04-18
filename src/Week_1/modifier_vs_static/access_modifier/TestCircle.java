package Week_1.modifier_vs_static.access_modifier;


import Week_1.modifier_vs_static.static_property.Car;

public class TestCircle {
    public static void main(String[] args) {
        Circle myCircle_1 = new Circle();
        Circle myCircle_2 = new Circle(2.3);

        System.out.println(myCircle_1.display());
        System.out.println(myCircle_2.display());
    }
}
