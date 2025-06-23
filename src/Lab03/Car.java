package Lab03;

public class Car {
    public String name;
    public String color;
    public double weight;

    public Car() {
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, double weight) {
        this(color);
        this.weight = weight;
    }

    @Override
    public String toString() {
        String result = String.format("Car\n Name: %s\n Color: %s\n Weight: %f\n", this.name, this.color, this.weight);
        return result;
    }

    public void print() {
        System.out.println(this);
    }
}
