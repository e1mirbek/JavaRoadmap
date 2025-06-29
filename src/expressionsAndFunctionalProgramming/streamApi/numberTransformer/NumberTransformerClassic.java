package expressionsAndFunctionalProgramming.streamApi.numberTransformer;

import java.util.ArrayList;
import java.util.List;

public class NumberTransformerClassic {
    public static List<Integer> incrementClassic (List <Integer> numbers) {
        List <Integer>  incremented = new ArrayList<>();

        for (Integer number : numbers) {
            incremented.add(number + 1);
        }
        return incremented;
    }
}
