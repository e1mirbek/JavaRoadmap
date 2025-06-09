package collections.map.superApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        InventoryManager inventoryManager = new InventoryManager();
        WordCounter wordCounter = new WordCounter();
        StudentGrades studentGrades = new StudentGrades();

        while (true) {
            System.out.println("\\n=== МЕНЮ ===");
            System.out.println("1. Подсчет слов ");
            System.out.println("2. Оценка студентов ");
            System.out.println("3. Телефон номер");
            System.out.println("4. Магазин");
            System.out.printf("Ваш выбор : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> wordCounter.countWords(scanner);
                case 2 -> studentGrades.run(scanner);
                case 3 -> phoneBook.run(scanner);
                case 4 -> inventoryManager.run(scanner);
                default -> System.out.println("Неверный выбор");
            }
        }
    }
}
