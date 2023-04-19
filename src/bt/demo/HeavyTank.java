package bt.demo;

public class HeavyTank extends Tank {
    private int speed = 1;
    private double weight = 1;
    private final String TYPE = "Light";

    public HeavyTank() {
    }

    public HeavyTank(String name, String nation, int speed, double weight) {
        super(name, nation);
        this.speed = speed;
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return getName();
    }

    public void setName(String name) {
        setName(name);
    }

    public String getNation() {
        return getNation();
    }

    public void setNation(String nation) {
        setNation(nation);
    }
}
