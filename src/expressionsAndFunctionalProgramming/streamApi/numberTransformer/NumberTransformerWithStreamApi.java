package expressionsAndFunctionalProgramming.streamApi.numberTransformer;
import java.util.List;

public class NumberTransformerWithStreamApi {
    public static List <Integer> incrementWithStreamApi (List <Integer> numbers) {
        List <Integer> incrementStreamApi = numbers.stream()
                .map(n -> n +1 ).toList();
        return incrementStreamApi;
    }
}
