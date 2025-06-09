package collections.map.superApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    private final Map<String, String> contacts = new HashMap<>();

    public PhoneBook() {
        contacts.put("Айбек", "0500123456");
        contacts.put("Элмира", "0700987654");
    }

    public void run(Scanner scanner) {
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        if (contacts.containsKey(name)) {
            System.out.println("Номер: " + contacts.get(name));
        } else {
            System.out.print("Контакт не найден. Добавить новый? (y/n): ");
            if (scanner.nextLine().equalsIgnoreCase("y")) {
                System.out.print("Введите номер: ");
                String number = scanner.nextLine();
                contacts.put(name, number);
                System.out.println("Контакт добавлен.");
            }
        }
    }
}
