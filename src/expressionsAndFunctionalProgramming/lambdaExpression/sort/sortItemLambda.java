package expressionsAndFunctionalProgramming.lambdaExpression.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortItemLambda {
    public static void main(String[] args) {
        List <String> name = Arrays.asList("Саня", "Катя", "Виталик");
        Collections.sort(name, (a, b) -> a.compareTo(b));
        System.out.println(name);
    }
}
