package collections.map.superApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryManager {
    private final Map<String, Integer> inventory = new HashMap<>();

    public InventoryManager() {
        inventory.put("Молоко", 10);
        inventory.put("Хлеб", 20);
        inventory.put("Яблоко", 30);
    }

    public void run(Scanner scanner) {
        System.out.print("Введите товар: ");
        String item = scanner.nextLine();

        if (inventory.containsKey(item)) {
            int count = inventory.get(item);
            if (count > 0) {
                inventory.put(item, count - 1);
                System.out.println("Покупка успешна. Осталось: " + inventory.get(item));
            } else {
                System.out.println("Нет в наличии.");
            }
        } else {
            System.out.print("Добавить новый товар? (y/n): ");
            if (scanner.nextLine().equalsIgnoreCase("y")) {
                System.out.print("Введите количество: ");
                int qty = scanner.nextInt();
                scanner.nextLine();
                inventory.put(item, qty);
                System.out.println("Добавлено.");
            }
        }
    }
}
