package expressionsAndFunctionalProgramming.streamApi.numberTransformer;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List <Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List <Integer> classicResult = NumberTransformerClassic.incrementClassic(numbers);
        List <Integer> streamApiResult = NumberTransformerWithStreamApi.incrementWithStreamApi(numbers);

        // result

        System.out.println("Классический способ преобразование данных : " + classicResult);
        System.out.println("Stream api result : " + streamApiResult);
    }
}
