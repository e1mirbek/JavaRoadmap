package collections.list.toDoList;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Добавить задачу\n2. Удалить задачу\n3. Показать все задачи\n4. Выход");
            System.out.println("Выбор : ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice){
                case 1:
                    System.out.println("Введите задачу : ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    break;
                case 2:
                    System.out.println("Введите номер задачи для удаление : ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < tasks.size()) {
                        tasks.remove(index);
                        System.out.println("Удалено");
                    } else {
                        System.out.println("Неверный индекс");
                    }
                    break;
                case 3:
                    System.out.println("Ваши задачи : ");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println(i + " : " + tasks.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Пока !!! ");
                    return;
                default:
                    System.out.println("Неверный выбор !!!! ");

            }
        }

    }
}
