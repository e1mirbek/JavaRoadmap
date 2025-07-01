package expressionsAndFunctionalProgramming.streamApi.sortItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortItemClassic {

     // сортировка
    public static List <Integer> sortItemClassic(List <Integer> numbers) {
        List <Integer> sortedNumber = new ArrayList<>(numbers);
        Collections.sort(sortedNumber);
        return sortedNumber;
    }
}
