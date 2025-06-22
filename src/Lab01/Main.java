package Lab01;

import java.util.Scanner;

public class Main {
    public  static void main (String[] args)
    {
        System.out.println("Я\nхорошо\nзнаю\nJava.");

        double dresult = (46 + 10) * (10d / 3d);
        int iresult = 29 * 4 * (-15);
        System.out.println( dresult + " " + iresult);

        double result = 3.6 * 4.1 * 5.9;
        System.out.println(result);

        var scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a + "\n" + b + "\n" + c);

        b = scanner.nextInt();
        String answ;
        if (b % 2 == 0)
        {
            answ = b > 100 ? "Выход за пределы диапазона" : "Четное";
        }
        else answ = "Нечетное";
        System.out.println(answ);
    }
}
