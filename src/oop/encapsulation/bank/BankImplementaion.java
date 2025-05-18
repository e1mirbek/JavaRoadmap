package oop.encapsulation.bank;
import java.util.Scanner;

public class BankImplementaion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создание счета
        System.out.println("Добро пожаловать в Банк");
        System.out.println("Напишите номер счета : ");
        String accountNumber = scanner.nextLine();

        System.out.println("Введите имя владельца : ");
        String ownerName = scanner.nextLine();

        System.out.println("Введите начальный баланс : ");
        double balance = scanner.nextDouble();
        scanner.nextLine();

        Bank bank = new Bank(accountNumber, ownerName, balance);

        // меню для операций

        boolean exit = false;
        while (!exit) {
            System.out.println("\n Выберите операцию : ");
            System.out.println("1 - Показать информацию о счете ");
            System.out.println("2 - Пополнить счет ");
            System.out.println("3 - Снять деньги ");
            System.out.println("4 - Изменить имя владельца ");
            System.out.println("0 - Выход");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    bank.displayAccountInfo();
                    break;
                case 2:
                    System.out.println("Введите сумму для депозита : ");
                    double depositAmount = scanner.nextDouble();
                    bank.setBalance(depositAmount);
                    break;
                case 3:
                    System.out.println("Введите сумму для снятия : ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Введите новое имя владельца : ");
                    String newOwnerName = scanner.next();
                    bank.setOwnerName(newOwnerName);
                    break;
                case 0:
                    exit = true;
                    System.out.println("Спасибо за использование нашей системы. До свидания!");
                    break;
                default:
                    System.out.println("Неверный выбор попробуйте еще раз : ");
            }
        }
        scanner.close();
    }
}
