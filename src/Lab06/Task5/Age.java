package Lab06.Task5;

import java.util.Scanner;

public class Age {
    public int Age;

    public String consoleInput(String label) {
        var scanner = new Scanner(System.in);
        System.out.print(label + " ");
        return scanner.nextLine();
    }

    public void set() {
        this.Age = Integer.getInteger(this.consoleInput("Введите возраст: "));
        System.out.println("Возраст: " + Age);
    }
}
