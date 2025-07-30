package expressionsAndFunctionalProgramming.streamApi.sortItem;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {

        // Список для сортировки номера
        List <Integer> numbers = Arrays.asList(7, 3, 9, 8, 2, 4, 1, 5, 6, 10);

        List <Integer> sortNumberClassic = SortItemClassic.sortItemClassic(numbers);
        List <Integer> sortNumberStreamApi = SortItemWithStreamApi.sortNumbersStreamApi(numbers);
        List <Integer> sortNumbersDescendingStreamApi = SortItemWithStreamApi.sortNumbersDescendingStream(numbers);

        // Вывод

        System.out.println("Классический сортировка : " + sortNumberClassic);
        System.out.println("Сортировка Stream APi : " + sortNumberStreamApi);

        System.out.println("Сортировка по убыванию : " + sortNumbersDescendingStreamApi);

    }

}
