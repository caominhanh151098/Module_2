package bt.demo_2;

public class Dog implements Barkable, Runable{

    @Override
    public String bark() {
        return "Dog: Gâu gâu";
    }

    @Override
    public String run() {
        return "Dog: Run Away!";
    }
}
