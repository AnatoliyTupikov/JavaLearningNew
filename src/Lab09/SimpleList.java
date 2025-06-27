package Lab09;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SimpleList {

    public static <T> Set<T> unicCollection(List<T> income) {
        Set<T> result = new HashSet<>();
        for (T el : income) {
            result.add(el);
        }
        return result;
    }

    private static  <T> List<T> fillUpMillion(List<T> income){
        for (int i = 0; i <1000000; i++){
            income.add();
        }
    }
    public static <T> void getMillionArrayList (List<T> arrayL, List<T> linkedL){

    }

}
