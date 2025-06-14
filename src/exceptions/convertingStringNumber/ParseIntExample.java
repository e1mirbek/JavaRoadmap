package exceptions.convertingStringNumber;
import java.util.Scanner;

// Преобразование строки в число
// Цель: не падать, если пользователь вводит не число
public class ParseIntExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите число : ");
            String input = scanner.nextLine();
            int myNumber = Integer.parseInt(input);
            System.out.println("Вы ввели число " + myNumber);
        } catch (NumberFormatException e){
            System.out.println("Ошибка: Введите корректное число!");
        }
    }
}
