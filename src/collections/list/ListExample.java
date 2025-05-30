package collections.list;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

// Интерфейс List из коллекций (Collections FrameWork) представляет упорядоченную
// коллекцию элементов, где могут дублироваться значения.
// Является частью пакета java.util и наследуется от интерфейса (Collections)


// 🛠️ Часто используемые методы:
// | Метод                 | Описание                    |
//| --------------------- | --------------------------- |
//| `add(E e)`            | Добавляет элемент           |
//| `add(int index, E e)` | Вставляет по индексу        |
//| `get(int index)`      | Получает элемент по индексу |
//| `remove(int index)`   | Удаляет элемент по индексу  |
//| `set(int index, E e)` | Заменяет элемент            |
//| `contains(Object o)`  | Проверяет наличие элемента  |
//| `size()`              | Возвращает размер списка    |
//| `isEmpty()`           | Проверяет, пустой ли список |


// Когда использовать List?

// Когда важен порядок элементов

// Когда возможны дубликаты

// Когда нужен индексный доступ

// Разница между ArrayList и LinkedList
// заключается в том, как они хранят данные
// как быстро выполняют разные операции
// Они оба реализуют интерфейс List, но имеют разную внутреннюю структуру.

// | Если тебе нужно...                        | Выбор          |
//| ----------------------------------------- | -------------- |
//| Быстрый доступ по индексу (`get`, `set`)  | ✅ `ArrayList`  |
//| Частые вставки/удаления в начале/середине | ✅ `LinkedList` |
//| Меньше памяти                             | ✅ `ArrayList`  |
//| Очередь или стек (FIFO / LIFO)            | ✅ `LinkedList` |


// | Операция               | `ArrayList` | `LinkedList` |
//| ---------------------- | ----------- | ------------ |
//| `get(index)`           | 🔥 Быстро   | 🐢 Медленно  |
//| `add(element)` в конец | 🔥 Быстро   | 🔥 Быстро    |
//| `add(index, element)`  | 🐢 Медленно | 🔥 Быстро    |
//| `remove(index)`        | 🐢 Медленно | 🔥 Быстро    |
//| Потребление памяти     | 👍 Меньше   | 👎 Больше    |




public class ListExample {
    public static void main(String[] args) {
        List <String> names = new ArrayList<>();
        names.add("Ahmet");
        names.add("Murat");

        List <Integer> numbersArrayList = new ArrayList<>();
        List <Integer> numbersLinkedList = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            numbersArrayList.add(0, i);
            numbersLinkedList.add(0, i);
        }

        System.out.println(numbersLinkedList);
    }
}
