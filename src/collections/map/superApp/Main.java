package collections.map.superApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordCounter wordCounter = new WordCounter();
        StudentGrades studentGrades = new StudentGrades();

        while (true) {
            System.out.println("\\n=== МЕНЮ ===");
            System.out.println("1. Подсчет слов ");
            System.out.println("2. Оценка студентов ");
            System.out.printf("Ваш выбор : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> wordCounter.countWords(scanner);
                case 2 -> studentGrades.run(scanner);
            }
        }
    }
}
