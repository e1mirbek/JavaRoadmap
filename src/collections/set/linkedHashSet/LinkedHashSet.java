package collections.set.linkedHashSet;


import java.util.Scanner;
import java.util.Set;

// сохранение порядка добавления
public class LinkedHashSet {
    public static void main(String[] args) {
        Set<String> words = new java.util.LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова. Введите 'Конец' для завершения");
        String word;

        while (true) {
            System.out.println("Слово : ");
            word = scanner.nextLine();
            if (word.equalsIgnoreCase("Конец")) break;
            words.add(word);
        }

        // Слово в порядке ввода
        System.out.println(words);
        for (String order : words) {
            System.out.println("\nСлово в порядке ввода : ");
            System.out.println(words);
        }
        scanner.close();
    }
}
