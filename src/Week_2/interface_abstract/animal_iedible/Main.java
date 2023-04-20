package Week_2.interface_abstract.animal_iedible;

public class Main {
    public static void main(String[] args) {
//        Animal[] animals = new Animal[2];
//        animals[0] = new Tiger();
//        animals[1] = new Chicken();
//
//        for (Animal animal : animals) {
//            System.out.println(animal.makeSound());
//        }

//        Fruit[] fruits = new Fruit[2];
//        fruits[0] = new Apple();
//        fruits[1] = new Orange();
//
//        for (Fruit fruit : fruits) {
//            System.out.println(fruit.howToEat());
//        }

        Object[] objects = new Object[4];
        objects[0] = new Chicken();
        objects[1] = new Tiger();
        objects[2] = new Apple();
        objects[3] = new Orange();

        for (Object obj : objects) {
            if (obj instanceof Edible)
                System.out.println(((Edible) obj).howToEat());
            if (obj instanceof Animal)
            System.out.println(((Animal) obj).makeSound());
        }
    }
}
