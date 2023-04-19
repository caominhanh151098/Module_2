package bt.demo;

public class LightTank extends Tank{
        private int speed = 1;
        private double weight = 1;
        private final String TYPE = "Light";

        public LightTank () {
        }

        public LightTank (String name, String nation, int speed, double weight) {
                super(name,nation);
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
                return super.getName();
        }

        public void setName(String name) {
                super.setName(name);
        }

        public String getNation() {
                return super.getNation();
        }

        public void setNation(String nation) {
                super.setNation(nation);
        }
}
