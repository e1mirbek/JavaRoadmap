package oop.encapsulation.calculate;

import java.util.Scanner;

public class CalculateImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculate calculate = new Calculate();
        boolean running = true;
        while (running) {
            System.out.println("\n=== Калькулятор ===");
            System.out.println("1 - Сложение ");
            System.out.println("2 - Вычитание ");
            System.out.println("3 - Умнажение ");
            System.out.println("4 - Деление ");
            System.out.println("5 - Остаток от деление ");
            System.out.println("6 - Сброс результата " );
            System.out.println("7 - Показать результат ");
            System.out.println("0 - Выход");
            System.out.println("Выберите операцию : ");
            int operation = scanner.nextInt();
            scanner.nextLine();

            if (operation == 0) {
                running = false;
                continue;
            }

            if (operation != 6 && operation != 7) {
                System.out.println("Введите число : ");
                double number = scanner.nextDouble();
                scanner.nextLine();
            switch (operation) {
                case 1:
                   calculate.addition(number);
                   calculate.displayCalculate();
                    break;
                case 2:
                    calculate.subtraction(number);
                    calculate.displayCalculate();
                    break;
                case 3:
                    calculate.multiplication(number);
                    calculate.displayCalculate();
                    break;
                case 4:
                     if (number != 0) {
                         calculate.division(number);
                     } else {
                         System.out.println("Ошибка : деление на ноль !!! ");
                     }
                     calculate.displayCalculate();
                     break;
                case 5:
                    if (number != 0) {
                       calculate.mod(number);
                    } else {
                        System.out.println("Ошибка : деление на ноль !!! ");
                    }
                    calculate.displayCalculate();
                    break;
                default:
                    System.out.println("Ошибка : Неверный выбор");
            }
            } else if (operation == 6) {
                calculate.reset();
                System.out.println("Результат сброшен до 0");
                calculate.displayCalculate();
            } else if (operation == 7) {
                calculate.displayCalculate();
            }
        }
        scanner.close();
        System.out.println("Программа Calculate завершил работу !!! ");
    }
}
