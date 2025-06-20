package multithreading.concurrentCollections;


// Concurrent Collections — потоко-безопасные коллекции
// Обычные коллекции
// (например, ArrayList, HashMap) не безопасны в многопоточной среде

// Вместо них
// Коллекция	          Назначение
// ConcurrentHashMap	  Безопасный HashMap
// CopyOnWriteArrayList	  Безопасный ArrayList
// ConcurrentLinkedQueue  Потокобезопасная очередь


import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap <String, Integer> map = new ConcurrentHashMap<>();
        map.put("a", 5);
        map.put("b", 10);
        System.out.println(map.get("a"));
    }
}
