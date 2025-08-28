package udemy.course.lesson1;

import java.math.BigDecimal;
import java.math.BigInteger;


public class FinalExample {
    public static void main(String[] args) {
        // Максимальное значение типа long
        long maxLong = Long.MAX_VALUE;
        System.out.println("maxLong = " + maxLong);

        long numbers = 9223372036854775807L;
        System.out.println("numbers = " + numbers);

        // Константы BigInteger
        BigInteger one = BigInteger.ONE;
        System.out.println("one = " + one);

        // Создание больших чисел
        BigInteger bigInteger1 = new BigInteger("10000000000000000000000000");
        BigInteger bigInteger2 = new BigInteger("9223372036854775808");

        // Умножение
        BigInteger result1 = bigInteger1.multiply(new BigInteger("10"));
        BigInteger result2 = bigInteger2.multiply(new BigInteger("5"));

        System.out.println("Результат умножения bigInteger1 * 10 = " + result1);
        System.out.println("Результат умножения bigInteger2 * 5 = " + result2);

        // BigDecimal пример
        BigDecimal bigDecimal1 = new BigDecimal("12345.6789");
        BigDecimal bigDecimal2 = new BigDecimal("0.1");
        BigDecimal decimalResult = bigDecimal1.multiply(bigDecimal2);
        System.out.println("Результат BigDecimal: " + decimalResult);

        doSomething();
    }

    static void doSomething() {
        System.out.println("Hello Java !!!");
        final int number = 42;
        System.out.println("final number = " + number);
    }
}
