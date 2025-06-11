package collections.set.sortedNamesApp;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// Автоматический сортировка имен
public class SortedNamesApp {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Введите имена. Введите 'Стоп' для завершения.");
        while (true) {
            System.out.println("Имя: ");
            name = scanner.nextLine();
            if (name.equalsIgnoreCase("Стоп")) break;
            names.add(name);
        }
        System.out.println("\nИмена в отсортированном порядке: ");
        System.out.println(names);
        System.out.println("\nИмена в отсортированном порядке: ");
        for (String s : names) {
            System.out.println(s);
        }
        scanner.close();
    }
}
