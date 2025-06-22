package Lab02;

public class Main {
    public static void main(String[] ars) {
        var t = new Calculator();
        System.out.println(t.division(3, 2));

        var pc = new PersonalComputer(Processor.INTEL, "ROG strix", "Nvidia", 6, "Black");
        System.out.println(pc);
    }
}
