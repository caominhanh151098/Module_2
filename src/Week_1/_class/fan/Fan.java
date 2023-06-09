package Week_1._class.fan;

public class Fan {

//    enum speedFan {
//        SLOW(1), MEDIUM(2), FAST(3);
//        public int value;
//        speedFan(int value) {
//            this.value = value;
//        }
//    }

    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.on == true) {
            return "Fan is ON! Speed: " + this.speed + ";Color: " + this.color + ";Radius: " + this.radius;
        } else return "Fan is OFF! " + "Color: " + this.color + ";Radius: " + this.radius;
    }

    public Fan() {
    }
}
