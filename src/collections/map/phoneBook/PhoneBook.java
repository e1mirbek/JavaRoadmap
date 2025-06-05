package collections.map.phoneBook;

// Программа реализует простую телефонную книгу.
// Она позволяет пользователю ввести имя и получить соответствующий номер телефона,
// если такое имя существует в базе.
// Демонстрируется работа с отображениями (Map) и пользовательским вводом.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Элмирбек", "+996 701 468 346");
        phoneBook.put("Адилет", "+996 505 777 876");
        phoneBook.put("Кайрат", "+996 776 879 564");
        System.out.println("Введите имя : ");
        String name = scanner.nextLine();

        if (phoneBook.containsKey(name)) {
            System.out.println("Имя : " + name);
            System.out.println("Номер : " + phoneBook.get(name));
        } else {
            System.out.println("Такой контакт не найден.");
        }
    }
}
