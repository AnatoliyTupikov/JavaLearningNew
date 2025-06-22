package Lab06.Task3;

public class Truck extends Car {
    int wheelCount;
    double maxWeigh;

    public Truck(int w, String m, char c, float s, int wc, double mw) {
        super(w, m, c, s);
        this.wheelCount = wc;
        this.maxWeigh = mw;
    }

    public void newWheels(int newWheelsCount) {
        this.wheelCount = newWheelsCount;
        System.out.println("New wheels count: " + this.wheelCount);
    }
}
