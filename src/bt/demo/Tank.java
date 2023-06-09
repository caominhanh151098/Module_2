package bt.demo;

public class Tank {
    private String name = "";
    private String nation = "";

    public Tank() {
    }

    public Tank(String name, String nation) {
        this.name = name;
        this.nation = nation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public void move() {
        System.out.println("Moving ...");
    }

    public void shot() {
        System.out.println("Shotting...");
    }

    public String toString() {
        return "Name: " + getName() + ", Nation: " + getNation();
    }
}
