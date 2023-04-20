package bt.demo;

public class TankDestroyer extends Tank {
    private double speed = 1;
    private double weight = 1;
    private String type = "Tank Destroyer";


    public TankDestroyer() {
    }

    public TankDestroyer(String name, String nation, int speed, double weight) {
        super(name, nation);
        this.speed = speed;
        this.weight = weight;
    }

    public double getSpeed() {
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

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: " + getType() + ", Speed: " + getSpeed() + ", Weight: " + getWeight();
    }
}
