package Lab07;

import Lab02.Calculator;
import Lab02.PersonalComputer;
import Lab02.Processor;

public class Main {
    public static void main(String[] ars) {
        var pln = new Plane();
        var wind1 = pln.new Wind();
        wind1.weight = 2.3;
        wind1.print();

        var wind2 = pln.new Wind();
        wind2.weight = 1.9;
        wind2.print();



    }
}
