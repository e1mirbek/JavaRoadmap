package collections.map.inventoryManager;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Молоко", 75);
        inventory.put("Хлеб", 25);
        inventory.put("Яблоко", 30);
        inventory.put("Груша", 45);
        System.out.println(inventory);
        System.out.println("Выберите товар для покупки : ");
        String item = scanner.nextLine();
        if (inventory.containsKey(item)) {
            int count = inventory.get(item);
            if (count > 0) {
                inventory.put(item, count - 1);
                System.out.println("Покупка успешно ! Осталось : " + inventory.get(item));
            } else {
                System.out.println("Товар нет в наличий.");
            }
        } else {
            System.out.println("Такого товара нет в нашем магазине !!! ");
        }
    }

}
