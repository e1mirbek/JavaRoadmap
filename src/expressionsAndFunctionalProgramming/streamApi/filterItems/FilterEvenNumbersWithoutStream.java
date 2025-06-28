package expressionsAndFunctionalProgramming.streamApi.filterItems;

import java.util.ArrayList;
import java.util.List;

public class FilterEvenNumbersWithoutStream {

    // метод для определения четных чисел

    public static List <Integer> filterEvenNumbersClassic(List <Integer> numbers) {

        List <Integer> evenNumbers = new ArrayList<>();

        // Проходим по всем числам и проверяем на четность

        for (Integer num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num); // Добавляем четные числа в новый список
            }
        }
        return evenNumbers;
    }

    // метод для определения не четных чисел

    public static List <Integer> filterNotEvenNumbersClassic (List <Integer> numbers) {

        List <Integer> notEvenNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 != 0) {
                notEvenNumbers.add(number);
            }
        }
        return notEvenNumbers;
    }

}
