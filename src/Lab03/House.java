package Lab03;

import java.time.LocalDate;

public class House {
    private String name;
    private int floorsCount;
    private int releaseYear;

    public void initialize(String name, int floorsCount, int releaseYear) {
        this.name = name;
        this.floorsCount = floorsCount;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        String result = String.format("%s:\n Number of floors: %d\n Release year: %d\n", this.name, this.floorsCount, this.releaseYear);
        return result;
    }

    public void Show() {
        System.out.println(this);
    }

    public int yeersOld() {
        var now = LocalDate.now();
        int yerNow = now.getYear();
        return yerNow - this.releaseYear;
    }

}
