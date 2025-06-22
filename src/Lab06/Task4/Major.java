package Lab06.Task4;

import java.util.Scanner;

public class Major {
    protected int dig;

    public Major() {
        var scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        dig = scanner.nextInt();
    }
}
