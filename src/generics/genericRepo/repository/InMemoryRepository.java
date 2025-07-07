package generics.genericRepo.repository;

import generics.genericRepo.model.Entity;

import java.util.HashMap;
import java.util.Map;

public class InMemoryRepository <T extends Entity> implements Repository <T> {

    private final Map <Long, T> storage = new HashMap<>();

    // T — это любой объект, но с одним важным условием.
    // 📌 Правильная формулировка:
    // T — это любой класс (объектный тип), который реализует интерфейс Entity

    @Override
    public void save(T entity) {
        storage.put(entity.getId(), entity);
        System.out.println("Сохранено" + entity);
    }

    @Override
    public T findById(Long id) {
        T entity = storage.get(id);
        System.out.println("Найдено : " + entity);
        return entity;
    }

    @Override
    public void delete(Long id) {
        T removed = storage.remove(id);
        System.out.println(removed != null ? " Удалено: " + removed : " Сущность с идентификатором" + id + " Не найдено");
    }
}
