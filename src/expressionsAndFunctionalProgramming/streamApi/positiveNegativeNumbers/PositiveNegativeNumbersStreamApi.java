package expressionsAndFunctionalProgramming.streamApi.positiveNegativeNumbers;

import java.util.List;

public class PositiveNegativeNumbersStreamApi {

    // полажительные числа
    public static List<Integer> positiveNumbers (List <Integer> numbers) {
        return numbers.stream().filter(n -> n > 0).toList();
    }

    // отрицательные числа
    public static List <Integer> negativeNumbers (List <Integer> numbers) {
        return numbers.stream().filter(n -> n < 0).toList();
    }
}
