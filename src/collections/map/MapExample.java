package collections.map;

// map - это структура данных которая хранит пары <<ключ - значение>>
// пример с теорией
// "apple" -> "яблоко"
// "banana" -> "банан"

// ❗у каждого ключа есть свое значение
// 🔹 Где используется ?
// Когда нужно хранит данные,
// связанные друг с другом,
// и быстро находить значение по ключу
// Например:
// Логин → Пароль
// Имя → Возраст
// ID → Объект

// 🔹 В Java это интерфейс Map<K, V>
// K — тип ключа
// V — тип значения
// Наиболее популярная реализация: HashMap.

// // 🗺️ Часто используемые методы Map:
/// / | Метод                            | Описание                                           |
/// / | -------------------------------- | -------------------------------------------------- |
/// / | `put(K key, V value)`            | Добавляет или обновляет значение по ключу         |
/// / | `get(Object key)`                | Возвращает значение по ключу                      |
/// / | `remove(Object key)`             | Удаляет элемент по ключу                          |
/// / | `containsKey(Object key)`        | Проверяет наличие ключа                           |
/// / | `containsValue(Object value)`    | Проверяет наличие значения                        |
/// / | `isEmpty()`                      | Проверяет, пуста ли карта                         |
/// / | `size()`                         | Возвращает количество элементов                   |
/// / | `clear()`                        | Очищает карту                                     |
/// / | `keySet()`                       | Возвращает множество ключей                       |
/// / | `values()`                       | Возвращает коллекцию значений                    |
/// / | `entrySet()`                     | Возвращает множество пар ключ-значение            |
/// / | `getOrDefault(Object key, V def)`| Возвращает значение или значение по умолчанию     |
/// / | `putIfAbsent(K key, V value)`    | Добавляет значение, если ключ отсутствует         |
/// / | `replace(K key, V value)`        | Заменяет значение, если ключ существует           |
/// / | `compute(K key, BiFunction)`     | Обновляет значение по ключу                       |
/// / | `computeIfAbsent(K key, Func)`   | Вычисляет значение, если ключ отсутствует         |
/// / | `computeIfPresent(K key, BiFunc)`| Обновляет значение, если ключ присутствует        |
/// / | `merge(K key, V value, BiFunc)`  | Объединяет новое и существующее значения          |


import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();

        ages.put("Elmirbek", 19);
        ages.put("Adilet", 18);
        ages.put("Kayrat", 17);

        // получить значение по ключу
        int age = ages.get("Elmirbek");
        System.out.println("Возраст Элмибека : " + age);

        // проверка, есть ли ключ
        if (ages.containsKey("Elmirbek")) {
            System.out.println("Элмирбек есть в списке");
        }

        // Перебор всех элементов
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


        // удаление по ключу
        ages.remove("Adilet");
        System.out.println("После удаления Адилета : ");
        System.out.println(ages);

        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println("Ключ : " + entry.getKey() + " Значение : " + entry.getValue());
        }
    }
}
