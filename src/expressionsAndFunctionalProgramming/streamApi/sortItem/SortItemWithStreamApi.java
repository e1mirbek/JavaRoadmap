package expressionsAndFunctionalProgramming.streamApi.sortItem;

import java.util.Collections;
import java.util.List;

public class SortItemWithStreamApi {


    public static List <Integer> sortNumbersStreamApi (List <Integer> numbers) {
       return numbers.stream().sorted().toList();
    }

    // Сортировка по убыванию
    public static List <Integer> sortNumbersDescendingStream (List <Integer> numbers) {
        return  numbers.stream().sorted(Collections.reverseOrder()).toList();
    }
}
