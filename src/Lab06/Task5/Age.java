package Lab06.Task5;

import java.util.Scanner;

public class Age {
    public Scanner scnr = new Scanner(System.in);

    public String consoleInput(String label) {

        System.out.print(label + " ");
        return scnr.nextLine();
    }

    public void set() {
        int age = Integer.getInteger(this.consoleInput("Введите возраст: "));
        System.out.println("Возраст: " + age);
    }
}
