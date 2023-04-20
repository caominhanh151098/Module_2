package bt.demo;

public class LightTank extends Tank {
    private double speed = 1;
    private double turretSpeed = 1;
    private double weight = 1;
    private String type = "Light Tank";


    public LightTank() {
    }

    public LightTank(String name, String nation, int speed, int turretSpeed, double weight) {
        super(name, nation);
        this.speed = speed;
        this.turretSpeed = turretSpeed;
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getTurretSpeed() {
        return turretSpeed;
    }

    public void setTurretSpeed(int turretSpeed) {
        this.turretSpeed = turretSpeed;
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
        return super.toString() + ", Type: " + getType() + ", Speed: " + getSpeed() + ", Turret traverse speed: " + getTurretSpeed() + ", Weight: " + getWeight();
    }
}
