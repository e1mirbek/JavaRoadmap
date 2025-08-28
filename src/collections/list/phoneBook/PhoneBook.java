package collections.list.phoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        List <Contact> contacts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Добавить контакт\n2. Найти контакт\n3. Удалить контакт\n4. Все контакты\n5. Выйти");
            System.out.println("Ваш выбор : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Имя : ");
                    String name = scanner.nextLine();
                    System.out.println("Телефон : ");
                    String phone = scanner.nextLine();
                    contacts.add(new Contact(name, phone));
                    break;
                case 2:
                    System.out.println("Введите имя для поиска : ");
                    String findName = scanner.nextLine();
                    for (Contact contact : contacts) {
                        if (contact.name.toLowerCase().contains(findName)) {
                            System.out.println(contact);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Введите имя контакта чтобы удалить : ");
                    String deleteName = scanner.nextLine();
                    for (Contact contact : contacts) {
                        if (contact.name.toLowerCase().contains(deleteName)) {
                            contacts.remove(contact);
                        }
                    }
                    break;
                case 4:
                    for (int i  = 0; i < contacts.size(); i++) {
                        System.out.println(i + " : " + contacts.get(i));
                    }
                    break;
                case 5:
                    System.out.println("Пока !!! ");
                    break;
                default:
                    System.out.println("Неверный выбор");
            }

        }


    }
}
