package collections.set;

// Set - одно из ключевых структур данных,
// часто используется для хранение уникальных элементов
// Set - интерфейс (хранит только уникальные элементы (никаких дубликатов)
// Не гарантирует порядок (в зависимости от реализаций)
// HashSet — самый популярный, неупорядоченное хранение.
// LinkedHashSet — сохраняет порядок добавления.
// TreeSet — хранит элементы в отсортированном порядке (по возрастанию).

// // 🧺 Часто используемые методы Set:
/// // | Метод                          | Описание                                                |
/// // |-------------------------------|---------------------------------------------------------|
/// // | `add(E e)`                    | Добавляет элемент в множество (если ещё не существует)  |
/// // | `addAll(Collection<? extends E> c)` | Добавляет все элементы из другой коллекции       |
/// // | `remove(Object o)`            | Удаляет указанный элемент                              |
/// // | `removeAll(Collection<?> c)`  | Удаляет все элементы, содержащиеся в указанной коллекции|
/// // | `retainAll(Collection<?> c)`  | Оставляет только те элементы, которые есть в другой коллекции |
/// // | `contains(Object o)`          | Проверяет наличие элемента                             |
/// // | `containsAll(Collection<?> c)`| Проверяет, содержатся ли все элементы другой коллекции |
/// // | `isEmpty()`                   | Проверяет, пусто ли множество                          |
/// // | `size()`                      | Возвращает количество элементов                        |
/// // | `clear()`                     | Удаляет все элементы                                   |
/// // | `iterator()`                  | Возвращает итератор для перебора элементов             |
/// // | `toArray()`                   | Преобразует Set в массив                               |
/// // | `equals(Object o)`            | Проверяет равенство двух множеств                      |
/// // | `hashCode()`                  | Возвращает хэш-код множества                           |

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args){
        // Пример 1: HashSet — базовое использование
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // дубликат не добавится

        System.out.println("fruits : " + fruits);
        System.out.println("Contains Banana? " + fruits.contains("Banana"));
        fruits.remove("Orange");
        System.out.println("After removal: " + fruits);


        // Пример 2: LinkedHashSet — порядок сохраняется
        Set<String> names = new LinkedHashSet<>();
        names.add("Elmirbek");
        names.add("Elmir");
        names.add("Emir");

        System.out.println("Names : " + names);

        // Пример 3: TreeSet — сортировка по алфавиту
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(44);
        numbers.add(15);
        numbers.add(4);
        numbers.add(77);
        System.out.println("Sort : " + numbers);
    }
}
