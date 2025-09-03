package udemy.course.lesson10;

// Диапазоны примитивов, переполнение

public class TenthLs {
    int primitiveInt = 5;
    Integer objectInt = 5;

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int maxValue = Integer.MAX_VALUE;
        System.out.println("максимальный значение INT : " + maxValue);
        // переполнение
        maxValue = Integer.MAX_VALUE + 50;
        System.out.println("Переполнение : " + maxValue);
    }
}
