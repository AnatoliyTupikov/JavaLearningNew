package Lab07;

public class Plane {
    public class Wind {
        private double weight;

        public void print() {
            System.out.println("Weight of the wind: " + this.weight);
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }
    }
}
