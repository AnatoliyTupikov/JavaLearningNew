package Lab09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] ars) {
        List<String> income = Arrays.asList("a", "d", "f", "q", "d", "f", "asd", "asf", "asd");
        System.out.println(SimpleList.unicCollection(income));

        List<Integer> intIncome = Arrays.asList(1, 2, 11, 2, 4, 5, 7);
        System.out.println(SimpleList.unicCollection(intIncome));

        ArrayList<Integer> arrL = new ArrayList<>();
        SimpleList.fillUpMillion(arrL);
        System.out.println("Array list timer:");
        SimpleList.listSpeedTest(arrL);

//        LinkedList<Integer> linkL = new LinkedList<>();
//        SimpleList.fillUpMillion(linkL);
//        System.out.println("Linked list timer:");
//        SimpleList.listSpeedTest(linkL);

        User petya = new User("Петя");
        User ivan = new User("Иван");
        User seva = new User("Сева");

        Game gameSession = new Game(petya, ivan, seva);
        gameSession.showPoints();


    }
}
