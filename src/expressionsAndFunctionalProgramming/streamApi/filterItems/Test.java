package expressionsAndFunctionalProgramming.streamApi.filterItems;


import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        // Создаем список для хранение  чисел

        List <Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Вариант 1. Классический  филтрация номера без использование Stream API

        List <Integer> evenNumberClassic = FilterEvenNumbersWithoutStream.filterEvenNumbersClassic(numbers);
        List<Integer> notEvenNumbersClassic = FilterEvenNumbersWithoutStream.filterNotEvenNumbersClassic(numbers);

        // Вариант 2. Фильтрация с использованием Stream API

        List <Integer> evenNumbersWithStream = FilterEvenNumbersWithStreamApi.filterEvenNumbersWithStreamApi(numbers);
        List <Integer> notEvenNumbersWithStream = FilterEvenNumbersWithStreamApi.FilterNotEvenNumbersWithStreamApi(numbers);

        // вывод

        System.out.println("Фильтрация четные числа (классический способ) : " + evenNumberClassic);
        System.out.println("Фильтрация не четные числа (классический способ) : " + notEvenNumbersClassic);

        System.out.println("Фильтрация четные числа (Stream API) : " + evenNumbersWithStream);
        System.out.println("Фильтрация не четные числа (Stream API) : " + notEvenNumbersClassic);


    }
}
