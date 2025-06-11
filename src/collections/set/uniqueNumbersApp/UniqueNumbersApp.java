package collections.set.uniqueNumbersApp;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// уникальные числа, вводимые пользователем
public class UniqueNumbersApp {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("Введите целые числа. -1 для завершения : ");
        while (true) {
            System.out.println("Число : ");
            input = scanner.nextInt();
            if (input == -1) break;

            if (numbers.add(input)) {
                System.out.println("Число добавлено !!! ");
            } else {
                System.out.println("Это число уже было введено.");
            }
            System.out.println("Уникальные числа : ");
            for (int number : numbers) {
                System.out.println("\nУникальные числа : ");
                System.out.println(numbers);
            }
        }
    }
}
