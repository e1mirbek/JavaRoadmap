package expressionsAndFunctionalProgramming.streamApi.positiveNegativeNumbers;

import java.util.ArrayList;
import java.util.List;

public class PositiveNegativeNumbersClassic {

    // метод для определения положительных чисел

    public static List <Integer> positiveNumber (List <Integer> numbers) {
        List <Integer> positiveNumber = new ArrayList<>();
        for (Integer num : numbers) {
            if (num > 0) {
                positiveNumber.add(num);
            }
        }
        return positiveNumber;
    }

    // метод для определения отрицательных чисел

    public  static List <Integer> negativeNumber (List <Integer> numbers) {

        List <Integer> negativeNumbers = new ArrayList<>();

        for (Integer num : numbers) {
            if (num < 0) {
                negativeNumbers.add(num);
            }
        }

        return negativeNumbers;

    }

}
