package expressionsAndFunctionalProgramming.streamApi.aggregateItem;

import java.util.List;

public class AggregateWithStreamApi {

    //  1 метод посчитать сумму
    public static int sumNumberStreamApi (List <Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    // 2 метод посчитать максимальный значение
    public static  int maxNumberStreamApi (List <Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).max().orElseThrow(() -> new IllegalArgumentException("Ошибка список пуст !!! "));
    }

    // 3 метод посчитать минимальный значение
    public  static int minNumberStreamApi (List <Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).min().orElseThrow(() -> new IllegalArgumentException("Ошибка спмисок пуст !!! "));
    }

    // 4 метод посчитать среднее значение
    public static double averageNumbersStreamApi (List <Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).average().orElseThrow(() -> new IllegalArgumentException("Ошибка список пуст !!! "));
    }
}

