package Lab09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class SimpleList {

    public static <T> Set<T> unicCollection(List<T> income) {
        Set<T> result = new HashSet<>();
        for (T el : income) {
            result.add(el);
        }
        return result;
    }

    public static List<Integer> fillUpMillion(List<Integer> income) {
        for (int i = 0; i < 1000000; i++) {
            income.add(ThreadLocalRandom.current().nextInt(-10, 11));
        }
        return income;
    }

    public static void listSpeedTest(List<Integer> income) {
        var startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            income.get(ThreadLocalRandom.current().nextInt(0, income.size()));
        }
        var endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

    }

}
