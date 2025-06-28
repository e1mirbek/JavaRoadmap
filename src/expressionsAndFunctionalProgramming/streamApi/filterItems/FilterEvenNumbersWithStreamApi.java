package expressionsAndFunctionalProgramming.streamApi.filterItems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbersWithStreamApi {

    // метод для определения четных чисел с помощью Stream API

    public static List <Integer> filterEvenNumbersWithStreamApi (List <Integer> numbers) {

        List <Integer> evenNumbers = numbers.stream()         // получаем паток из списка
                .filter(n -> n % 2 == 0)              // фильтруем - оставляем только четное числа
                .collect(Collectors.toList());                // собрать результат в список
        return evenNumbers;
    }

    // метод определения не четныъх чисел (Stream API)
    public static List <Integer> FilterNotEvenNumbersWithStreamApi (List <Integer> numbers) {
        List <Integer> notEvenNumbers = numbers.stream().filter(n -> n % 2 != 0).toList();
        return notEvenNumbers;
    }
}
