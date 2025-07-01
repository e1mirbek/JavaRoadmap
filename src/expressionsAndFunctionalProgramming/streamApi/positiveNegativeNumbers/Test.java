package expressionsAndFunctionalProgramming.streamApi.positiveNegativeNumbers;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List <Integer> numbers = Arrays.asList(-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List <Integer> positiveNumbersClassic = PositiveNegativeNumbersClassic.positiveNumber(numbers);

        List <Integer> negativeNumbersClassic = PositiveNegativeNumbersClassic.negativeNumber(numbers);

        List <Integer> positiveNumbersStreamApi = PositiveNegativeNumbersStreamApi.positiveNumbers(numbers);

        List <Integer> negativeNumbersStreamApi = PositiveNegativeNumbersStreamApi.negativeNumbers(numbers);

        System.out.println("Полажительные числа (Classic) : " + positiveNumbersClassic);
        System.out.println("Отрицательные числа (Classic) : " + negativeNumbersClassic);
        System.out.println("Полажительные числа (StreamApi) : " + positiveNumbersStreamApi);
        System.out.println("Отрицательные числа (StreamApi) : " + negativeNumbersStreamApi);
    }
}
