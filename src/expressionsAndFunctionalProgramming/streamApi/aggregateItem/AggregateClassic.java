package expressionsAndFunctionalProgramming.streamApi.aggregateItem;

import java.util.List;

public class AggregateClassic {

    // 1 метод посчтитать сумму
    public static int sumAggregateClassic (List <Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }
    // 2 метод посчитать максимальный значение

    public static int maxClassic (List <Integer> numbers) {
        int max = numbers.get(0);
        for (Integer num : numbers) {
            if (num > max) max = num;
        }
        return max;
    }

    // 3 метод посчитать минимальный значение

    public static int minClassic (List <Integer> numbers) {
        int min = numbers.get(0);
        for (Integer num : numbers) {
            if (num < min) min = num;
        }
        return min;
    }

    // метод посчитать среднее значение

    public static double averageClassic (List <Integer> numbers) {
        return (double) sumAggregateClassic(numbers) / numbers.size();
    }
}
