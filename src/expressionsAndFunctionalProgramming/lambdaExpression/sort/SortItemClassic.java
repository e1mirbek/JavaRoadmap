package expressionsAndFunctionalProgramming.lambdaExpression.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortItemClassic {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Аня", "Саша", "Ваня");

        // Сортировка с анонимным компаратором
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        System.out.println(names);
    }
}
