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

    private static List<Integer> fillUpMillion(List<Integer> income){
        for (int i = 0; i <1000000; i++){
            income.add(ThreadLocalRandom.current().nextInt(-10, 11));
        }
        return income;
    }
    public static ArrayList<Integer> getMillionArrayList (){
        var res = new ArrayList<Integer>();
        return fillUpMillion(res);
    }

}
