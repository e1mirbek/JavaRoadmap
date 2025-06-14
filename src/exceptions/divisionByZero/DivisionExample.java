package exceptions.divisionByZero;
import java.util.Scanner;

// Деление на ноль
// Цель: безопасно делить два числа
public class DivisionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите певрое число : ");
            int a = scanner.nextInt();

            System.out.println("Введите чторое число : ");
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println("Результат : " + result);

        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Нельзя делить на ноль!");
        }
        System.out.println("Программа завершена ");
    }
}
