package expressionsAndFunctionalProgramming.streamApi.aggregateItem;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List <Integer> numbers = Arrays.asList(5, 6, 9, 8, 5, 2, 55, 18);

        // определение обьектов
       int sumNumber = AggregateClassic.sumAggregateClassic(numbers);
       int maxNumber = AggregateClassic.maxClassic(numbers);
       int minNumber = AggregateClassic.minClassic(numbers);
       double averageNumber = AggregateClassic.averageClassic(numbers);
       int sumNumberStreamApi = AggregateWithStreamApi.sumNumberStreamApi(numbers);
       int maxNumberStreamApi = AggregateWithStreamApi.maxNumberStreamApi(numbers);
       int minNumbersStreamApi = AggregateWithStreamApi.minNumberStreamApi(numbers);
       double averageStreamApi = AggregateWithStreamApi.averageNumbersStreamApi(numbers);

       // Вывод
        System.out.println("Сумма (Classic) : " + sumNumber);
        System.out.println("Максимальный значение (Classic) : " + maxNumber );
        System.out.println("Минимальный значение (Classic) : " + minNumber);
        System.out.println("Среднее значение (Classic) : " + averageNumber);
        System.out.println("Сумма (StreamApi) : " + sumNumberStreamApi);
        System.out.println("Максимальный значение (StreamApi) : " + maxNumberStreamApi );
        System.out.println("Минимальный значение (StreamApi) : " + minNumbersStreamApi);
        System.out.println("Среднее значение (StreamApi) : " + averageStreamApi);
    }
}

